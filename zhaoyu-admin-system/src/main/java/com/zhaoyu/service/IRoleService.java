package com.zhaoyu.service;

import java.util.List;
import com.zhaoyu.domain.IRoleDo;
import com.baomidou.mybatisplus.extension.service.IService;
    /**
 * @author jiangqiangqiang
 * @description: 
 * @date 2022/3/22 5:28 PM
 */
public interface IRoleService extends IService<IRoleDo>{


    int updateBatch(List<IRoleDo> list);

    int updateBatchSelective(List<IRoleDo> list);

    int batchInsert(List<IRoleDo> list);

    int insertOrUpdate(IRoleDo record);

    int insertOrUpdateSelective(IRoleDo record);

}
