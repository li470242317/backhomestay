package com.aaa.controller;

import com.aaa.dao.WaterDao;
import com.aaa.entity.Water;
import org.hibernate.validator.constraints.EAN;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.constraints.Null;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("water")
public class WaterController {
    @Resource
    WaterDao waterDao;

    @RequestMapping("water_listAll")
    @ResponseBody
    public List<Water> listAll(){
        return waterDao.selectAll();
    }
}
