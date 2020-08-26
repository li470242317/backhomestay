package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Order_appraise {
    @Id
    @Column
    private Integer oa_id;
    private Integer cli_id;
    private String or_cover;
    private String oa_date;
    private Integer or_id;
    private String or_details;

    public Integer getOa_id() {
        return oa_id;
    }

    public void setOa_id(Integer oa_id) {
        this.oa_id = oa_id;
    }

    public Integer getCli_id() {
        return cli_id;
    }

    public void setCli_id(Integer cli_id) {
        this.cli_id = cli_id;
    }

    public String getOr_cover() {
        return or_cover;
    }

    public void setOr_cover(String or_cover) {
        this.or_cover = or_cover;
    }

    public String getOa_date() {
        return oa_date;
    }

    public void setOa_date(String oa_date) {
        this.oa_date = oa_date;
    }

    public Integer getOr_id() {
        return or_id;
    }

    public void setOr_id(Integer or_id) {
        this.or_id = or_id;
    }

    public String getOr_details() {
        return or_details;
    }

    public void setOr_details(String or_details) {
        this.or_details = or_details;
    }

    @Override
    public String toString() {
        return "Order_appraise{" +
                "oa_id=" + oa_id +
                ", cli_id=" + cli_id +
                ", or_cover='" + or_cover + '\'' +
                ", oa_date='" + oa_date + '\'' +
                ", or_id=" + or_id +
                ", or_details='" + or_details + '\'' +
                '}';
    }
}
