/**
 * @Time: 2024/10/18 16:16
 * @Author: guoxun
 * @File: DatasetsCategoryController
 * @Description:
 */

package com.pipi.imageannotation.controller;


import com.pipi.imageannotation.aop.annotation.Logger;
import com.pipi.imageannotation.common.CommonResult;
import com.pipi.imageannotation.pojo.domain.CategoryDatasetsInfo;
import com.pipi.imageannotation.pojo.dto.DatasetsCategoryDTO;
import com.pipi.imageannotation.service.CategoryDatasetsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categoryDatasets")
public class DatasetsCategoryController {

    @Autowired
    CategoryDatasetsService categoryDatasetsService;


    @Logger("获取所有类别")
    @ApiOperation("获取所有类别")
    @GetMapping("/getAllCategories")
    public CommonResult getAllCategories(){
        List<CategoryDatasetsInfo> result =  categoryDatasetsService.getAllCategories();
        return new CommonResult().message("查询成功").success().data(result);
    }


    @Logger("添加新类别")
    @ApiOperation("添加新类别")
    @PutMapping("")
    public CommonResult addNewCategory(@RequestBody DatasetsCategoryDTO dto){
        Boolean result = categoryDatasetsService.insertOne(dto);
        return new CommonResult().message("添加成功").success().data(result);
    }
}
