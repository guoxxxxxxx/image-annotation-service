/**
 * @Time: 2024/10/15 15:53
 * @Author: guoxun
 * @File: TbTargetRecordEntity
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

@Entity
@Table(name = "tb_target_record")
public class TbTargetRecordEntity {

    /**
     * 主键
     */
    @Id
    @TableId(type = IdType.AUTO)
    @Column(name = "id", unique = true, nullable = false, columnDefinition = "INT8 AUTO_INCREMENT")
    private Long id;

    /**
     * 所属图像id
     */
    @Column(name = "image_id", columnDefinition = "INT8")
    private Long imageId;

    /**
     * 目标类别
     */
    @Column(name = "target_class", columnDefinition = "VARCHAR(128)")
    private String targetClass;

    /**
     * 源数据
     */
    @Column(name = "source_points", columnDefinition = "TEXT")
    private String sourcePoints;

    /**
     * 旋转框四点坐标
     */
    @Column(name = "rbox", columnDefinition = "VARCHAR(4096)")
    private String rbox;

    /**
     * 旋转角度
     */
    @Column(name = "angle", columnDefinition = "DOUBLE")
    private Double angle;


    /**
     * 水平框中心点坐标
     */
    @Column(name = "cx", columnDefinition = "DOUBLE")
    private Double cx;

    /**
     * 水平框中心点纵坐标
     */
    @Column(name =  "cy", columnDefinition = "DOUBLE")
    private Double cy;

    /**
     * 水平框宽
     */
    @Column(name = "width", columnDefinition = "DOUBLE")
    private Double width;

    /**
     * 水平框高
     */
    @Column(name = "height", columnDefinition = "DOUBLE")
    private Double height;

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
