package com.company.lee.action;

import com.company.lee.commons.ResponseResult;
import com.company.lee.commons.Result;
import com.company.lee.dao.pojo.Dept;
import com.company.lee.service.iservice.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DeptAction {
    @Autowired
    DeptService deptService;

    @RequestMapping(value = "dept", method = RequestMethod.POST)
    public @ResponseBody
    ResponseResult<Dept> save(Dept dept) {
        String msg = deptService.save(dept);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new ResponseResult<Dept>(code, msg);
    }

    @RequestMapping(value = "dept/{dno}", method = RequestMethod.DELETE)
    public @ResponseBody
    ResponseResult<Dept> delete(@PathVariable("dno") Integer dno) {
        String msg = deptService.delete(dno);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new ResponseResult<Dept>(code, msg);
    }

    @RequestMapping(value = "deptupdate", method = RequestMethod.POST)
    public @ResponseBody
    ResponseResult<Dept> update(Dept dept) {
        String msg = deptService.update(dept);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new ResponseResult<Dept>(code, msg);
    }

    @RequestMapping(value = "depts")
    public @ResponseBody
    ResponseResult<List<Dept>> findByPage(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "size", required = false, defaultValue = "5") int size) {
        List<Dept> depts = deptService.findByPage(page, size);
        if (depts != null && depts.size() > 0) {
            return new ResponseResult<List<Dept>>(200, Result.SUCCESS, depts);
        } else {
            return new ResponseResult<List<Dept>>(500, Result.ERROR);
        }
    }

    @RequestMapping("depts/{dname}")
    public @ResponseBody
    ResponseResult<List<Dept>> findByName(@PathVariable("dname") String dname) {
        List<Dept> depts = deptService.findByName(dname);
        if (depts != null && depts.size() > 0) {
            return new ResponseResult<List<Dept>>(200, Result.SUCCESS, depts);
        } else {
            return new ResponseResult<List<Dept>>(500, Result.ERROR);
        }
    }

    @RequestMapping("dept/{dno}")
    public @ResponseBody
    ResponseResult<Dept> findById(@PathVariable("dno") int dno) {
        Dept dept = deptService.findById(dno);
        if (dept != null) {
            return new ResponseResult<Dept>(200, Result.SUCCESS, dept);
        } else {
            return new ResponseResult<Dept>(500, Result.ERROR);
        }
    }
}
