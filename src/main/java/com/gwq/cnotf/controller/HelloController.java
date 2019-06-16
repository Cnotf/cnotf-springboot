package com.gwq.cnotf.controller;

import com.gwq.cnotf.service.TsPfVarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(description = "测试接口")
@Controller
@RequestMapping("hello")
public class HelloController {

    private Log log = LogFactory.getLog(HelloController.class);
    @Autowired
    private TsPfVarService tsPfVarService;

   /* @GetMapping("/view")
    @ResponseBody
    public List<TsPfVarEntity> getValue() {
        long a = tsPfVarService.findcount();
        System.out.println("============="+a);
        return tsPfVarService.find();
    }*/

    @ApiOperation(value = "测试接口",notes = "测试")
    @GetMapping("/view1")
    @ResponseBody
    public String getValue1(@RequestParam String value) {
        return value;
    }


    @ApiOperation(value = "新增用户",notes = "新增注册")
    @PostMapping("/aaa")
    public String getValue2() {
        return "hello";
    }
}

