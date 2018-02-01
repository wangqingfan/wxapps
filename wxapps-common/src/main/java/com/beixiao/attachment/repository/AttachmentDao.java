package com.beixiao.attachment.repository;

import java.util.List;
import java.util.Map;

import com.beixiao.attachment.domain.Attachment;
import com.beixiao.common.BaseDao;

public interface AttachmentDao extends BaseDao<Attachment>{
	
	/**
	 * 根据shopId查找
	 * @author wqf V1.0 2017年12月26日 下午7:00:04
	 * @param shopId
	 * @return List<Attachment>
	 */
	List<Attachment> findByShopIdAndType (Map<String,Object> param);
	
	/**
	 * 批量更新
	 * @author wqf V1.0 2018年1月29日 下午2:17:47
	 * @param attachment
	 * @return Integer
	 */
	Integer updateByIds(Attachment attachment);
}