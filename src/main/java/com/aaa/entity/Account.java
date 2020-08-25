package com.aaa.entity;

public class Account {
    private Integer acc_id;
    private String acc_name;
    private String acc_pwd;
    private Integer acc_state;
    private Integer emp_id;

    @Override
    public String toString() {
        return "Account{" +
                "acc_id=" + acc_id +
                ", acc_name='" + acc_name + '\'' +
                ", acc_pwd='" + acc_pwd + '\'' +
                ", acc_state=" + acc_state +
                ", emp_id=" + emp_id +
                '}';
    }

    public Integer getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(Integer acc_id) {
        this.acc_id = acc_id;
    }

    public String getAcc_name() {
        return acc_name;
    }

    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    public String getAcc_pwd() {
        return acc_pwd;
    }

    public void setAcc_pwd(String acc_pwd) {
        this.acc_pwd = acc_pwd;
    }

    public Integer getAcc_state() {
        return acc_state;
    }

    public void setAcc_state(Integer acc_state) {
        this.acc_state = acc_state;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }
}
