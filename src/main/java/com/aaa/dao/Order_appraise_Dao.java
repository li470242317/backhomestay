package com.aaa.dao;

import com.aaa.entity.Order_appraise;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface Order_appraise_Dao extends tk.mybatis.mapper.common.Mapper<Order_appraise> {
    @Select("")
    List<Map<String,Object>> listAll();
}
