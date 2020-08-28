package com.aaa.controller;

import com.aaa.dao.AccountDao;
import com.aaa.dao.RelevanceDao;
import com.aaa.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.management.counter.AbstractCounter;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("account")
public class AccountController {
    @Resource
    AccountDao accountDao;
    @RequestMapping("Login")
    @ResponseBody
    public List<Map<String,Object>>  Login(@RequestBody Account account){
        List<Map<String,Object>>accounts=accountDao.Login(account.getAcc_name(),account.getAcc_pwd());
        return accounts;
    }

    @RequestMapping("account_listAll")
    @ResponseBody
    public List<Map<String,Object>>  listAll(){
        return accountDao.listAll();
    }

    @RequestMapping("account_update")
    @ResponseBody
    public int  update(Account account){
        return accountDao.update(account);
    }

    @RequestMapping("account_add")
    @ResponseBody
    public int  add(Account account){
        return accountDao.add(account);
    }

    @RequestMapping("account_updatePwd")
    @ResponseBody
    public int  updatePwd(Account account){
        return accountDao.updatePwd(account);
    }
}
