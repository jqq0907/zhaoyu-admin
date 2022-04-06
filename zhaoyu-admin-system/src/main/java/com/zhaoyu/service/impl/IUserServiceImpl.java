package com.zhaoyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoyu.domain.IUserDo;
import com.zhaoyu.mapper.IUserDoMapper;
import com.zhaoyu.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/3/22 5:21 PM
 */
@Service
public class IUserServiceImpl extends ServiceImpl<IUserDoMapper, IUserDo> implements IUserService {

	@Override
	public int updateBatch(List<IUserDo> list) {
		return baseMapper.updateBatch(list);
	}

	@Override
	public int updateBatchSelective(List<IUserDo> list) {
		return baseMapper.updateBatchSelective(list);
	}

	@Override
	public int batchInsert(List<IUserDo> list) {
		return baseMapper.batchInsert(list);
	}

	@Override
	public int insertOrUpdate(IUserDo record) {
		return baseMapper.insertOrUpdate(record);
	}

	@Override
	public int insertOrUpdateSelective(IUserDo record) {
		return baseMapper.insertOrUpdateSelective(record);
	}
}



