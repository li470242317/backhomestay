package com.aaa.controller;

import com.aaa.dao.BankDao;
import com.aaa.entity.Manager;
import javafx.beans.binding.ObjectExpression;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("bank")
public class BankController {
    @Resource
    BankDao bankDao;

    @RequestMapping("listAll")
    @ResponseBody
    public List<Map<String, Object>> listAll(){
        return bankDao.listAll();
    }
}
