package com.company.lee.dao;

import com.company.lee.dao.pojo.PersonBo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class PersonBoDaoTest {
    @Autowired
    PersonBoDao personBoDao;
    @Test
    public void findByTimePerson() {
        List<PersonBo> personBos = personBoDao.findByTimePerson("2019-08-01","2019-08-31");
        for (PersonBo personBo:personBos){
            System.err.println(personBo);
        }
    }
}