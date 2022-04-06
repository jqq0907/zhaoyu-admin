package com.zhaoyu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zhaoyu.based.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

/**
 * @author jiangqiangqiang
 * @description: 
 * @date 2022/3/22 5:28 PM
 */
@ApiModel(value="i_role")
@Data
@Builder
@TableName(value = "i_role")
public class IRoleDo extends BaseEntity implements Serializable {
    /**
     * 角色id
     */
    @TableId(value = "role_id", type = IdType.INPUT)
    @ApiModelProperty(value="角色id")
    private Long roleId;

    /**
     * 角色名称
     */
    @TableField(value = "role_name")
    @ApiModelProperty(value="角色名称")
    private String roleName;

    /**
     * 账户code
     */
    @TableField(value = "user_code")
    @ApiModelProperty(value="账户code")
    private String userCode;

    /**
     * 数据范围
     */
    @TableField(value = "data_scope")
    @ApiModelProperty(value="数据范围")
    private String dataScope;

    /**
     * 排序
     */
    @TableField(value = "role_sort")
    @ApiModelProperty(value="排序")
    private Integer roleSort;

    /**
     * 描述
     */
    @TableField(value = "comments")
    @ApiModelProperty(value="描述")
    private String comments;

    /**
     * 部门code
     */
    @TableField(value = "department_code")
    @ApiModelProperty(value="部门code")
    private String departmentCode;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    @ApiModelProperty(value="创建人")
    private String createBy;

    /**
     * 创建人id
     */
    @TableField(value = "create_id")
    @ApiModelProperty(value="创建人id")
    private Long createId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    @TableField(value = "update_by")
    @ApiModelProperty(value="更新人")
    private String updateBy;

    /**
     * 更新人id
     */
    @TableField(value = "update_id")
    @ApiModelProperty(value="更新人id")
    private Long updateId;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="更新时间")
    private LocalDateTime updateTime;

    /**
     * 是否删除，默认false
     */
    @TableField(value = "deleted")
    @ApiModelProperty(value="是否删除，默认false")
    private Boolean deleted;

    /**
     * 是否启用
     */
    @TableField(value = "sort_enable")
    @ApiModelProperty(value="是否启用")
    private Boolean sortEnable;

    /**
     * 系统预设角色
     */
    @TableField(value = "preinstall")
    @ApiModelProperty(value="系统预设角色")
    private Boolean preinstall;

    private static final long serialVersionUID = 1L;
}