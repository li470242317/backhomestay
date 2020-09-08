package com.aaa.dao;

import com.aaa.entity.Room_type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Room_type_Dao extends tk.mybatis.mapper.common.Mapper<Room_type> {
    @Select("select count(rt_id) from room_type")
    public int totalCount();
}
