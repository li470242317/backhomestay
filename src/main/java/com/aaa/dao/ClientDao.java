package com.aaa.dao;

import com.aaa.entity.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface ClientDao extends tk.mybatis.mapper.common.Mapper<Client> {

    @Select("select c.cli_id,c.cli_name,c.cli_sex,c.cli_phone,c.cli_date,c.cli_place,c.cli_money,c.cli_email\n" +
            ",c.cli_sparephone,c.cli_qq,c.cli_wechat,c.cli_referral,c.cli_prc,c.cli_rank,c.cli_price,c.ba_id,b.ba_id,b.ba_name \n" +
            "from client c left join bank b on c.cli_id=b.ba_id")
    List<Map<String ,Object>> listAll();

    @Select("select c.cli_id,c.cli_name,c.cli_sex,c.cli_phone,c.cli_date,c.cli_place,c.cli_money,c.cli_email\n" +
            ",c.cli_sparephone,c.cli_qq,c.cli_wechat,c.cli_referral,c.cli_prc,c.cli_rank,c.cli_price,c.ba_id,b.ba_id,b.ba_name\n" +
            "from client c left join bank b on c.cli_id=b.ba_id\n" +
            "where c.cli_name like concat ('%',#{cli_name},'%')")
    List<Map<String ,Object>> listname(String cli_name);


}
