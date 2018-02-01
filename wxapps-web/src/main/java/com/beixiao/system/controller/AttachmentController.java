package com.beixiao.system.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.beixiao.attachment.domain.Attachment;
import com.beixiao.attachment.service.AttachmentService;
import com.beixiao.common.ReturnInfo;
import com.beixiao.common.util.ValidateUtil;

@Controller
@RequestMapping("/attachment")
public class AttachmentController {

	private Logger logger = LoggerFactory.getLogger(AttachmentController.class);
	
	@Resource
	private AttachmentService attachmentService;
	
	@RequestMapping("/upload")
	@ResponseBody
	public Object upload(@RequestParam Map<String,Object> param,@RequestParam("file") CommonsMultipartFile[] files){
		String type = (String)param.get("type");
		String upload = "";
		logger.info("------type--------"+type);
		if(!ValidateUtil.isEmpty(files)){
			try {
				upload = attachmentService.upload(Integer.parseInt(type), files);
			} catch (Exception e) {
				logger.error("-----------upload------发生错误",e);
				return ReturnInfo.toPostReturn(ReturnInfo.CODE_ERROR, null);
			}
		}
		return ReturnInfo.toPostReturn(ReturnInfo.CODE_SUCCESS, upload);
	}
	
	
	/**
	 * 删除附件
	 * @author wqf V1.0 2018年1月31日 下午5:20:49
	 * @param id
	 * @return Object
	 */
	@RequestMapping("/deleteAtt")
	@ResponseBody
	public Object deleteAtt(@RequestParam("id") Integer id){
		if(id !=null){
			Attachment attachment = new Attachment();
			attachment.setState(Attachment.STATE_NO);
			attachment.setAttachmentId(id);
			attachmentService.update(attachment);
		}
		return ReturnInfo.toPostReturn(ReturnInfo.CODE_SUCCESS, null);
	}
	
}
