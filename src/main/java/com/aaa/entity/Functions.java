package com.aaa.entity;

public class Functions {
    private Integer fun_id;
    private String fun_name;
    private String fun_url;

    @Override
    public String toString() {
        return "Functions{" +
                "fun_id=" + fun_id +
                ", fun_name='" + fun_name + '\'' +
                ", fun_url='" + fun_url + '\'' +
                '}';
    }

    public Integer getFun_id() {
        return fun_id;
    }

    public void setFun_id(Integer fun_id) {
        this.fun_id = fun_id;
    }

    public String getFun_name() {
        return fun_name;
    }

    public void setFun_name(String fun_name) {
        this.fun_name = fun_name;
    }

    public String getFun_url() {
        return fun_url;
    }

    public void setFun_url(String fun_url) {
        this.fun_url = fun_url;
    }
}
