package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class House {
    @Id
    @Column
    private Integer hou_id;
    private String hou_name;
    private String hou_address;
    private String hou_row;
    private String hou_details;
    private Integer hou_bdcount;
    private Integer hou_drcount;
    private Integer hou_kitcount;
    private Integer hou_ipcount;
    private Integer hou_cmcount;
    private Integer hou_letcount;
    private Integer rt_id;
    private Integer hou_checkcount;
    private Integer hou_bedcount;
    private Integer cli_id;

    public Integer getHou_id() {
        return hou_id;
    }

    public void setHou_id(Integer hou_id) {
        this.hou_id = hou_id;
    }

    public String getHou_name() {
        return hou_name;
    }

    public void setHou_name(String hou_name) {
        this.hou_name = hou_name;
    }

    public String getHou_address() {
        return hou_address;
    }

    public void setHou_address(String hou_address) {
        this.hou_address = hou_address;
    }

    public String getHou_row() {
        return hou_row;
    }

    public void setHou_row(String hou_row) {
        this.hou_row = hou_row;
    }

    public String getHou_details() {
        return hou_details;
    }

    public void setHou_details(String hou_details) {
        this.hou_details = hou_details;
    }

    public Integer getHou_bdcount() {
        return hou_bdcount;
    }

    public void setHou_bdcount(Integer hou_bdcount) {
        this.hou_bdcount = hou_bdcount;
    }

    public Integer getHou_drcount() {
        return hou_drcount;
    }

    public void setHou_drcount(Integer hou_drcount) {
        this.hou_drcount = hou_drcount;
    }

    public Integer getHou_kitcount() {
        return hou_kitcount;
    }

    public void setHou_kitcount(Integer hou_kitcount) {
        this.hou_kitcount = hou_kitcount;
    }

    public Integer getHou_ipcount() {
        return hou_ipcount;
    }

    public void setHou_ipcount(Integer hou_ipcount) {
        this.hou_ipcount = hou_ipcount;
    }

    public Integer getHou_cmcount() {
        return hou_cmcount;
    }

    public void setHou_cmcount(Integer hou_cmcount) {
        this.hou_cmcount = hou_cmcount;
    }

    public Integer getHou_letcount() {
        return hou_letcount;
    }

    public void setHou_letcount(Integer hou_letcount) {
        this.hou_letcount = hou_letcount;
    }

    public Integer getRt_id() {
        return rt_id;
    }

    public void setRt_id(Integer rt_id) {
        this.rt_id = rt_id;
    }

    public Integer getHou_checkcount() {
        return hou_checkcount;
    }

    public void setHou_checkcount(Integer hou_checkcount) {
        this.hou_checkcount = hou_checkcount;
    }

    public Integer getHou_bedcount() {
        return hou_bedcount;
    }

    public void setHou_bedcount(Integer hou_bedcount) {
        this.hou_bedcount = hou_bedcount;
    }

    public Integer getCli_id() {
        return cli_id;
    }

    public void setCli_id(Integer cli_id) {
        this.cli_id = cli_id;
    }

    @Override
    public String toString() {
        return "HouseDao{" +
                "hou_id=" + hou_id +
                ", hou_name='" + hou_name + '\'' +
                ", hou_address='" + hou_address + '\'' +
                ", hou_row='" + hou_row + '\'' +
                ", hou_details='" + hou_details + '\'' +
                ", hou_bdcount=" + hou_bdcount +
                ", hou_drcount=" + hou_drcount +
                ", hou_kitcount=" + hou_kitcount +
                ", hou_ipcount=" + hou_ipcount +
                ", hou_cmcount=" + hou_cmcount +
                ", hou_letcount=" + hou_letcount +
                ", rt_id=" + rt_id +
                ", hou_checkcount=" + hou_checkcount +
                ", hou_bedcount=" + hou_bedcount +
                ", cli_id=" + cli_id +
                '}';
    }
}
