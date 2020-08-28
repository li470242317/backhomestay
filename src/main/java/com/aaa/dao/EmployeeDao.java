package com.aaa.dao;

import com.aaa.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
@org.apache.ibatis.annotations.Mapper
public interface EmployeeDao extends Mapper<Employee> {
    @Insert("insert into employee(emp_name,emp_sex,emp_age,emp_phone,emp_address,emp_card,hiredate)\n" +
            "values(#{emp_name},#{emp_sex},#{emp_age},#{emp_phone},#{emp_address},#{emp_card},#{hiredate})")
    Integer add(Employee employee);

    @Select("select count(emp_id) from employee")
    public int totalCount();
}
