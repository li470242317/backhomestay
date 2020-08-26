package com.aaa.controller;

import com.aaa.dao.PositionDao;
import com.aaa.entity.Position;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("position")
public class PositionController {
    @Resource
    PositionDao positionDao;

    @RequestMapping("position_query")
    @ResponseBody
    public List<Map<String,Object>> query(){
        return positionDao.position_query();
    }
    @RequestMapping("position_add")
    @ResponseBody
    public int add(Position position){
        return positionDao.position_add(position);
    }
    @RequestMapping("position_update")
    @ResponseBody
    public int update(Position position){
        return positionDao.position_update(position);
    }
}
