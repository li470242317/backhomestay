package com.aaa.dao;


import com.aaa.entity.Bank;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface BankDao extends tk.mybatis.mapper.common.Mapper<Bank> {
    @Select("select b.ba_id,b.ba_name,b.ba_phone,b.ba_pwd,b.ba_state,c.cli_name from bank b left join client c on b.ba_id=c.cli_id")
    public List<Map<String,Object>> listAll();
}
