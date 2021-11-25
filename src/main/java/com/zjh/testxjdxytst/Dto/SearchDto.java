package com.zjh.testxjdxytst.Dto;

import java.util.List;

public class SearchDto {
    private String msg;
    private Integer resultCode;
    private JsonDataDto jsonData;


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public JsonDataDto getJsonData() {
        return jsonData;
    }

    public void setJsonData(JsonDataDto jsonData) {
        this.jsonData = jsonData;
    }
}
