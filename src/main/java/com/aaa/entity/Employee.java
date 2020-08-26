package com.aaa.entity;

public class Employee {
    private Integer emp_id;
    private String emp_name;
    private Integer emp_age;
    private String emp_sex;
    private String emp_phone;
    private String emp_address;
    private String emp_card;
    private String entryDate;
    private String dimission;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Integer getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(Integer emp_age) {
        this.emp_age = emp_age;
    }

    public String getEmp_sex() {
        return emp_sex;
    }

    public void setEmp_sex(String emp_sex) {
        this.emp_sex = emp_sex;
    }

    public String getEmp_phone() {
        return emp_phone;
    }

    public void setEmp_phone(String emp_phone) {
        this.emp_phone = emp_phone;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public String getEmp_card() {
        return emp_card;
    }

    public void setEmp_card(String emp_card) {
        this.emp_card = emp_card;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getDimission() {
        return dimission;
    }

    public void setDimission(String dimission) {
        this.dimission = dimission;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_age=" + emp_age +
                ", emp_sex='" + emp_sex + '\'' +
                ", emp_phone='" + emp_phone + '\'' +
                ", emp_address='" + emp_address + '\'' +
                ", emp_card='" + emp_card + '\'' +
                ", entryDate='" + entryDate + '\'' +
                ", dimission='" + dimission + '\'' +
                '}';
    }
}
