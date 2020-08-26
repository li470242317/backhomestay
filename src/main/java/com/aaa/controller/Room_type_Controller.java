package com.aaa.controller;

import com.aaa.dao.Room_type_Dao;
import com.aaa.entity.Room_type;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("room_type")
public class Room_type_Controller {
    @Resource
    Room_type_Dao room_type_dao;

    @RequestMapping("room_listAll")
    @ResponseBody
    public List<Room_type> listAll(){
        return room_type_dao.selectAll();
    }

    @RequestMapping("room_update")
    @ResponseBody
    public int update(Room_type room_type){
        return room_type_dao.updateByPrimaryKey(room_type);
    }

    @RequestMapping("room_add")
    @ResponseBody
    public int add(Room_type room_type){
        return room_type_dao.insert(room_type);
    }

    @RequestMapping("room_delete")
    @ResponseBody
    public int delete(Room_type room_type){
        return room_type_dao.deleteByPrimaryKey(room_type);
    }
}
