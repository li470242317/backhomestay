package com.aaa.dao;

import com.aaa.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface EmployeeDao extends Mapper<Employee> {
    @Insert("insert into employee(emp_name,emp_sex,emp_age,emp_phone,emp_address,emp_card,hiredate)\n" +
            "values(#{emp_name},#{emp_sex},#{emp_age},#{emp_phone},#{emp_address},#{emp_card},#{hiredate})")
    Integer add(Employee employee);

    @Select("select count(emp_id) from employee")
    public int totalCount();

    @Select("select * from employee where emp_name like concat ('%',#{emp_name},'%')")
    List<Employee> listname(String emp_name);

    @Update("update employee set emp_name=#{emp_name},emp_sex=#{emp_sex},emp_age=#{emp_age},emp_phone=#{emp_phone},emp_address=#{emp_address},\n" +
            "emp_card=#{emp_card},dimission=#{dimission} where emp_id=#{emp_id}")
    Integer update(Employee employee);
}
