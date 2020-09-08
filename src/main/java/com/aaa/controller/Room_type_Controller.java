package com.aaa.controller;

import com.aaa.dao.Room_type_Dao;
import com.aaa.entity.Room_type;
import com.aaa.util.PageHelpers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    /*public PageHelpers<Room_type> listAll(PageHelpers<Room_type> ph){
        PageHelper.startPage(ph.getPageNum(),ph.getPageSize());
        List<Room_type> room_types=room_type_dao.selectAll();
        ph.setRows(room_types);
        PageInfo<Room_type> pageInfo=new PageInfo<Room_type>(room_types);
        int pages=pageInfo.getPages();
        ph.setLastPage(pages);
        ph.setTotalCount(room_type_dao.totalCount());
        return ph;
    }*/

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
