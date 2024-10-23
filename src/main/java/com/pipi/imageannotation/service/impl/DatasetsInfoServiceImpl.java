/**
 * @Time: 2024/10/15 16:43
 * @Author: guoxun
 * @File: DatasetsInfoServiceImpl
 * @Description:
 */

package com.pipi.imageannotation.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pipi.imageannotation.mapper.CategoryDatasetsMapper;
import com.pipi.imageannotation.mapper.DatasetsInfoMapper;
import com.pipi.imageannotation.pojo.domain.CategoryDatasetsInfo;
import com.pipi.imageannotation.pojo.domain.DatasetsInfo;
import com.pipi.imageannotation.pojo.dto.DatasetsInfoDTO;
import com.pipi.imageannotation.pojo.vo.DatasetsTreeInfoVO;
import com.pipi.imageannotation.service.DatasetsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class DatasetsInfoServiceImpl extends ServiceImpl<DatasetsInfoMapper, DatasetsInfo> implements DatasetsInfoService {

    @Autowired
    CategoryDatasetsMapper categoryDatasetsMapper;


    @Override
    public List<DatasetsTreeInfoVO> getDatasetsTreeInfo() {

        List<DatasetsTreeInfoVO> result = new ArrayList<>();
        List<DatasetsInfo> datasetsInfoList = baseMapper.selectList(new QueryWrapper<>());
        Map<Long, List<DatasetsTreeInfoVO>> childrenMap = new HashMap<>();
        for (DatasetsInfo info : datasetsInfoList){
            if (!childrenMap.containsKey(info.getCategoryId())){
                List<DatasetsTreeInfoVO> voList = new ArrayList<>();
                childrenMap.put(info.getCategoryId(), voList);
            }
            DatasetsTreeInfoVO vo = DatasetsTreeInfoVO.getNonChildrenObj(info.getName());
            childrenMap.get(info.getCategoryId()).add(vo);
        }

        List<CategoryDatasetsInfo> categoryInfoList = categoryDatasetsMapper.selectList(new LambdaQueryWrapper<>());
        for (CategoryDatasetsInfo info : categoryInfoList){
            DatasetsTreeInfoVO vo = new DatasetsTreeInfoVO();
            vo.setLabel(info.getName());
            vo.setChildren(childrenMap.get(info.getId()));
            result.add(vo);
        }

        return result;
    }


    @Override
    public List<String> getAllDatasetsName() {
        return baseMapper.selectDatasetsNameList();
    }


    @Override
    public List<DatasetsInfo> queryByCondition(DatasetsInfoDTO dto) {
        List<DatasetsInfo> result = baseMapper.selectList(new LambdaQueryWrapper<DatasetsInfo>()
                .eq(dto.getId() != null, DatasetsInfo::getId, dto.getId())
                .eq(dto.getCategoryId() != null, DatasetsInfo::getCategoryId, dto.getCategoryId())
                .eq(dto.getClassCount() != null, DatasetsInfo::getClassCount, dto.getClassCount())
                .le(dto.getLeCreateTime() != null, DatasetsInfo::getCreateTime, dto.getLeCreateTime())
                .ge(dto.getGeCreateTime() != null, DatasetsInfo::getCreateTime, dto.getGeCreateTime())
                .le(dto.getLeImageCount() != null, DatasetsInfo::getImageCount, dto.getLeImageCount())
                .ge(dto.getGeImageCount() != null, DatasetsInfo::getImageCount, dto.getGeImageCount())
                .like(dto.getName() != null, DatasetsInfo::getName, dto.getName())
                .eq(DatasetsInfo::getDeleteBit, false));
        return result;
    }
}
