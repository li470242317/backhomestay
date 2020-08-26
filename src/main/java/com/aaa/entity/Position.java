package com.aaa.entity;

public class Position {
    private Integer pos_id;
    private String pos_name;
    private String man_id;

    public Integer getPos_id() {
        return pos_id;
    }

    public void setPos_id(Integer pos_id) {
        this.pos_id = pos_id;
    }

    public String getPos_name() {
        return pos_name;
    }

    public void setPos_name(String pos_name) {
        this.pos_name = pos_name;
    }

    public String getMan_id() {
        return man_id;
    }

    public void setMan_id(String man_id) {
        this.man_id = man_id;
    }

    @Override
    public String toString() {
        return "Position{" +
                "pos_id=" + pos_id +
                ", pos_name='" + pos_name + '\'' +
                ", man_id='" + man_id + '\'' +
                '}';
    }
}
