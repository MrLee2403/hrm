package com.company.lee.service.iservice;

import com.company.lee.dao.pojo.EmpPro;

import java.util.List;

public interface EmpProService {
    String save(EmpPro empPro);

    String update(EmpPro empPro);

    String delete(Integer eno);

    List<EmpPro> findByPage(int page, int size);

    EmpPro findById(Integer eno);
}
