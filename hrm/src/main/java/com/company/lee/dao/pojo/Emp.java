package com.company.lee.dao.pojo;

import java.util.Date;

public class Emp {
    private Integer eno;

    private Integer jno;

    private Integer dno;

    private String ename;

    private String esex;

    private Date ebirthday;

    private Integer eid;

    private String eedu;

    private Date hireday;

    private Date jobstartday;

    private String estate;

    private String etype;

    private String efrom;

    public Emp(Integer eno, Integer jno, Integer dno, String ename, String esex, Date ebirthday, Integer eid, String eedu, Date hireday, Date jobstartday, String estate, String etype, String efrom) {
        this.eno = eno;
        this.jno = jno;
        this.dno = dno;
        this.ename = ename;
        this.esex = esex;
        this.ebirthday = ebirthday;
        this.eid = eid;
        this.eedu = eedu;
        this.hireday = hireday;
        this.jobstartday = jobstartday;
        this.estate = estate;
        this.etype = etype;
        this.efrom = efrom;
    }

    public Emp() {
        super();
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public Integer getJno() {
        return jno;
    }

    public void setJno(Integer jno) {
        this.jno = jno;
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex == null ? null : esex.trim();
    }

    public Date getEbirthday() {
        return ebirthday;
    }

    public void setEbirthday(Date ebirthday) {
        this.ebirthday = ebirthday;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEedu() {
        return eedu;
    }

    public void setEedu(String eedu) {
        this.eedu = eedu == null ? null : eedu.trim();
    }

    public Date getHireday() {
        return hireday;
    }

    public void setHireday(Date hireday) {
        this.hireday = hireday;
    }

    public Date getJobstartday() {
        return jobstartday;
    }

    public void setJobstartday(Date jobstartday) {
        this.jobstartday = jobstartday;
    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate == null ? null : estate.trim();
    }

    public String getEtype() {
        return etype;
    }

    public void setEtype(String etype) {
        this.etype = etype == null ? null : etype.trim();
    }

    public String getEfrom() {
        return efrom;
    }

    public void setEfrom(String efrom) {
        this.efrom = efrom == null ? null : efrom.trim();
    }
}