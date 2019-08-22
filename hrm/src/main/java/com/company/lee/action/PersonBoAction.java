package com.company.lee.action;

import com.company.lee.dao.pojo.PersonBo;
import com.company.lee.service.iservice.PersonBoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("freemarker")
public class PersonBoAction {
    @Autowired
    PersonBoService personBoService;

    @RequestMapping(value = "time.do")
    public String findByTime(Map<String, Object> map, @RequestParam(value = "begintime") String begintime,
                             @RequestParam(value = "endtime") String endtime) {
        List<PersonBo> personBoList = personBoService.findByTimePerson(begintime, endtime);
        map.put("names", personBoList);
        return "demo";
    }

}
