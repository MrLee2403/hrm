package com.company.lee.dao.pojo;

public class Job {
    private Integer jno;

    private String jname;

    private String jtype;

    public Job(Integer jno, String jname, String jtype) {
        this.jno = jno;
        this.jname = jname;
        this.jtype = jtype;
    }

    public Job() {
        super();
    }

    public Integer getJno() {
        return jno;
    }

    public void setJno(Integer jno) {
        this.jno = jno;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname == null ? null : jname.trim();
    }

    public String getJtype() {
        return jtype;
    }

    public void setJtype(String jtype) {
        this.jtype = jtype == null ? null : jtype.trim();
    }

    @Override
    public String toString() {
        return "Job{" +
                "jno=" + jno +
                ", jname='" + jname + '\'' +
                ", jtype='" + jtype + '\'' +
                '}';
    }
}