package com.beixiao.attachment.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.beixiao.attachment.domain.Attachment;
import com.beixiao.attachment.repository.AttachmentDao;
import com.beixiao.attachment.service.AttachmentService;
import com.beixiao.common.util.DateUtil;
import com.beixiao.common.util.Properties;
import com.beixiao.common.util.ValidateUtil;

@Service
public class AttachmentServiceImpl implements AttachmentService{

	private Logger logger = LoggerFactory.getLogger(AttachmentServiceImpl.class);
	@Resource
	private AttachmentDao attachmentDao;
	
	@Override
	public List<Attachment> findByShopIdAndType(Map<String,Object> param) {
		return attachmentDao.findByShopIdAndType(param);
	}
	
	@Override
	public String upload(Integer type, CommonsMultipartFile[] files) throws Exception{
		String result = "";
		for(CommonsMultipartFile file : files){
			InputStream inputStream = null;
			FileOutputStream outputStream = null;
			try {
				String originalFilename = file.getOriginalFilename();
				originalFilename.indexOf(".");
				String uuid = UUID.randomUUID().toString().replaceAll("-","");
				inputStream = file.getInputStream();
				String path = Properties.getValue(Properties.PROPERTIES_INTERFACE, Properties.UPLOAD_PATH);
				String url = Properties.getValue(Properties.PROPERTIES_INTERFACE, Properties.UPLOAD_URL);
				String now = DateUtil.date2String(new Date(), "yyyy-MM-dd");
				path += now;
				File dir = new File(path);
				//创建当前时间的文件夹
				if(!dir.exists()){
					dir.mkdirs();
				}
				outputStream = new FileOutputStream(new File(path+File.separator+uuid+originalFilename.substring(originalFilename.lastIndexOf("."))));
				byte[] buf = new byte[8*1024];
				int b = 0;
				while((b=inputStream.read(buf))!=-1){
					outputStream.write(buf, 0, b);
				}
				outputStream.flush();
				//插入附件
				Attachment attachment = new Attachment();
				attachment.setFileName(uuid);//生成的附件名称
				attachment.setAttachmentType(type);//附件类型
				attachment.setFileType(originalFilename.substring(originalFilename.lastIndexOf(".")));//文件类型
				attachment.setPathInfo(path);
				attachment.setHref(url+now+"/"+uuid+originalFilename.substring(originalFilename.lastIndexOf(".")));
				attachment.setCreateTime(new Date());
				attachment.setState(Attachment.STATE_YES);
				attachment.setAttachmentTitle(originalFilename);
				//attachment.setWidth(file.get);
				this.insert(attachment);
				if(ValidateUtil.isEmpty(result)){
					result = String.valueOf(attachment.getAttachmentId());
				}else{
					result += ","+String.valueOf(attachment.getAttachmentId());
				}
			} catch (Exception e) {
				logger.info("-----upload----发生异常"+e);
				throw e;
			}finally{
				if(inputStream!=null){
					inputStream.close();
				}
				if(outputStream!=null){
					outputStream.close();
				}
			}
			
		}
		
		return result;
	}
	
	@Override
	public Integer insert(Attachment attachment) {
		return attachmentDao.insert(attachment);
	}
	
	@Override
	public Integer updateByIds(Attachment attachment) {
		return attachmentDao.updateByIds(attachment);
	}
	
	@Override
	public Integer update(Attachment attachment) {
		return attachmentDao.update(attachment);
	}
}
