/**
 * @Time: 2024/10/15 14:39
 * @Author: guoxun
 * @File: ImageAnnotationInfo
 * @Description:
 */

package com.pipi.imageannotation.pojo.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;


@Data
public class ImageInfo {

    /**
     * 主键
     */
    @Id
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 图片名称
     */
    private String name;

    /**
     * 保存路径
     */
    private String path;

    /**
     * 目标数量
     */
    private Integer targetCount;

    /**
     * 所属数据集id
     */
    private Long dataset_id;

    /**
     * 图片宽度
     */
    private Double width;

    /**
     * 图片高度
     */
    private Double height;

    /**
     * 图像大小
     */
    private Long size;

    /**
     * 图片hash值
     */
    private String hash;

    /**
     * 图片类型
     */
    private String type;

    /**
     * 删除位
     */
    private Boolean deleteBit;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
