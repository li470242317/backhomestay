package com.aaa.dao;

import com.aaa.entity.Relevance;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
@org.apache.ibatis.annotations.Mapper
public interface  RelevanceDao extends Mapper<Relevance> {
    @Select("select * from relevance where acc_id=#{acc_id}")
    public Relevance SelectId(Integer acc_id);
}
