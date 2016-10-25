package com.gome.upm.dao;

import com.gome.upm.domain.auto.MoAutoshopBuy;

public interface MoAutoshopBuyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MoAutoshopBuy record);

    int insertSelective(MoAutoshopBuy record);

    MoAutoshopBuy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MoAutoshopBuy record);

    int updateByPrimaryKey(MoAutoshopBuy record);
}