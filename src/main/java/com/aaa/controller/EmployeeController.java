package com.aaa.controller;

import com.aaa.dao.EmployeeDao;
import com.aaa.entity.Employee;
import com.aaa.util.PageHelpers;
import com.github.pagehelper.Page;
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
@RequestMapping("employee")
public class EmployeeController {
    @Resource
    EmployeeDao employeeDao;

    @RequestMapping("employee_query")
    @ResponseBody
    /*public List<Employee> query(){
        return employeeDao.selectAll();
    }*/
    public PageHelpers<Employee> listAll(PageHelpers<Employee> ph){
        PageHelper.startPage(ph.getPageNum(),ph.getPageSize());
        List<Employee> employees=employeeDao.selectAll();
        ph.setRows(employees);
        PageInfo<Employee> pageInfo=new PageInfo<Employee>(employees);
        int pages=pageInfo.getPages();
        ph.setLastPage(pages);
        ph.setTotalCount(employeeDao.totalCount());
        return ph;
    }
    /*
    *  public PageHelpers<Teacher> listAll(PageHelpers<Teacher> ph){
        /*System.out.println(teacherDao.selectAll());
        return teacherDao.selectAll();*/
        /*PageHelper.startPage(ph.getPageNum(),ph.getPageSize());
    List<Teacher> teachers = teacherDao.selectAll();
        ph.setRows(teachers);
    PageInfo<Teacher> pageInfo = new PageInfo<Teacher>(teachers);
    int pages = pageInfo.getPages();
        ph.setLastPage(pages);
        ph.setTotalCount(teacherDao.totalCount());
        return ph;*/

    @RequestMapping("employee_add")
    @ResponseBody
    public int add(Employee employee){
        System.out.println(employee);
        return employeeDao.add(employee);
    }
    @RequestMapping("employee_update")
    @ResponseBody
    public int update(Employee employee){
        return employeeDao.updateByPrimaryKey(employee);
    }
}
