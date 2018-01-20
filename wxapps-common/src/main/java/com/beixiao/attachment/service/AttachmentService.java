package com.beixiao.attachment.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.beixiao.attachment.domain.Attachment;

public interface AttachmentService {

	/**
	 * 根据shopId查找
	 * @author wqf V1.0 2017年12月26日 下午7:00:04
	 * @param shopId
	 * @return List<Attachment>
	 */
	List<Attachment> findByShopIdAndType (Map<String,Object> param);

	/**
	 * 上传移动附件
	 * @author wqf V1.0 2018年1月19日 下午5:15:35
	 * @param type
	 * @param files void
	 */
	void upload(Integer type,CommonsMultipartFile[] files) throws Exception;
}
