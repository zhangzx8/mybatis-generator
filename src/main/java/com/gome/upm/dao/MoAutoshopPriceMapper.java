package com.gome.upm.dao;

import com.gome.upm.domain.auto.MoAutoshopPrice;

public interface MoAutoshopPriceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MoAutoshopPrice record);

    int insertSelective(MoAutoshopPrice record);

    MoAutoshopPrice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MoAutoshopPrice record);

    int updateByPrimaryKey(MoAutoshopPrice record);
}