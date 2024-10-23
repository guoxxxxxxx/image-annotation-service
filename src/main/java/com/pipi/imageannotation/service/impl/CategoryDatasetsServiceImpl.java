/**
 * @Time: 2024/10/18 9:39
 * @Author: guoxun
 * @File: CategoryDatasetsServiceImpl
 * @Description:
 */

package com.pipi.imageannotation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pipi.imageannotation.common.CommonException;
import com.pipi.imageannotation.mapper.CategoryDatasetsMapper;
import com.pipi.imageannotation.pojo.domain.CategoryDatasetsInfo;
import com.pipi.imageannotation.pojo.dto.DatasetsCategoryDTO;
import com.pipi.imageannotation.service.CategoryDatasetsService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryDatasetsServiceImpl extends ServiceImpl<CategoryDatasetsMapper, CategoryDatasetsInfo>
        implements CategoryDatasetsService{

    @Override
    public List<CategoryDatasetsInfo> getAllCategories() {
        return baseMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public Boolean insertOne(DatasetsCategoryDTO dto) {
        CategoryDatasetsInfo entity = new CategoryDatasetsInfo();
        BeanUtils.copyProperties(dto, entity);
        if (baseMapper.exists(new LambdaQueryWrapper<CategoryDatasetsInfo>()
                .eq(CategoryDatasetsInfo::getName, dto.getName()))){
            throw new CommonException("当前类别已经存在");
        }
        else {
            int insert = baseMapper.insert(entity);
            return insert == 1;
        }
    }
}
