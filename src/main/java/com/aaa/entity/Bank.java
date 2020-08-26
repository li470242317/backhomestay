package com.aaa.entity;

public class Bank {
    private Integer ba_id;
    private String ba_name;
    private String ba_phone;
    private String ba_pwd;

    public Integer getBa_id() {
        return ba_id;
    }

    public void setBa_id(Integer ba_id) {
        this.ba_id = ba_id;
    }

    public String getBa_name() {
        return ba_name;
    }

    public void setBa_name(String ba_name) {
        this.ba_name = ba_name;
    }

    public String getBa_phone() {
        return ba_phone;
    }

    public void setBa_phone(String ba_phone) {
        this.ba_phone = ba_phone;
    }

    public String getBa_pwd() {
        return ba_pwd;
    }

    public void setBa_pwd(String ba_pwd) {
        this.ba_pwd = ba_pwd;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "ba_id=" + ba_id +
                ", ba_name='" + ba_name + '\'' +
                ", ba_phone='" + ba_phone + '\'' +
                ", ba_pwd='" + ba_pwd + '\'' +
                '}';
    }
}
