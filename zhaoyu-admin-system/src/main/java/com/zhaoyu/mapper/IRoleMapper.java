package com.zhaoyu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhaoyu.domain.IRoleDo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author jiangqiangqiang
 * @description: 
 * @date 2022/3/22 5:28 PM
 */
public interface IRoleMapper extends BaseMapper<IRoleDo> {
    int updateBatch(List<IRoleDo> list);

    int updateBatchSelective(List<IRoleDo> list);

    int batchInsert(@Param("list") List<IRoleDo> list);

    int insertOrUpdate(IRoleDo record);

    int insertOrUpdateSelective(IRoleDo record);
}