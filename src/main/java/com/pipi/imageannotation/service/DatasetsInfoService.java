package com.pipi.imageannotation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pipi.imageannotation.pojo.domain.DatasetsInfo;
import com.pipi.imageannotation.pojo.dto.DatasetsInfoDTO;
import com.pipi.imageannotation.pojo.vo.DatasetsTreeInfoVO;

import java.util.List;

public interface DatasetsInfoService extends IService<DatasetsInfo> {

    /**
     * 获取数据集结构树
     */
    List<DatasetsTreeInfoVO> getDatasetsTreeInfo();


    /**
     * 获取所有数据集的名称
     */
    List<String> getAllDatasetsName();


    /**
     * 条件查询
     */
    List<DatasetsInfo> queryByCondition(DatasetsInfoDTO dto);
}
