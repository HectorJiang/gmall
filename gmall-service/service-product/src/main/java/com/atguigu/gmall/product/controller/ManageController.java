package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.product.service.ManageService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HectorJiang
 * @description
 * @date 12/4/2023
 */

@Api(tags = "后台管理")
@RestController
@RequestMapping("/admin/product")
public class ManageController {
    @Autowired
    private ManageService manageService;

    @GetMapping("/getCategory1")
    public Result getCategory1() {
        return Result.ok(manageService.getCategory1());
    }

    @GetMapping("/getCategory2/{category1Id}")
    public Result getCategory2(@PathVariable Long category1Id) {
        return Result.ok(manageService.getCategory2(category1Id));
    }

    @GetMapping("/getCategory3/{category2Id}")
    public Result getCategory3(@PathVariable Long category2Id) {
        return Result.ok(manageService.getCategory3(category2Id));
    }

    @GetMapping("/attrInfoList/{category1Id}/{category2Id}/{category3Id}")
    public Result getAttrInfoList(@PathVariable Long category1Id,
                                  @PathVariable Long category2Id,
                                  @PathVariable Long category3Id) {
        return Result.ok(manageService.getAttrInfoList(category1Id, category2Id, category3Id));
    }
}