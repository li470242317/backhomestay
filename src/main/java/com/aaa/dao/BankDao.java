package com.aaa.dao;

import com.aaa.entity.Bank;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BankDao extends tk.mybatis.mapper.common.Mapper<Bank> {
}
