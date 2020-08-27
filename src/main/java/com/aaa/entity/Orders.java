package com.aaa.entity;

public class Orders {
    private Integer or_id;
    private String or_date;
    private String or_checkdate;
    private String or_outdate;
    private Integer or_checkcount;
    private Integer or_needprice;
    private Integer or_trueprice;
    private Integer cli_id;
    private Integer hou_id;
    private Integer or_state;

    public Integer getOr_id() {
        return or_id;
    }

    public void setOr_id(Integer or_id) {
        this.or_id = or_id;
    }

    public String getOr_date() {
        return or_date;
    }

    public void setOr_date(String or_date) {
        this.or_date = or_date;
    }

    public String getOr_checkdate() {
        return or_checkdate;
    }

    public void setOr_checkdate(String or_checkdate) {
        this.or_checkdate = or_checkdate;
    }

    public String getOr_outdate() {
        return or_outdate;
    }

    public void setOr_outdate(String or_outdate) {
        this.or_outdate = or_outdate;
    }

    public Integer getOr_checkcount() {
        return or_checkcount;
    }

    public void setOr_checkcount(Integer or_checkcount) {
        this.or_checkcount = or_checkcount;
    }

    public Integer getOr_needprice() {
        return or_needprice;
    }

    public void setOr_needprice(Integer or_needprice) {
        this.or_needprice = or_needprice;
    }

    public Integer getOr_trueprice() {
        return or_trueprice;
    }

    public void setOr_trueprice(Integer or_trueprice) {
        this.or_trueprice = or_trueprice;
    }

    public Integer getCli_id() {
        return cli_id;
    }

    public void setCli_id(Integer cli_id) {
        this.cli_id = cli_id;
    }

    public Integer getHou_id() {
        return hou_id;
    }

    public void setHou_id(Integer hou_id) {
        this.hou_id = hou_id;
    }

    public Integer getOr_state() {
        return or_state;
    }

    public void setOr_state(Integer or_state) {
        this.or_state = or_state;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "or_id=" + or_id +
                ", or_date='" + or_date + '\'' +
                ", or_checkdate='" + or_checkdate + '\'' +
                ", or_outdate='" + or_outdate + '\'' +
                ", or_checkcount=" + or_checkcount +
                ", or_needprice=" + or_needprice +
                ", or_trueprice=" + or_trueprice +
                ", cli_id=" + cli_id +
                ", hou_id=" + hou_id +
                ", or_state=" + or_state +
                '}';
    }
}
