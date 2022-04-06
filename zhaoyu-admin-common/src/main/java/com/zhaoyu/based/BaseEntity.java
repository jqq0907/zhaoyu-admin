package com.zhaoyu.based;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author jiangqiangqiang
 * @description: base entity
 * @date 2021/10/28 5:07 下午
 */
@Data
@MappedSuperclass
public class BaseEntity implements Serializable {
    /**
     * 创建人名称
     */
    @Schema(name = "创建人名称")
    @TableField(value = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @Schema(name = "创建时间")
    @TableField(value = "create_time")
    private LocalDateTime createTime;

    /**
     * 更新人名称
     */
    @Schema(name = "更新人名称")
    @TableField(value = "update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @Schema(name = "更新时间")
    @TableField(value = "update_time")
    private LocalDateTime updateTime;

    /**
     * 创建人id
     */
    @Schema(name = "创建人id")
    @TableField(value = "create_by_id")
    private Long createById;

    /**
     * 修改人id
     */
    @Schema(name = "修改人id")
    @TableField(value = "update_by_id")
    private Long updateById;

    /**
     * 是否删除，默认false
     */
    @Schema(name = "是否删除")
    @TableField(value = "deleted")
    private Boolean deleted;
}
