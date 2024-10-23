/**
 * @Time: 2024/10/18 9:32
 * @Author: guoxun
 * @File: CategoryDatasetsInfo
 * @Description:
 */

package com.pipi.imageannotation.pojo.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tb_category_datasets")
public class CategoryDatasetsInfo {

    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 类别名称
     */
    private String name;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 删除位
     */
    private Boolean deleteBit;
}
