package com.beixiao.wechat.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.beixiao.common.util.ValidateUtil;
import com.beixiao.dishes.domain.Dishes;
import com.beixiao.dishes.service.DishesService;
import com.beixiao.product.domain.Product;
import com.beixiao.shop.domain.Shop;
import com.beixiao.shop.service.ShopService;
import com.beixiao.wechat.dto.WechatResponse;
import com.beixiao.wechat.service.WechatProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class WechatProductServiceImpl implements WechatProductService{
	
	@Resource
	private ShopService shopService;
	@Resource
	private DishesService dishesService;
	
	@Override
	public WechatResponse<PageInfo<Dishes>> findProductByShopId(@RequestParam Map<String,Object> param) {
		Integer shopId = Integer.parseInt((String)param.get("shopId"));
		Integer pageNum = Integer.parseInt((String)param.get("pageNum"));
		Integer pageSize = Integer.parseInt((String)param.get("pageSize"));
		WechatResponse<PageInfo<Dishes>> response = null;
		Shop shop = shopService.findById(shopId);
		if(Product.PRODUCT_ID_DISHES == shop.getProductId()){
			//产品为菜品，查询所有菜品
			PageHelper.startPage(pageNum, pageSize);
			List<Dishes> dishes = dishesService.findByShopId(shopId);
			PageInfo<Dishes> page = new PageInfo<Dishes>(dishes);
			if(!ValidateUtil.isEmpty(dishes)){
				response = new WechatResponse<PageInfo<Dishes>>(WechatResponse.SUCCESS_CODE, "查询成功", page);
			}else{
				response = new WechatResponse<PageInfo<Dishes>>(WechatResponse.SERVICE_DATA_ERROR_CODE, "查询不到对应的菜品");
			}
		}
		return response;
		
	}
}
