package com.company.lee.dao.pojo;

public class PersonSta {
    private Integer mBegin;
    private Integer mEnd;
    private Integer newEmp;
    private Integer dimEmp;

    public Integer getmBegin() {
        return mBegin;
    }

    public void setmBegin(Integer mBegin) {
        this.mBegin = mBegin;
    }

    public Integer getmEnd() {
        return mEnd;
    }

    public void setmEnd(Integer mEnd) {
        this.mEnd = mEnd;
    }

    public Integer getNewEmp() {
        return newEmp;
    }

    public void setNewEmp(Integer newEmp) {
        this.newEmp = newEmp;
    }

    public Integer getDimEmp() {
        return dimEmp;
    }

    public void setDimEmp(Integer dimEmp) {
        this.dimEmp = dimEmp;
    }

    @Override
    public String toString() {
        return "PersonSta{" +
                "mBegin=" + mBegin +
                ", mEnd=" + mEnd +
                ", newEmp=" + newEmp +
                ", dimEmp=" + dimEmp +
                '}';
    }
}
