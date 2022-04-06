package com.zhaoyu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhaoyu.domain.IMenuDo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author jiangqiangqiang
 * @description: 
 * @date 2022/3/22 5:28 PM
 */
public interface IMenuMapper extends BaseMapper<IMenuDo> {
    int updateBatch(List<IMenuDo> list);

    int updateBatchSelective(List<IMenuDo> list);

    int batchInsert(@Param("list") List<IMenuDo> list);

    int insertOrUpdate(IMenuDo record);

    int insertOrUpdateSelective(IMenuDo record);
}