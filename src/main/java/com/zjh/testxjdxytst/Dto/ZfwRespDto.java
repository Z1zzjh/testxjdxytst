package com.zjh.testxjdxytst.Dto;

public class ZfwRespDto {

    /**
     * status : -3
     * message : 通行记录中的姓名未填写
     * type : null
     * tag : null
     */

    private int status;
    private String message;
    private String type;
    private Object tag;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getTag() {
        return tag;
    }

    public void setTag(Object tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "ZfwRespDto{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", type='" + type + '\'' +
                ", tag=" + tag +
                '}';
    }
}
