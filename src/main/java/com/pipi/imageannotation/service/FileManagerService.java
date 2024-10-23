package com.pipi.imageannotation.service;

import com.pipi.imageannotation.pojo.vo.FileTreeInfoVO;

import java.io.IOException;
import java.util.List;

public interface FileManagerService {

    /**
     * 根据文件夹路径查询文件目录结构
     * @param path 文件夹路径
     * @return 文件目录结构
     */
    List<FileTreeInfoVO> getFileStructInfoByPath(String path, Boolean needDetails) throws IOException;

}
