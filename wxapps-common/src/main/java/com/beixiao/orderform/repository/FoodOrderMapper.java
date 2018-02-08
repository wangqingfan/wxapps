package com.beixiao.orderform.repository;

import com.beixiao.orderform.domain.FoodOrder;

public interface FoodOrderMapper {
    int deleteByPrimaryKey(Integer foodOrderId);

    int insert(FoodOrder record);

    int insertSelective(FoodOrder record);

    FoodOrder selectByPrimaryKey(Integer foodOrderId);

    int updateByPrimaryKeySelective(FoodOrder record);

    int updateByPrimaryKey(FoodOrder record);
}