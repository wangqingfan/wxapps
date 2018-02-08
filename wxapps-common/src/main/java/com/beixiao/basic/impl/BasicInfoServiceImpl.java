package com.beixiao.basic.impl;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.codehaus.xfire.attachments.Attachments;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.beixiao.activity.domain.Activity;
import com.beixiao.activity.service.ActivityService;
import com.beixiao.attachment.domain.Attachment;
import com.beixiao.attachment.service.AttachmentService;
import com.beixiao.bankinfo.domain.BankInfo;
import com.beixiao.bankinfo.service.BankInfoService;
import com.beixiao.basic.BasicInfoService;
import com.beixiao.common.ReturnInfo;
import com.beixiao.common.cache.ThreadLocalMap;
import com.beixiao.common.util.ValidateUtil;
import com.beixiao.customercard.domain.CustomerCard;
import com.beixiao.customercard.service.CustomerCardService;
import com.beixiao.product.domain.Product;
import com.beixiao.restaurant.domain.Restaurant;
import com.beixiao.restaurant.service.RestaurantService;
import com.beixiao.shop.domain.Shop;
import com.beixiao.shop.dto.BasicInfo;
import com.beixiao.shop.service.ShopService;
import com.beixiao.system.domain.MiniApps;
import com.beixiao.system.service.MiniAppsService;

@Service
public class BasicInfoServiceImpl implements BasicInfoService{

	@Resource
	private MiniAppsService miniAppsService;
	@Resource
	private ShopService shopService;
	@Resource
	private BankInfoService bankInfoService;
	@Resource
	private CustomerCardService customerCardService;
	@Resource
	private RestaurantService restaurantService;
	@Resource
	private AttachmentService attachmentService;
	@Resource
	private ActivityService activityService;
	
	@Override
	@Transactional(readOnly=false,rollbackFor=Exception.class,propagation=Propagation.REQUIRED)
	public ReturnInfo saveOrUpdateBasic(MiniApps miniApps,Shop shop,BankInfo bankInfo,CustomerCard customerCard,Restaurant restaurant,Map<String,Object> param) {
		String flag = (String)param.get("flag");
		String act = (String)param.get("activities");
		JSONArray array = JSONArray.parseArray(act);
		if(!ValidateUtil.isEmpty(flag) && !"edit".equals(flag)){
			//新增
			//小程序
			miniApps.setCreateTime(new Date());
			miniApps.setAppState(MiniApps.APP_STATE_YES);
			miniAppsService.insert(miniApps);
			//银行信息
			bankInfo.setCountry(BankInfo.COUNTRY_CHINA);
			bankInfoService.insert(bankInfo);
			//客户卡信息
			customerCard.setBankId(bankInfo.getBankId());
			customerCard.setCreateTime(new Date());
			customerCard.setLstMdfTime(new Date());
			customerCard.setBindCard(CustomerCard.BIND_CARD_YES);//绑卡
			customerCardService.insert(customerCard);
			//商户信息
			shop.setCreateTime(new Date());
			shop.setLstModTime(new Date());
			shop.setMiniAppId(miniApps.getMiniAppId());
			shop.setClientCardId(customerCard.getCustomerCardId()); 
			if(shop.getShopType() == Shop.SHOP_TYPE_RESTAURANT){
				//餐厅，设置产品为菜品
				shop.setProductId(Product.PRODUCT_ID_DISHES);
			}
			shopService.insert(shop);
			//餐厅
			if(!ValidateUtil.isEmpty(restaurant)){
				restaurant.setCreateTime(new Date());
				restaurant.setLstModTime(new Date());
				restaurant.setBussinessState(Restaurant.BUSS_STATE_YES);
				restaurant.setShopId(shop.getShopId());
				restaurantService.insert(restaurant);
			}
			if(!ValidateUtil.isEmpty(param.get("ids"))){
				//插入附件
				Attachment attachment = new Attachment();
				attachment.setShopId(shop.getShopId());
				String ids = (String)param.get("ids");
				attachment.setIds(ids.split(","));
				attachmentService.updateByIds(attachment);
			}
			//插入活动
			if(!ValidateUtil.isEmpty(array)){
				for(int i =0;i<array.size();i++){
					JSONObject json = array.getJSONObject(i);
					Activity activity = new Activity();
					activity.setContent(json.getString("content"));
					activity.setCreateTime(new Date());
					activity.setLstModTime(new Date());
					activity.setCreateAuthorId((Integer)ThreadLocalMap.get("adminId"));
					activity.setCreateAuthorName((String)ThreadLocalMap.get("adminName"));
					activity.setState(Activity.STATE_YES);
					activity.setShopId(shop.getShopId());
					activityService.insert(activity);
				}
			}
		}else{
			//编辑
			Shop findByAppId = shopService.findByAppId(miniApps.getAppId());
			//更新商户信息
			shop.setShopId(findByAppId.getShopId());
			shopService.update(shop);
			//更新客户卡信息
			customerCard.setCustomerCardId(findByAppId.getClientCardId());
			customerCardService.update(customerCard);
			//更新银行信息
			BankInfo findByCustomerCardId = bankInfoService.findByCustomerCardId(findByAppId.getClientCardId());
			bankInfo.setBankId(findByCustomerCardId.getBankId());
			bankInfoService.update(bankInfo);
			//更新餐厅信息
			restaurant.setShopId(findByAppId.getShopId());
			restaurantService.updateByShopId(restaurant);
			String ids = (String)param.get("ids");
			if(!ValidateUtil.isEmpty(ids)){
				//插入附件
				Attachment attachment = new Attachment();
				attachment.setShopId(findByAppId.getShopId());
				attachment.setIds(ids.split(","));
				attachmentService.updateByIds(attachment);
			}
			//先删除全部然后再重新更新
			activityService.deleteAll(findByAppId.getShopId());
			//插入活动
			if(!ValidateUtil.isEmpty(array)){
				for(int i =0;i<array.size();i++){
					//新增的id为空
					JSONObject json = array.getJSONObject(i);
					Activity activity = new Activity();
					activity.setContent(json.getString("content"));
					activity.setCreateTime(new Date());
					activity.setLstModTime(new Date());
					activity.setCreateAuthorId((Integer)ThreadLocalMap.get("adminId"));
					activity.setCreateAuthorName((String)ThreadLocalMap.get("adminName"));
					activity.setState(Activity.STATE_YES);
					activity.setShopId(shop.getShopId());
					if(!ValidateUtil.isEmpty(json.getInteger("id"))){
						activity.setActivityId(json.getInteger("id"));
						activityService.update(activity);
					}else{
						activityService.insert(activity);
					}
				}
			}
		}
		
		//清除
		ThreadLocalMap.remove();
		return ReturnInfo.toPostReturn(ReturnInfo.CODE_SUCCESS, null);
	}
}
