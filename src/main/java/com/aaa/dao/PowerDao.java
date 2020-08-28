package com.aaa.dao;

import com.aaa.entity.Power;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface PowerDao extends tk.mybatis.mapper.common.Mapper<Power> {
    @Select("select * from power where pow_id in (select pow_Id from power_allot where pos_id=#{pos_id}) and power_ids=#{power_ids}")
    public List<Map<String,Object>> selectName(Integer pos_id,Integer power_ids);
    @Select("select * from power where power_ids=0")
    List<Map<String,Object>> power_query();
    @Select("select * from power where power_ids=#{pow_id}")
    List<Map<String,Object>> power_twoQueryAll(Integer pow_id);
    @Delete("delete from power where pow_id=#{pow_id}")
    Integer power_delete(Integer pow_id);
    @Select("select * from power where power_ids=0")
    List<Map<String,Object>> one_query();
    @Select("select * from power where power_ids=#{pow_id}")
    List<Map<String,Object>> two_query(Integer pow_id);
}
