package com.beixiao.attachment.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.attachment.domain.Attachment;
import com.beixiao.attachment.repository.AttachmentDao;
import com.beixiao.attachment.service.AttachmentService;

@Service
public class AttachmentServiceImpl implements AttachmentService{

	@Resource
	private AttachmentDao attachmentDao;
	
	@Override
	public List<Attachment> findByShopIdAndType(Map<String,Object> param) {
		return attachmentDao.findByShopIdAndType(param);
	}
}
