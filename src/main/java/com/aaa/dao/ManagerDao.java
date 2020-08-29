package com.aaa.dao;

import com.aaa.entity.Manager;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
@org.apache.ibatis.annotations.Mapper
public interface ManagerDao extends Mapper<Manager> {
    @Select("select count(man_id) from manager")
    public int totalCount();
}
