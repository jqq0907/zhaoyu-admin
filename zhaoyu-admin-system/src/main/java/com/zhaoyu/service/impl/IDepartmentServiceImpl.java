package com.zhaoyu.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoyu.domain.IDepartmentDo;
import com.zhaoyu.mapper.IDepartmentMapper;
import com.zhaoyu.service.IDepartmentService;
/**
 * @author jiangqiangqiang
 * @description: 
 * @date 2022/3/22 5:28 PM
 */
@Service
public class IDepartmentServiceImpl extends ServiceImpl<IDepartmentMapper, IDepartmentDo> implements IDepartmentService{

    @Override
    public int updateBatch(List<IDepartmentDo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<IDepartmentDo> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<IDepartmentDo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(IDepartmentDo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(IDepartmentDo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
