package com.aaa.dao;

import com.aaa.entity.Orders;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public interface OrdersDao extends Mapper<Orders> {
    @Select("select o.*,od.od_name,od.od_card,h.hou_name,h.hou_address,h.hou_row,h.hou_details,c.cli_name from orders o left join order_details od on o.or_id=od.or_id left join house h on o.hou_id=h.hou_id left join client c on h.cli_id=c.cli_id")
    List<Map<String,Object>> query();
    @Select("select o.*,od.od_name,od.od_card,h.hou_name,h.hou_address,h.hou_row,h.hou_details,c.cli_name from orders o left join order_details od on o.or_id=od.or_id left join house h on o.hou_id=h.hou_id left join client c on h.cli_id=c.cli_id where o.or_state=#{or_state}")
    List<Map<String,Object>> querystate(Integer or_state);
}
