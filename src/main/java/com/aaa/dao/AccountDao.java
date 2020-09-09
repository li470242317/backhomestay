package com.aaa.dao;

import com.aaa.entity.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface AccountDao extends tk.mybatis.mapper.common.Mapper<Account> {
    @Select("select a.acc_id,a.acc_name,a.acc_pwd,a.acc_state,a.emp_id,e.emp_id,e.emp_name from account a left join employee e on a.emp_id=e.emp_id")
    public List<Map<String,Object>> listAll();

    @Insert("insert into account(acc_name,acc_pwd,acc_state,emp_id) values(#{acc_name},#{acc_pwd},#{acc_state},#{emp_id})")
    Integer add(Account account);

    @Update("update account set acc_pwd=#{acc_pwd},acc_state=#{acc_state} where acc_id=#{acc_id}")
    Integer update(Account account);

    @Update("update account set acc_pwd='123456'  where acc_id=#{acc_id}")
    Integer updatePwd(Account account);
    @Select("select * from account a,relevance r where a.acc_id=r.acc_id and a.acc_name=#{acc_name} and a.acc_pwd=#{acc_pwd}")
    public List<Map<String,Object>> Login(String acc_name, String acc_pwd);
    @Select("select acc_name from account")
    public List<Account> queryname();
}
