/**
 * @Time: 2024/10/15 16:43
 * @Author: guoxun
 * @File: DatasetsInfoServiceImpl
 * @Description:
 */

package com.pipi.imageannotation.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pipi.imageannotation.mapper.DatasetsInfoMapper;
import com.pipi.imageannotation.pojo.domain.DatasetsInfo;
import com.pipi.imageannotation.service.DatasetsInfoService;
import org.springframework.stereotype.Service;


@Service
public class DatasetsInfoServiceImpl extends ServiceImpl<DatasetsInfoMapper, DatasetsInfo> implements DatasetsInfoService {

}
