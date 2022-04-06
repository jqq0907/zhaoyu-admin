package com.zhaoyu.based;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author jiangqiangqiang
 * @description: base entity
 * @date 2021/10/28 5:07 下午
 */
@Data
@MappedSuperclass
public class BaseDTO implements Serializable {
    /**
     * 创建人名称
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新人名称
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Long updateTime;

    /**
     * 创建人id
     */
    private Long createById;

    /**
     * 修改人id
     */
    private Long updateById;

    /**
     * 是否删除，默认false
     */
    private Boolean deleted;
}
