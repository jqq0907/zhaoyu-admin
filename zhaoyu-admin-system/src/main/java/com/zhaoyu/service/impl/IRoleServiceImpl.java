package com.zhaoyu.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoyu.mapper.IRoleMapper;
import com.zhaoyu.domain.IRoleDo;
import com.zhaoyu.service.IRoleService;
/**
 * @author jiangqiangqiang
 * @description: 
 * @date 2022/3/22 5:28 PM
 */
@Service
public class IRoleServiceImpl extends ServiceImpl<IRoleMapper, IRoleDo> implements IRoleService{

    @Override
    public int updateBatch(List<IRoleDo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<IRoleDo> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<IRoleDo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(IRoleDo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(IRoleDo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
