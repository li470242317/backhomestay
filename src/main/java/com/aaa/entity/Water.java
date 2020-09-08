package com.aaa.entity;

public class Water {
    private Integer wat_id;
    private Integer wat_money;
    private String wat_date;
    private Integer or_id;
    private Integer wat_state;

    public Integer getWat_id() {
        return wat_id;
    }

    public void setWat_id(Integer wat_id) {
        this.wat_id = wat_id;
    }

    public Integer getWat_money() {
        return wat_money;
    }

    public void setWat_money(Integer wat_money) {
        this.wat_money = wat_money;
    }

    public String getWat_date() {
        return wat_date;
    }

    public void setWat_date(String wat_date) {
        this.wat_date = wat_date;
    }

    public Integer getOr_id() {
        return or_id;
    }

    public void setOr_id(Integer or_id) {
        this.or_id = or_id;
    }

    public Integer getWat_state() {
        return wat_state;
    }

    public void setWat_state(Integer wat_state) {
        this.wat_state = wat_state;
    }

    @Override
    public String toString() {
        return "Water{" +
                "wat_id=" + wat_id +
                ", wat_money=" + wat_money +
                ", wat_date='" + wat_date + '\'' +
                ", or_id=" + or_id +
                ", wat_state=" + wat_state +
                '}';
    }
}
