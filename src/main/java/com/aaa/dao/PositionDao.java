package com.aaa.dao;

import com.aaa.entity.Position;
import org.apache.ibatis.annotations.Delete;
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

    @Update("update position set pos_name=#{pos_name} where pos_id=#{pos_id}")
    Integer position_update(Position position);
    @Select("\n" +
            "select poa.pow_id,po.pow_name from  \n" +
            "power_allot poa \n" +
            "join power po on poa.pow_id=po.pow_id\n" +
            "where poa.pos_id=#{pos_id} and po.power_ids!=0 ")
    List<Map<String,Object>> queryId(Integer pos_id);
    @Delete("delete from power_allot where pos_id=#{pos_id}")
    Integer deleteId(Integer pos_id);
    @Insert("insert into power_allot (pos_id,pow_id) values (#{pos_id},#{pow_id})")
    Integer saveId(Integer pos_id,Integer pow_id);
    @Select("select pos_name from position where man_id=#{man_id}")
    List<Position> queryname(Integer man_id);
}
