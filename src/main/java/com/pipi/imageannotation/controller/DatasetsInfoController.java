/**
 * @Time: 2024/10/15 16:40
 * @Author: guoxun
 * @File: DatasetsInfoController
 * @Description:
 */

package com.pipi.imageannotation.controller;

import com.pipi.imageannotation.aop.annotation.Logger;
import com.pipi.imageannotation.common.CommonResult;
import com.pipi.imageannotation.pojo.domain.DatasetsInfo;
import com.pipi.imageannotation.pojo.dto.DatasetsInfoDTO;
import com.pipi.imageannotation.pojo.vo.DatasetsTreeInfoVO;
import com.pipi.imageannotation.service.CategoryDatasetsService;
import com.pipi.imageannotation.service.DatasetsInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/datasetsInfo")
public class DatasetsInfoController {

    @Autowired
    private DatasetsInfoService datasetsInfoService;


    @Logger("获取数据集的树形结构目录")
    @ApiOperation("获取数据集的树形结构目录")
    @GetMapping("/getDatasetsTreeInfo")
    public CommonResult getDatasetsTreeInfo(){
        List<DatasetsTreeInfoVO> result = datasetsInfoService.getDatasetsTreeInfo();
        return new CommonResult().success().message("查询成功").data(result);
    }


    @Logger("获取所有数据集的名称")
    @ApiOperation("获取所有数据集的名称")
    @GetMapping("/getAllDatasetsName")
    public CommonResult getAllDatasetsName(){
        List<String> result = datasetsInfoService.getAllDatasetsName();
        return new CommonResult().success().message("查询成功").data(result);
    }


    @Logger("条件查询")
    @ApiOperation("条件查询")
    @GetMapping("")
    public CommonResult queryByCondition(DatasetsInfoDTO dto){
        List<DatasetsInfo> result = datasetsInfoService.queryByCondition(dto);
        return new CommonResult().success().message("查询成功").data(result);
    }
}
