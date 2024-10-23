/**
 * @Time: 2024/10/18 10:43
 * @Author: guoxun
 * @File: DatasetsTreeInfoVO
 * @Description:
 */

package com.pipi.imageannotation.pojo.vo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class DatasetsTreeInfoVO {

    /**
     * 文件夹名称
     */
    private String label;

    /**
     * 子项目
     */
    private List<DatasetsTreeInfoVO> children;

    /**
     * 快速获取子项目
     */
    @JsonIgnore
    public static DatasetsTreeInfoVO getNonChildrenObj(String label){
        DatasetsTreeInfoVO NoneChildrenVo = new DatasetsTreeInfoVO();
        NoneChildrenVo.setLabel(label);
        NoneChildrenVo.setChildren(null);
        return NoneChildrenVo;
    }
}
