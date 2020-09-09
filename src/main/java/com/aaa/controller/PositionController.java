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
    @RequestMapping("queryId")
    @ResponseBody
    public List<Map<String,Object>> queryId(Integer pos_id){
        return positionDao.queryId(pos_id);
    }
    @RequestMapping("saveId")
    @ResponseBody
    public Integer saveId(Integer pos_id,Integer[] pow_id){
        int count=0;
        if(pos_id!=null){
            positionDao.deleteId(pos_id);
            for (Integer p:pow_id){
                positionDao.saveId(pos_id,p);
                count++;
            }
        }
        return count;
    }
    @RequestMapping("queryname")
    @ResponseBody
    public List<Position> queryname(Integer man_id){
        return positionDao.queryname(man_id);
    }
}
