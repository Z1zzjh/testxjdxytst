package com.zjh.testxjdxytst.Dto;

public class HealthInfoDto {
    private String result;
    private String msg;
    private String check_result;
    private String check_result2;
    private String check_time;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCheck_result() {
        return check_result;
    }

    public void setCheck_result(String check_result) {
        this.check_result = check_result;
    }

    public String getCheck_result2() {
        return check_result2;
    }

    public void setCheck_result2(String check_result2) {
        this.check_result2 = check_result2;
    }

    public String getCheck_time() {
        return check_time;
    }

    public void setCheck_time(String check_time) {
        this.check_time = check_time;
    }

    @Override
    public String toString() {
        return "HealthInfoDto{" +
                "result='" + result + '\'' +
                ", msg='" + msg + '\'' +
                ", check_result='" + check_result + '\'' +
                ", check_result2='" + check_result2 + '\'' +
                ", check_time='" + check_time + '\'' +
                '}';
    }
}
