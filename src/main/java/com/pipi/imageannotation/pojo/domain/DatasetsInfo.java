/**
 * @Time: 2024/10/15 15:47
 * @Author: guoxun
 * @File: TbDatasetsInfoEntity
 * @Description:
 */

package com.pipi.imageannotation.pojo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tb_datasets_info")
public class DatasetsInfo {

    /**
     * 主键
     */
    @Id
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 数据集名称
     */
    private String name;

    /**
     * 数据集所包含的图片数量
     */
    private Long imageCount;

    /**
     * 数据集中包含的目标总数
     */
    private Long targetCount;

    /**
     * 类别数量
     */
    private Integer classCount;

    /**
     * 每个类别的名字 中间用 , 间隔
     */
    private String preClassName;

    /**
     * 每个类别的数量 中间用 , 间隔
     */
    private String preClassCount;

    /**
     * 删除位
     */
    private Boolean deleteBit;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 所属类别id
     */
    private Long categoryId;
}
