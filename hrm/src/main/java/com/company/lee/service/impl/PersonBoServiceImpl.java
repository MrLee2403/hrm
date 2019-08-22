package com.company.lee.service.impl;

import com.company.lee.dao.PersonBoDao;
import com.company.lee.dao.pojo.PersonBo;
import com.company.lee.service.iservice.PersonBoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
@Service("personBoService")
public class PersonBoServiceImpl implements PersonBoService {
    @Autowired
    PersonBoDao personBoDao;
    @Override
    public List<PersonBo> findByTimePerson(String beginTime, String endTime) {
        if (beginTime != "" || endTime != "") {
            return personBoDao.findByTimePerson(beginTime, endTime);
        } else {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String firstday, lastday;
            Calendar cale = null;
            cale = Calendar.getInstance();
            cale.add(Calendar.MONTH, 0);
            cale.set(Calendar.DAY_OF_MONTH, 1);
            firstday = format.format(cale.getTime());
            cale = Calendar.getInstance();
            cale.add(Calendar.MONTH, 1);
            cale.set(Calendar.DAY_OF_MONTH, 0);
            lastday = format.format(cale.getTime());
            return personBoDao.findByTimePerson(firstday,lastday);
        }
    }
}
