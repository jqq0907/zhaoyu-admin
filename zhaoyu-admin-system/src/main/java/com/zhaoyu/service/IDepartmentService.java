package com.zhaoyu.service;

import java.util.List;
import com.zhaoyu.domain.IDepartmentDo;
import com.baomidou.mybatisplus.extension.service.IService;
    /**
 * @author jiangqiangqiang
 * @description: 
 * @date 2022/3/22 5:28 PM
 */
public interface IDepartmentService extends IService<IDepartmentDo>{


    int updateBatch(List<IDepartmentDo> list);

    int updateBatchSelective(List<IDepartmentDo> list);

    int batchInsert(List<IDepartmentDo> list);

    int insertOrUpdate(IDepartmentDo record);

    int insertOrUpdateSelective(IDepartmentDo record);

}
