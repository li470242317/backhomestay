package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Room_type {
    @Id
    @Column
    private Integer rt_id;
    private String rt_name;
    private String rt_rec;

    public Integer getRt_id() {
        return rt_id;
    }

    public void setRt_id(Integer rt_id) {
        this.rt_id = rt_id;
    }

    public String getRt_name() {
        return rt_name;
    }

    public void setRt_name(String rt_name) {
        this.rt_name = rt_name;
    }

    public String getRt_rec() {
        return rt_rec;
    }

    public void setRt_rec(String rt_rec) {
        this.rt_rec = rt_rec;
    }

    @Override
    public String toString() {
        return "Room_type{" +
                "rt_id=" + rt_id +
                ", rt_name='" + rt_name + '\'' +
                ", rt_rec='" + rt_rec + '\'' +
                '}';
    }

    public Room_type() {
        super();
    }

    public Room_type(Integer rt_id, String rt_name, String rt_rec) {
        this.rt_id = rt_id;
        this.rt_name = rt_name;
        this.rt_rec = rt_rec;
    }
}
