package com.company.lee.service.iservice;

import com.company.lee.dao.pojo.PersonBo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class PersonBoServiceTest {
@Autowired
PersonBoService personBoService;
    @Test
    public void findByTimePerson() {
        List<PersonBo> personBos = personBoService.findByTimePerson("2019-08-01","2019-08-31");
        for (PersonBo personBo:personBos){
            System.err.println(personBo);
        }
    }
}