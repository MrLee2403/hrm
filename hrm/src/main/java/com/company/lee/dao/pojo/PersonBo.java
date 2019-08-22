package com.company.lee.dao.pojo;

public class PersonBo {
    private Emp emp;
    private PersonSta personSta;
    private EduSta eduSta;

    @Override
    public String toString() {
        return "PersonBo{" +
                "emp=" + emp +
                ", personSta=" + personSta +
                ", eduSta=" + eduSta +
                '}';
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public PersonSta getPersonSta() {
        return personSta;
    }

    public void setPersonSta(PersonSta personSta) {
        this.personSta = personSta;
    }

    public EduSta getEduSta() {
        return eduSta;
    }

    public void setEduSta(EduSta eduSta) {
        this.eduSta = eduSta;
    }

    public PersonBo(Emp emp, PersonSta personSta, EduSta eduSta) {
        this.emp = emp;
        this.personSta = personSta;
        this.eduSta = eduSta;
    }

    public PersonBo() {
    }
}
