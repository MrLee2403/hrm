package com.company.lee.dao;

import com.company.lee.dao.pojo.PersonBo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonBoDao {
    List<PersonBo> findByTimePerson(@Param("beginTime") String beginTime, @Param("endTime") String endTime);
}
