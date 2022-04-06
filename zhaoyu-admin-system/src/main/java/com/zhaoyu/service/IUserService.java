package com.zhaoyu.service;

import java.util.List;
import com.zhaoyu.domain.IUserDo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/3/22 5:21 PM
 */
public interface IUserService extends IService<IUserDo> {
	
	int updateBatch(List<IUserDo> list);

	int updateBatchSelective(List<IUserDo> list);

	int batchInsert(List<IUserDo> list);

	int insertOrUpdate(IUserDo record);

	int insertOrUpdateSelective(IUserDo record);

}



