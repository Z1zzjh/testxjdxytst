package com.zjh.testxjdxytst;


public class FaseResponse {
    private Integer resultCode;
    private String msg;

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "FaseResponse{" +
                "resultCode=" + resultCode +
                ", msg='" + msg + '\'' +
                '}';
    }
}
