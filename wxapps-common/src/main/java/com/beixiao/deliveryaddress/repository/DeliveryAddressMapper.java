package com.beixiao.deliveryaddress.repository;

import com.beixiao.deliveryaddress.domain.DeliveryAddress;

public interface DeliveryAddressMapper {
    int deleteByPrimaryKey(Integer deliveryAddressId);

    int insert(DeliveryAddress record);

    int insertSelective(DeliveryAddress record);

    DeliveryAddress selectByPrimaryKey(Integer deliveryAddressId);

    int updateByPrimaryKeySelective(DeliveryAddress record);

    int updateByPrimaryKey(DeliveryAddress record);
}