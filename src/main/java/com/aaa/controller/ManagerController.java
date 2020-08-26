package com.aaa.controller;

import com.aaa.dao.ManagerDao;
import com.aaa.entity.Manager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("manager")
public class ManagerController {
    @Resource
    ManagerDao managerDao;
    //查询所有部门
    @RequestMapping("manager_query")
    @ResponseBody
    public List<Manager> query(){
        return managerDao.selectAll();
    }

    @RequestMapping("manager_add")
    @ResponseBody
    public int add(Manager manager){
        return managerDao.insert(manager);
    }
    @RequestMapping("manager_update")
    @ResponseBody
    public int update(Manager manager){
        return managerDao.updateByPrimaryKey(manager);
    }
}
