/**
 * @Time: 2024/10/15 16:56
 * @Author: guoxun
 * @File: TbFileUploadRecordEntity
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
@Table(name = "tb_file_upload_record")
public class TbFileUploadRecordEntity {

    @Id
    @TableId(type = IdType.AUTO)
    @Column(name = "id", unique = true, nullable = false, columnDefinition = "int8")
    private Long id;

    /**
     * 创建时间
     */
    @Column(name = "create_time", columnDefinition = "timestamp")
    private Date createTime;

    /**
     * 类型
     */
    @Column(name = "type", columnDefinition = "varchar(32)")
    private String type;

    /**
     * 文件大小
     */
    @Column(name = "size", columnDefinition = "int8")
    private Long size;

    /**
     * 上传目录
     */
    @Column(name = "target_path", columnDefinition = "text")
    private String targetPath;

    /**
     * 删除位
     */
    @Column(name = "delete_bit", columnDefinition = "BOOL DEFAULT FALSE")
    private Boolean deleteBit;
}
