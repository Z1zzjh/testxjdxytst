package com.zjh.testxjdxytst.Dto;

import org.apache.tomcat.util.collections.SynchronizedQueue;

import java.util.concurrent.locks.ReentrantLock;

public class FanchaDto {
    private String msg;
    private Integer resultCode;
    private FanchaJsonDataDto jsonData;

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

    public FanchaJsonDataDto getJsonData() {
        return jsonData;
    }

    public void setJsonData(FanchaJsonDataDto jsonData) {
        this.jsonData = jsonData;
    }
    
}
