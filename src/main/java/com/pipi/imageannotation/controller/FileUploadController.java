/**
 * @Time: 2024/10/15 16:51
 * @Author: guoxun
 * @File: FileUploadController
 * @Description:
 */

package com.pipi.imageannotation.controller;


import com.pipi.imageannotation.aop.annotation.Logger;
import com.pipi.imageannotation.common.CommonResult;
import com.pipi.imageannotation.service.FileUploadRecordService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/upload")
public class FileUploadController {

    @Autowired
    FileUploadRecordService fileUploadRecordService;

}