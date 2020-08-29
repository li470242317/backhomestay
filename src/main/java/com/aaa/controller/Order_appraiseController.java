package com.aaa.controller;

import com.aaa.dao.Order_appraiseDao;
import com.aaa.entity.Order_appraise;
import com.aaa.util.PageHelpers;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("Order_appraise")
public class Order_appraiseController {
    @Resource
    Order_appraiseDao order_appraiseDao;
    @RequestMapping("Order_appraise_query")
    @ResponseBody
    public List<Map<String,Object>> query(){
        return order_appraiseDao.query();
    }
    @RequestMapping("Order_appraise_delete")
    @ResponseBody
    public int delete(int oa_id){
        return order_appraiseDao.deleteByPrimaryKey(oa_id);
    }

}
