package com.zjh.testxjdxytst;

public class IrdsPersonUpdateDto {
    private String humanName;
    private String humanCrednum;
    //预留字段，学工号
    private String resStr3;
    private Integer humanMale;
    //人员标识,用于修改
    private String rowKey;
    //脸谱库id
    private Integer facelibId;
    private String facePicurl;

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public String getHumanCrednum() {
        return humanCrednum;
    }

    public void setHumanCrednum(String humanCrednum) {
        this.humanCrednum = humanCrednum;
    }

    public String getResStr3() {
        return resStr3;
    }

    public void setResStr3(String resStr3) {
        this.resStr3 = resStr3;
    }

    public Integer getHumanMale() {
        return humanMale;
    }

    public void setHumanMale(Integer humanMale) {
        this.humanMale = humanMale;
    }

    public String getRowKey() {
        return rowKey;
    }

    public void setRowKey(String rowKey) {
        this.rowKey = rowKey;
    }

    public Integer getFacelibId() {
        return facelibId;
    }

    public void setFacelibId(Integer facelibId) {
        this.facelibId = facelibId;
    }

    public String getFacePicurl() {
        return facePicurl;
    }

    public void setFacePicurl(String facePicurl) {
        this.facePicurl = facePicurl;
    }
}
