/**
 * @Time: 2024/10/15 15:53
 * @Author: guoxun
 * @File: TbTargetRecordEntity
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
public class TargetRecordInfo {

    /**
     * 主键
     */
    @Id
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 所属图像id
     */
    private Long imageId;

    /**
     * 目标类别
     */
    private String targetClass;

    /**
     * 源数据
     */
    private String sourcePoints;

    /**
     * 旋转框四点坐标
     */
    private String rbox;

    /**
     * 旋转角度
     */
    private Double angle;


    /**
     * 水平框中心点坐标
     */
    private Double cx;

    /**
     * 水平框中心点纵坐标
     */
    private Double cy;

    /**
     * 水平框宽
     */
    private Double width;

    /**
     * 水平框高
     */
    private Double height;

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
