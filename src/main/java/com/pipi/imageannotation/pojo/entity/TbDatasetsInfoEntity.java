/**
 * @Time: 2024/10/15 15:47
 * @Author: guoxun
 * @File: TbDatasetsInfoEntity
 * @Description:
 */

package com.pipi.imageannotation.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "datasets_info")
public class TbDatasetsInfoEntity {

    /**
     * 主键
     */
    @Id
    @TableId(type = IdType.AUTO)
    @Column(name = "id", unique = true, nullable = false, columnDefinition = "INT8 AUTO_INCREMENT")
    private Long id;

    /**
     * 数据集名称
     */
    @Column(name = "name", columnDefinition = "VARCHAR(256)")
    private String name;

    /**
     * 数据集所包含的图片数量
     */
    @Column(name = "image_count", columnDefinition = "INT8")
    private Long imageCount;

    /**
     * 数据集中包含的目标总数
     */
    @Column(name = "target_count", columnDefinition = "INT8")
    private Long targetCount;

    /**
     * 类别数量
     */
    @Column(name = "class_count", columnDefinition = "INT4")
    private Integer classCount;

    /**
     * 每个类别的名字 中间用 , 间隔
     */
    @Column(name = "pre_class_name", columnDefinition = "TEXT")
    private String preClassName;

    /**
     * 每个类别的数量 中间用 , 间隔
     */
    @Column(name = "pre_class_count", columnDefinition = "TEXT")
    private String preClassCount;

    /**
     * 删除位
     */
    @Column(name = "delete_bit", columnDefinition = "BOOL")
    private Boolean deleteBit;
}
