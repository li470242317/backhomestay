package com.aaa.controller;

import com.aaa.dao.MemberDao;
import com.aaa.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("member")
public class MemberController {
    @Resource
    MemberDao memberDao;

    @RequestMapping("member_listAll")
    @ResponseBody
    public List<Member> listAll(){
        return memberDao.selectAll();
    }
}
