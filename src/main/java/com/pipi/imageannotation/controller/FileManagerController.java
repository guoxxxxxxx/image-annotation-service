/**
 * @Time: 2024/10/15 17:27
 * @Author: guoxun
 * @File: FileManagerController
 * @Description:
 */

package com.pipi.imageannotation.controller;


import com.pipi.imageannotation.aop.annotation.Logger;
import com.pipi.imageannotation.common.CommonResult;
import com.pipi.imageannotation.pojo.domain.FileInfo;
import com.pipi.imageannotation.pojo.vo.FileTreeInfoVO;
import com.pipi.imageannotation.service.FileManagerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/fileManager")
public class FileManagerController {

    @Autowired
    private FileManagerService fileManagerService;

    @Logger("根据路径来展示文件结构信息")
    @ApiOperation("根据路径来展示文件结构信息")
    @GetMapping("/getFileStructInfoByPath")
    public CommonResult getFileInfoByPath(@RequestParam(required = false, defaultValue = "/") String path
            , @RequestParam(required = false, defaultValue = "false") Boolean needDetails) throws IOException {
        List<FileTreeInfoVO> fileInfoList = fileManagerService.getFileStructInfoByPath(path, needDetails);
        return new CommonResult().success().message("查询成功").data(fileInfoList);
    }
}
