package com.aaa.controller;

import com.aaa.dao.BankDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@CrossOrigin
@Controller
@RequestMapping("bank")
public class BankController {
    @Resource
    BankDao bankDao;

}
