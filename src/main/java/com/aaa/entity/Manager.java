package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//部门
public class Manager {
    @Id
    @Column
    private Integer man_id;
    private String man_name;

    public Integer getMan_id() {
        return man_id;
    }

    public void setMan_id(Integer man_id) {
        this.man_id = man_id;
    }

    public String getMan_name() {
        return man_name;
    }

    public void setMan_name(String man_name) {
        this.man_name = man_name;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "man_id=" + man_id +
                ", man_name='" + man_name + '\'' +
                '}';
    }
}
