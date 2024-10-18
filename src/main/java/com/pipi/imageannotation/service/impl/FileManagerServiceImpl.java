/**
 * @Time: 2024/10/15 17:29
 * @Author: guoxun
 * @File: FileManagerServiceImpl
 * @Description:
 */

package com.pipi.imageannotation.service.impl;

import com.pipi.imageannotation.pojo.domain.FileInfo;
import com.pipi.imageannotation.pojo.vo.FileTreeInfoVO;
import com.pipi.imageannotation.service.FileManagerService;
import com.pipi.imageannotation.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class FileManagerServiceImpl implements FileManagerService {

    @Value("${file-manager.default-file-path}")
    private String defaultPath;

    @Override
    public List<FileTreeInfoVO> getFileStructInfoByPath(String filePath, Boolean needDetails) throws IOException {
        List<FileTreeInfoVO> result = new ArrayList<>();
        Path path = Paths.get(defaultPath + "/" + filePath);
        try (Stream<Path> paths = Files.list(path)) {
            paths.forEach(e -> {
                try {
                    FileTreeInfoVO fileTreeInfoVO = new FileTreeInfoVO();
                    FileInfo info = FileUtils.getFileInfoByFile(e, needDetails);
                    String fatherPath = info.getLocalPath().substring(defaultPath.length())
                            .replace("\\", "/");
                    if (info.getType().equalsIgnoreCase("folder")){
                        fileTreeInfoVO.setLabel("🗂️" + info.getFilename());
                        fileTreeInfoVO.setChildren(FileTreeInfoVO.getDefaultChildren());
                    }
                    else if (info.getType().equalsIgnoreCase("zip")){
                        fileTreeInfoVO.setLabel("📦" + info.getFilename());
                    }
                    else if (info.getType().contains("bmp, jpg, png")){
                        fileTreeInfoVO.setLabel("🖼️" + info.getFilename());
                    }
                    else {
                        fileTreeInfoVO.setLabel("❔" + info.getFilename());
                    }
                    if (StringUtils.hasLength(fatherPath))
                        fileTreeInfoVO.setFatherPath(fatherPath + "/");
                    else
                        fileTreeInfoVO.setFatherPath("/");
                    fileTreeInfoVO.setType(info.getType());
                    result.add(fileTreeInfoVO);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            });
            return result;
        }
    }
}
