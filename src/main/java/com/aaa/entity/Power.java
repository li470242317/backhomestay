package com.aaa.entity;

public class Power {
    private Integer pow_id;
    private String pow_name;
    private String pow_url;
    private Integer power_ids;

    @Override
    public String toString() {
        return "Power{" +
                "pow_id=" + pow_id +
                ", pow_name='" + pow_name + '\'' +
                ", pow_url='" + pow_url + '\'' +
                ", power_ids=" + power_ids +
                '}';
    }

    public Integer getPower_ids() {
        return power_ids;
    }

    public void setPower_ids(Integer power_ids) {
        this.power_ids = power_ids;
    }
    public Integer getPow_id() {
        return pow_id;
    }

    public void setPow_id(Integer pow_id) {
        this.pow_id = pow_id;
    }

    public String getPow_name() {
        return pow_name;
    }

    public void setPow_name(String pow_name) {
        this.pow_name = pow_name;
    }

    public String getPow_url() {
        return pow_url;
    }

    public void setPow_url(String pow_url) {
        this.pow_url = pow_url;
    }
}
