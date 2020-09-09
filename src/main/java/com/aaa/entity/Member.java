package com.aaa.entity;

public class Member {
    private Integer mem_id;
    private String mem_name;
    private Double mem_power;
    private Integer mem_condition;

    public Integer getMem_id() {
        return mem_id;
    }

    public void setMem_id(Integer mem_id) {
        this.mem_id = mem_id;
    }

    public String getMem_name() {
        return mem_name;
    }

    public void setMem_name(String mem_name) {
        this.mem_name = mem_name;
    }

    public Double getMem_power() {
        return mem_power;
    }

    public void setMem_power(Double mem_power) {
        this.mem_power = mem_power;
    }

    public Integer getMem_condition() {
        return mem_condition;
    }

    public void setMem_condition(Integer mem_condition) {
        this.mem_condition = mem_condition;
    }

    @Override
    public String toString() {
        return "Member{" +
                "mem_id=" + mem_id +
                ", mem_name='" + mem_name + '\'' +
                ", mem_power=" + mem_power +
                ", mem_condition=" + mem_condition +
                '}';
    }
}
