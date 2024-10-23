/**
 * @Time: 2024/10/15 16:46
 * @Author: guoxun
 * @File: DatasetsInfoMapper
 * @Description:
 */

package com.pipi.imageannotation.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pipi.imageannotation.pojo.domain.DatasetsInfo;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface DatasetsInfoMapper extends BaseMapper<DatasetsInfo> {

    @Select("SELECT name FROM tb_datasets_info WHERE delete_bit = false")
    List<String> selectDatasetsNameList();
}
