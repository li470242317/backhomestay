package com.aaa.dao;

import com.aaa.entity.Order_appraise;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public interface Order_appraiseDao extends Mapper<Order_appraise> {
    @Select("select o.*,od.od_name,od.od_card,h.hou_name,\n" +
            "            h.hou_address,h.hou_row,h.hou_details,c.cli_name,oa.oa_id,oa.cli_id,oa.or_cover,oa.oa_date,oa.or_details\n" +
            "            from order_appraise oa \n" +
            "\t\t\t\tleft join orders o on oa.or_id=o.or_id\n" +
            "            left join house h on o.hou_id=h.hou_id \n" +
            "            left join client c on h.cli_id=c.cli_id\n" +
            "            left join order_details od\n" +
            "            on od.or_id=o.or_id\n" +
            "\n" +
            "\n")
    List<Map<String,Object>> query();

    @Select("select count(oa_id) from order_appraise")
    public int totalCount();

}
