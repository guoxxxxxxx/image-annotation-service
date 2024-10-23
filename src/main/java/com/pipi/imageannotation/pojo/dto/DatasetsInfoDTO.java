/**
 * @Time: 2024/10/22 9:03
 * @Author: guoxun
 * @File: DatasetsInfoDTO
 * @Description:
 */

package com.pipi.imageannotation.pojo.dto;

import lombok.Data;

import java.util.Date;


@Data
public class DatasetsInfoDTO {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 类别id
     */
    private Integer categoryId;

    /**
     * 类别数量
     */
    private Integer classCount;

    /**
     * 创建时间-le
     */
    private Date leCreateTime;

    /**
     * 创建时间-ge
     */
    private Date geCreateTime;

    /**
     * 图片数量-le
     */
    private Integer leImageCount;

    /**
     * 图片数量-ge
     */
    private Integer geImageCount;

    /**
     * 数据集名称
     */
    private String name;
}
