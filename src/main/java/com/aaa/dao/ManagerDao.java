package com.aaa.dao;

import com.aaa.entity.Manager;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ManagerDao extends Mapper<Manager> {
    @Select("select count(man_id) from manager")
    public int totalCount();
    @Select("select man_name from manager")
    List<Manager> man_name();
}
