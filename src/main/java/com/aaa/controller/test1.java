package com.aaa.controller;

import com.aaa.dao.Test;
import com.aaa.entity.Room_type;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller

public class test1 {
    @Resource
    Test test;

    @ResponseBody
    @RequestMapping("tests")
    public String ss(){
      List<Room_type>  room_type= test.selectAll();
        System.out.println(room_type);
        return "ok";
    }
}
