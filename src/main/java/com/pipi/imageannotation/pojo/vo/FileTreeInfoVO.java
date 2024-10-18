/**
 * @Time: 2024/10/17 15:58
 * @Author: guoxun
 * @File: FileTreeInfo
 * @Description:
 */

package com.pipi.imageannotation.pojo.vo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FileTreeInfoVO {

    /**
     * 前端显示的标签名
     */
    private String label;

    /**
     * 子标签
     */
    private List<FileTreeInfoVO> children;

    /**
     * 父文件相对路径
     */
    private String fatherPath;

    /**
     * 类型
     */
    private String type;

    /**
     * 若有儿子默认填下面的对象
     */
    @JsonIgnore
    public static List<FileTreeInfoVO> getDefaultChildren(){
        FileTreeInfoVO infoVO = new FileTreeInfoVO();
        infoVO.setLabel("loading...");
        List<FileTreeInfoVO> defaultChildren = new ArrayList<>();
        defaultChildren.add(infoVO);
        return defaultChildren;
    }
}
