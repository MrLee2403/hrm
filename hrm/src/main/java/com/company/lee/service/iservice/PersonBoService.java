package com.company.lee.service.iservice;

import com.company.lee.dao.pojo.PersonBo;

import java.util.List;

public interface PersonBoService {
    List<PersonBo> findByTimePerson(String beginTime, String endTime);
}
