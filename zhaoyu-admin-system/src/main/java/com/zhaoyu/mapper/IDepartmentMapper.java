package com.zhaoyu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhaoyu.domain.IDepartmentDo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author jiangqiangqiang
 * @description: 
 * @date 2022/3/22 5:28 PM
 */
public interface IDepartmentMapper extends BaseMapper<IDepartmentDo> {
    int updateBatch(@Param("list")List<IDepartmentDo> list);

    int updateBatchSelective(@Param("list")List<IDepartmentDo> list);

    int batchInsert(@Param("list") List<IDepartmentDo> list);

    int insertOrUpdate(IDepartmentDo record);

    int insertOrUpdateSelective(IDepartmentDo record);
}