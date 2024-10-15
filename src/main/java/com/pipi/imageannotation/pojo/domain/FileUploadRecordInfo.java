/**
 * @Time: 2024/10/15 16:56
 * @Author: guoxun
 * @File: TbFileUploadRecordEntity
 * @Description:
 */

package com.pipi.imageannotation.pojo.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;


@Data
public class FileUploadRecordInfo {

    @Id
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 类型
     */
    private String type;

    /**
     * 文件大小
     */
    private Long size;

    /**
     * 上传目录
     */
    private String targetPath;

    /**
     * 删除位
     */
    private Boolean deleteBit;
}
