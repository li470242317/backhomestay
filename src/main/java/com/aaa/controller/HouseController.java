package com.aaa.controller;

import com.aaa.dao.HouseDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("house")
public class HouseController {
    @Resource
    HouseDao houseDao;

    @RequestMapping("house_listAll")
    @ResponseBody
    public List<Map<String,Object>> listAll(String hou_name) {
        if (hou_name==null||hou_name==""){
            return houseDao.listAll();
        }else {
            return houseDao.listname(hou_name);
        }

    }

    @RequestMapping("www")
    @ResponseBody
    public String Aaa(){
        System.out.println("22222222222222222222");
        return "ol";
    }
}
