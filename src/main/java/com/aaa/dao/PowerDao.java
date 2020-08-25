package com.aaa.dao;

import com.aaa.entity.Power;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface PowerDao extends tk.mybatis.mapper.common.Mapper<Power> {
    @Select("select * from power where pow_id in (select pow_Id from power_allot where pos_id=#{pos_id}) and power_ids=#{power_ids}")
    public List<Map<String,Object>> selectName(Integer pos_id,Integer power_ids);
}
