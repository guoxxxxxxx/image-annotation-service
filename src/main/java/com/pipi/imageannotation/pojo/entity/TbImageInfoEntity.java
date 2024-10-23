/**
 * @Time: 2024/10/15 14:39
 * @Author: guoxun
 * @File: ImageAnnotationInfo
 * @Description:
 */

package com.pipi.imageannotation.pojo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Table(name = "tb_image_info")
@Entity
public class TbImageInfoEntity {

    /**
     * 主键
     */
    @Id
    @TableId(type = IdType.AUTO)
    @Column(name = "id", unique = true, nullable = false, columnDefinition = "INT8 AUTO_INCREMENT")
    private Long id;

    /**
     * 图片名称
     */
    @Column(name = "name", columnDefinition = "VARCHAR(256)")
    private String name;

    /**
     * 保存路径
     */
    @Column(name = "path", columnDefinition = "TEXT")
    private String path;

    /**
     * 目标数量
     */
    @Column(name = "target_count", columnDefinition = "INT4")
    private Integer targetCount;

    /**
     * 所属数据集id
     */
    @Column(name = "dataset_id", columnDefinition = "INT8")
    private Long dataset_id;

    /**
     * 图片宽度
     */
    @Column(name = "width", columnDefinition = "DOUBLE")
    private Double width;

    /**
     * 图片高度
     */
    @Column(name = "height", columnDefinition = "DOUBLE")
    private Double height;

    /**
     * 图像大小
     */
    @Column(name = "size", columnDefinition = "INT8")
    private Long size;

    /**
     * 图片hash值
     */
    @Column(name = "hash", columnDefinition = "VARCHAR(512)")
    private String hash;

    /**
     * 图片类型
     */
    @Column(name = "type", columnDefinition = "VARCHAR(32)")
    private String type;

    /**
     * 删除位
     */
    @Column(name = "delete_bit", columnDefinition = "BOOL DEFAULT FALSE")
    private Boolean deleteBit;

    /**
     * 创建时间
     */
    @Column(name = "create_time", columnDefinition = "TIMESTAMP")
    private Date createTime;
}
