package com.beixiao.system.repository;

import com.beixiao.system.domain.MiniApps;

public interface MiniAppsDao {
    int deleteByPrimaryKey(Integer miniAppId);

    int insert(MiniApps record);

    int insertSelective(MiniApps record);

    MiniApps selectByPrimaryKey(Integer miniAppId);

    int updateByPrimaryKeySelective(MiniApps record);

    int updateByPrimaryKey(MiniApps record);
}