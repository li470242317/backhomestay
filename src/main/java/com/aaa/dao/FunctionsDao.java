package com.aaa.dao;

import com.aaa.entity.Functions;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FunctionsDao extends tk.mybatis.mapper.common.Mapper<Functions> {
    @Select("select f.fun_name from functions f left join position_allot p on f.fun_id=p.fun_id left join relevance re on p.pos_id=re.pos_id where re.pos_id=#{acc_id}")
    public List<Functions> SelectName(Integer acc_id);
}
