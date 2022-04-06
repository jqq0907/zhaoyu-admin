package com.zhaoyu.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoyu.domain.IMenuDo;
import com.zhaoyu.mapper.IMenuMapper;
import com.zhaoyu.service.IMenuService;
/**
 * @author jiangqiangqiang
 * @description: 
 * @date 2022/3/22 5:28 PM
 */
@Service
public class IMenuServiceImpl extends ServiceImpl<IMenuMapper, IMenuDo> implements IMenuService{

    @Override
    public int updateBatch(List<IMenuDo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<IMenuDo> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<IMenuDo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(IMenuDo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(IMenuDo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
