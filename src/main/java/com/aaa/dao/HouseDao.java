package com.aaa.dao;

import com.aaa.entity.House;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface HouseDao extends tk.mybatis.mapper.common.Mapper<House> {
    @Select("select h.hou_id,h.hou_name,h.hou_address,h.hou_row,h.hou_details,h.hou_bdcount,h.hou_drcount,\n" +
            "h.hou_kitcount,h.hou_ipcount,h.hou_cmcount,h.hou_letcount,h.rt_id,h.hou_checkcount\n" +
            ",h.hou_bedcount,h.cli_id,\n" +
            "rt.rt_id,rt.rt_name,\n" +
            "c.cli_id,c.cli_name,\n" +
            "r.ru_price,r.ru_checkdate,r.ru_outdate,\n" +
            "f.fac_prc,f.fac_photoprc,f.fac_expiredate from house h\n" +
            "left join room_type rt on h.rt_id=rt.rt_id \n" +
            "left join client c on h.cli_id=c.cli_id\n" +
            "left join rule r on r.hou_id=h.hou_id\n" +
            "left join facility f on f.hou_id=h.hou_id ")
    List<Map<String,Object>> listAll();
}
