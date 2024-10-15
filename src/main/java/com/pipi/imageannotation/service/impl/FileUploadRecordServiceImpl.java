/**
 * @Time: 2024/10/15 17:03
 * @Author: guoxun
 * @File: FileUploadRecordServiceImpl
 * @Description:
 */

package com.pipi.imageannotation.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pipi.imageannotation.mapper.FileUploadRecordMapper;
import com.pipi.imageannotation.pojo.domain.FileUploadRecordInfo;
import com.pipi.imageannotation.service.FileUploadRecordService;
import org.springframework.stereotype.Service;


@Service
public class FileUploadRecordServiceImpl extends ServiceImpl<FileUploadRecordMapper, FileUploadRecordInfo>
        implements FileUploadRecordService {

}
