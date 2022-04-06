package com.zhaoyu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhaoyu.domain.IUserDo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/3/22 5:27 PM
 */
public interface IUserDoMapper extends BaseMapper<IUserDo> {
	int updateBatch(@Param("list")List<IUserDo> list);

	int updateBatchSelective(@Param("list")List<IUserDo> list);

	int batchInsert(@Param("list") List<IUserDo> list);

	int insertOrUpdate(IUserDo record);

	int insertOrUpdateSelective(IUserDo record);
}