package com.gwq.cnotf.controller;

import com.gwq.cnotf.entity.TcPfVarEntity;
import com.gwq.cnotf.service.TcPfVarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "测试接口")
@Controller
@RequestMapping("hello")
public class HelloController {

    private Log log = LogFactory.getLog(HelloController.class);

    @Autowired
    private TcPfVarService tsPfVarService;

    @ApiOperation(value = "测试oracle数据源",notes = "测试oracle数据源")
    @GetMapping("/view")
    @ResponseBody
    public List<TcPfVarEntity> getValue() {
        long a = tsPfVarService.findcount();
        System.out.println("============="+a);
        return tsPfVarService.find();
    }

    @ApiOperation(value = "测试接口",notes = "测试返回值")
    @GetMapping("/view1")
    @ResponseBody
    public String getValue1(@RequestParam String value) {
        return value;
    }


    @ApiOperation(value = "新增用户",notes = "返回hello.jsp页面")
    @PostMapping("/aaa")
    public String getValue2() {
        return "hello";
    }
}

