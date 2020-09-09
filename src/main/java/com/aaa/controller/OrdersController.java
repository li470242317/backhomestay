package com.aaa.controller;

import com.aaa.dao.OrdersDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("orders")
public class OrdersController {
    @Resource
    OrdersDao ordersDao;
    @RequestMapping("orders_query")
    @ResponseBody
    public List<Map<String,Object>> query(Integer or_state){
        System.out.println(or_state);
        if(or_state!=null){
            return ordersDao.querystate(or_state);
        }else {
            return ordersDao.query();
        }

    }

}
