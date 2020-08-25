package com.aaa.dao;

import com.aaa.entity.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountDao extends tk.mybatis.mapper.common.Mapper<Account> {

}
