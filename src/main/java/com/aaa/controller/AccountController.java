package com.aaa.controller;

import com.aaa.dao.AccountDao;
import com.aaa.dao.RelevanceDao;
import com.aaa.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("account")
public class AccountController {
    @Resource
    AccountDao accountDao;
    @RequestMapping("Login")
    @ResponseBody
    public Account  Login(@RequestBody Account account){
        Account accounts=accountDao.selectOne(account);
        return accounts;
    }
}
