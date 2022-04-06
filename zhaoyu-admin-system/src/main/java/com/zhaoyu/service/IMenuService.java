package com.zhaoyu.service;

import java.util.List;
import com.zhaoyu.domain.IMenuDo;
import com.baomidou.mybatisplus.extension.service.IService;
    /**
 * @author jiangqiangqiang
 * @description: 
 * @date 2022/3/22 5:28 PM
 */
public interface IMenuService extends IService<IMenuDo>{


    int updateBatch(List<IMenuDo> list);

    int updateBatchSelective(List<IMenuDo> list);

    int batchInsert(List<IMenuDo> list);

    int insertOrUpdate(IMenuDo record);

    int insertOrUpdateSelective(IMenuDo record);

}
