/**
 * @Time: 2024/10/18 9:29
 * @Author: guoxun
 * @File: TbCategoryDatasets
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

@Table(name = "tb_category_datasets")
@Entity
public class TbCategoryDatasetsEntity {

    /**
     * 主键
     */
    @Id
    @TableId(type = IdType.AUTO)
    @Column(name = "id", unique = true, nullable = false, columnDefinition = "INT8 AUTO_INCREMENT")
    private Long id;

    /**
     * 类别名称
     */
    @Column(name = "name", unique = true, nullable = false, columnDefinition = "VARCHAR(128)")
    private String name;

    /**
     * 创建时间
     */
    @Column(name = "create_time", columnDefinition = "TIMESTAMP")
    private Date createTime;

    /**
     * 删除位
     */
    @Column(name = "delete_bit", columnDefinition = "BOOL DEFAULT FALSE")
    private Boolean deleteBit;
}
