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
import lombok.EqualsAndHashCode;

/**
 * @author jiangqiangqiang
 * @description: 
 * @date 2022/3/22 5:28 PM
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="i_department")
@Data
@Builder
@TableName(value = "i_department")
public class IDepartmentDo extends BaseEntity implements Serializable{
    /**
     * 部门id
     */
    @TableId(value = "department_id", type = IdType.INPUT)
    @ApiModelProperty(value="部门id")
    private Long departmentId;

    /**
     * 部门code
     */
    @TableField(value = "department_code")
    @ApiModelProperty(value="部门code")
    private Long departmentCode;

    /**
     * 上级部门id
     */
    @TableField(value = "department_pid")
    @ApiModelProperty(value="上级部门id")
    private Long departmentPid;

    /**
     * 部门名称
     */
    @TableField(value = "department_name")
    @ApiModelProperty(value="部门名称")
    private String departmentName;

    /**
     * 排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序")
    private Integer sort;

    /**
     * 子部门数
     */
    @TableField(value = "sub_count")
    @ApiModelProperty(value="子部门数")
    private Integer subCount;

    /**
     * 状态 1启用，默认true
     */
    @TableField(value = "department_enable")
    @ApiModelProperty(value="状态 1启用，默认true")
    private Boolean departmentEnable;

    /**
     * 部门主管id
     */
    @TableField(value = "manager_user_id")
    @ApiModelProperty(value="部门主管id")
    private Long managerUserId;

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
    private LocalDateTime updateBy;

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

    private static final long serialVersionUID = 1L;
}