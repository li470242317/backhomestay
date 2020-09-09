package com.aaa.controller;

import com.aaa.dao.EmployeeDao;
import com.aaa.entity.Employee;
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
    public List<Employee> query(String emp_name){
        if(emp_name==null||emp_name==""){
        return employeeDao.selectAll();}
        else {
            return employeeDao.listname(emp_name);
        }
    }
    @RequestMapping("employee_add")
    @ResponseBody
    public int add(Employee employee){
        System.out.println(employee);
        return employeeDao.add(employee);
    }
    @RequestMapping("employee_update")
    @ResponseBody
    public int update(Employee employee){
        System.out.println(employee);
        return employeeDao.update(employee);
    }
}
