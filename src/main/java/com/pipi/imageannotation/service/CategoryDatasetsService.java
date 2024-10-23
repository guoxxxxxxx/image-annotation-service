package com.pipi.imageannotation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pipi.imageannotation.pojo.domain.CategoryDatasetsInfo;
import com.pipi.imageannotation.pojo.dto.DatasetsCategoryDTO;

import java.util.List;

public interface CategoryDatasetsService extends IService<CategoryDatasetsInfo> {

    /**
     * 获取所有类别
     */
    List<CategoryDatasetsInfo> getAllCategories();


    /**
     * 添加新的类别
     */
    Boolean insertOne(DatasetsCategoryDTO dto);
}
