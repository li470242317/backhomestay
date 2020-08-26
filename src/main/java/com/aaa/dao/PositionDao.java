package com.aaa.dao;

import com.aaa.entity.Position;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public interface PositionDao extends Mapper<Position> {
    @Select("select p.pos_id,p.pos_name,p.man_id,m.man_id,m.man_name from position p left join manager m on p.man_id=m.man_id")
    List<Map<String,Object>> position_query();

    @Insert("insert into position (pos_name,man_id) values (#{pos_name},#{man_id})")
    Integer position_add(Position position);

    @Update("update position set pos_name=#{pos_name},man_id=#{man_id} where pos_id=#{pos_id}")
    Integer position_update(Position position);
}
