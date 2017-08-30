package com.mmall.dao;

import com.mmall.pojo.Cart;

/**
 * 购物车接口
 */
public interface CartMapper {
    int deleteByPrimaryKey(Integer id);//通过主键删除

    int insert(Cart record);//插入一个购物车

    int insertSelective(Cart record);//根据选择插入一个对象（有字段的空判断）

    Cart selectByPrimaryKey(Integer id);//根据主键查询对象

    int updateByPrimaryKeySelective(Cart record);//根据主键选择更新（有字段的空判断）

    int updateByPrimaryKey(Cart record);//根据主键更新
}