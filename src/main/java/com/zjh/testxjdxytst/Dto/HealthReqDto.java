package com.zjh.testxjdxytst.Dto;

public class HealthReqDto {
    private String area_code;
    private String id_card;

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    @Override
    public String toString() {
        return "HealthReqDto{" +
                "area_code='" + area_code + '\'' +
                ", id_card='" + id_card + '\'' +
                '}';
    }
}
