package com.company.lee.action;

import com.company.lee.commons.ResponseResult;
import com.company.lee.commons.Result;
import com.company.lee.dao.pojo.EmpPro;
import com.company.lee.service.iservice.EmpProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmpProAction {
    @Autowired
    EmpProService empProService;

    @RequestMapping("emppro")
    public @ResponseBody
    ResponseResult<EmpPro> save(EmpPro empPro) {
        String msg = empProService.save(empPro);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new ResponseResult<EmpPro>(code, msg);
    }

    @RequestMapping(value = "empproupdate", method = RequestMethod.POST)
    public @ResponseBody
    ResponseResult<EmpPro> update(EmpPro empPro) {
        String msg = empProService.update(empPro);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new ResponseResult<EmpPro>(code, msg);
    }

    @RequestMapping(value = "emppro/{eno}", method = RequestMethod.DELETE)
    public @ResponseBody
    ResponseResult<EmpPro> delete(Integer eno) {
        String msg = empProService.delete(eno);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new ResponseResult<EmpPro>(code, msg);
    }

    @RequestMapping(value = "emppros")
    public @ResponseBody
    ResponseResult<List<EmpPro>> findByPage(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "size", required = false, defaultValue = "5") int size) {
        List<EmpPro> empPros = empProService.findByPage(page, size);
        if (empPros != null && empPros.size() > 0) {
            return new ResponseResult<List<EmpPro>>(200, Result.SUCCESS, empPros);
        } else {
            return new ResponseResult<List<EmpPro>>(500, Result.ERROR);
        }
    }

    @RequestMapping(value = "emppro/{eno}")
    public @ResponseBody
    ResponseResult<EmpPro> findById(Integer eno) {
        EmpPro empPro = empProService.findById(eno);
        if (empPro != null) {
            return new ResponseResult<EmpPro>(200, Result.SUCCESS, empPro);
        } else {
            return new ResponseResult<EmpPro>(500, Result.ERROR);
        }
    }
}
