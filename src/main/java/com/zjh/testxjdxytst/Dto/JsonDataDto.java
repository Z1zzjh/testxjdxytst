package com.zjh.testxjdxytst.Dto;

import java.util.List;

public class JsonDataDto<T> {
    private List<T> data;
    private Integer totalNum;

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
