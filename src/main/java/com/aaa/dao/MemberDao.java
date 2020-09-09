package com.aaa.dao;

import com.aaa.entity.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao extends tk.mybatis.mapper.common.Mapper<Member> {
}
