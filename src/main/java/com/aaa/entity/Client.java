package com.aaa.entity;

import javafx.util.converter.IntegerStringConverter;

import javax.persistence.Column;
import javax.persistence.Id;

public class Client {
    @Id
    @Column
    private Integer cli_id;
    private String cli_name;
    private String cli_sex;
    private String cli_phone;
    private String cli_date;
    private String cli_place;
    private Integer cli_money;
    private String cli_email;
    private String cli_sparephone;
    private String cli_qq;
    private String cli_wechat;
    private String cli_referral;
    private String cli_prc;
    private Integer cli_rank;
    private Integer cli_price;
    private Integer ba_id;

    @Override
    public String toString() {
        return "Client{" +
                "cli_id=" + cli_id +
                ", cli_name='" + cli_name + '\'' +
                ", cli_sex='" + cli_sex + '\'' +
                ", cli_phone='" + cli_phone + '\'' +
                ", cli_date='" + cli_date + '\'' +
                ", cli_place='" + cli_place + '\'' +
                ", cli_money=" + cli_money +
                ", cli_email='" + cli_email + '\'' +
                ", cli_sparephone='" + cli_sparephone + '\'' +
                ", cli_qq='" + cli_qq + '\'' +
                ", cli_wechat='" + cli_wechat + '\'' +
                ", cli_referral='" + cli_referral + '\'' +
                ", cli_prc='" + cli_prc + '\'' +
                ", cli_rank=" + cli_rank +
                ", cli_price=" + cli_price +
                ", ba_id=" + ba_id +
                '}';
    }

    public Integer getCli_id() {
        return cli_id;
    }

    public void setCli_id(Integer cli_id) {
        this.cli_id = cli_id;
    }

    public String getCli_name() {
        return cli_name;
    }

    public void setCli_name(String cli_name) {
        this.cli_name = cli_name;
    }

    public String getCli_sex() {
        return cli_sex;
    }

    public void setCli_sex(String cli_sex) {
        this.cli_sex = cli_sex;
    }

    public String getCli_phone() {
        return cli_phone;
    }

    public void setCli_phone(String cli_phone) {
        this.cli_phone = cli_phone;
    }

    public String getCli_date() {
        return cli_date;
    }

    public void setCli_date(String cli_date) {
        this.cli_date = cli_date;
    }

    public String getCli_place() {
        return cli_place;
    }

    public void setCli_place(String cli_place) {
        this.cli_place = cli_place;
    }

    public Integer getCli_money() {
        return cli_money;
    }

    public void setCli_money(Integer cli_money) {
        this.cli_money = cli_money;
    }

    public String getCli_email() {
        return cli_email;
    }

    public void setCli_email(String cli_email) {
        this.cli_email = cli_email;
    }

    public String getCli_sparephone() {
        return cli_sparephone;
    }

    public void setCli_sparephone(String cli_sparephone) {
        this.cli_sparephone = cli_sparephone;
    }

    public String getCli_qq() {
        return cli_qq;
    }

    public void setCli_qq(String cli_qq) {
        this.cli_qq = cli_qq;
    }

    public String getCli_wechat() {
        return cli_wechat;
    }

    public void setCli_wechat(String cli_wechat) {
        this.cli_wechat = cli_wechat;
    }

    public String getCli_referral() {
        return cli_referral;
    }

    public void setCli_referral(String cli_referral) {
        this.cli_referral = cli_referral;
    }

    public String getCli_prc() {
        return cli_prc;
    }

    public void setCli_prc(String cli_prc) {
        this.cli_prc = cli_prc;
    }

    public Integer getCli_rank() {
        return cli_rank;
    }

    public void setCli_rank(Integer cli_rank) {
        this.cli_rank = cli_rank;
    }

    public Integer getCli_price() {
        return cli_price;
    }

    public void setCli_price(Integer cli_price) {
        this.cli_price = cli_price;
    }

    public Integer getBa_id() {
        return ba_id;
    }

    public void setBa_id(Integer ba_id) {
        this.ba_id = ba_id;
    }
}
