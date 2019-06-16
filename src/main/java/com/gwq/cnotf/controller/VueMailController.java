package com.gwq.cnotf.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.gwq.cnotf.entity.VueCustomEntity;
import com.gwq.cnotf.service.VueMailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 14:16 2019/06/14
 */
@Api(description = "vue商城接口")
@Controller
@RequestMapping(value = "vuemail")
public class VueMailController {

    @Autowired
    private VueMailService vueMailService;

    @ApiOperation(value = "查询用户@RequestParam", notes = "查询接口@RequestParam")
    @GetMapping(value = "/query")
    @ResponseBody
    public List<VueCustomEntity> queryCustomInfo(@RequestParam Long customId) {
        return vueMailService.getListById(customId);
    }

    @ApiOperation(value = "查询用户@PathVariable", notes = "查询接口@PathVariable")
    @GetMapping(value = "/query1/{customId}")
    @ResponseBody
    public List<VueCustomEntity> queryCustomInfo1(@PathVariable Long customId) {
        return vueMailService.getListById(customId);
    }

    @ApiOperation(value = "查询用户@Query", notes = "查询接口@Query")
    @JsonView(VueCustomEntity.CustomChineseNameView.class)
    @GetMapping(value = "/queryall")
    @ResponseBody
    public List<VueCustomEntity> findAllCustomes (){
        List<VueCustomEntity> list = vueMailService.getQueryList();
        return list;
    }

    @ApiOperation(value = "查询用户@Query带参数", notes = "查询接口@Query带参数")
    @GetMapping(value = "/queryallBYid")
    @JsonView(VueCustomEntity.CustomEnglishNameView.class)
    @ResponseBody
    public List<VueCustomEntity> findAllCustomes (@RequestParam Long userId){
        List<VueCustomEntity> list = vueMailService.getQueryListById(userId);
        return list;
    }

    @ApiOperation(value = "查询用户jpa.findAll", notes = "查询接口jpa.findAll")
    @JsonView(VueCustomEntity.CustomChineseNameView.class)
    @GetMapping(value = "/queryyuanall")
    @ResponseBody
    public List<VueCustomEntity> findYuanShenAllCustomes (){
        List<VueCustomEntity> list = vueMailService.getYuanShenList();
        return list;
    }
    @ApiOperation(value = "查询用户findByCustomEnglishName", notes = "查询接口findByCustomEnglishName")
    @PostMapping(value = "/queryyuanallzidyi")
    @ResponseBody
    public List<VueCustomEntity> findzidingyi (@RequestBody VueCustomEntity vueCustomEntity){
        List<VueCustomEntity> list = vueMailService.findByCustomEnglishName(vueCustomEntity.getCustomEnglishName(),vueCustomEntity.getDeleteFlag());
        return list;
    }
}
