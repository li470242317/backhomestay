package com.aaa.entity;

public class Relevance {
    private Integer acc_id;
    private Integer pos_id;

    @Override
    public String toString() {
        return "Relevance{" +
                "acc_id=" + acc_id +
                ", pos_id=" + pos_id +
                '}';
    }

    public Integer getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(Integer acc_id) {
        this.acc_id = acc_id;
    }

    public Integer getPos_id() {
        return pos_id;
    }

    public void setPos_id(Integer pos_id) {
        this.pos_id = pos_id;
    }
}
