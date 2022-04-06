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
@ApiModel(value="i_menu")
@Data
@Builder
@TableName(value = "i_menu")
public class IMenuDo extends BaseEntity implements Serializable {
    /**
     * 菜单id
     */
    @TableId(value = "menu_id", type = IdType.INPUT)
    @ApiModelProperty(value="菜单id")
    private Long menuId;

    /**
     * 上级菜单id
     */
    @TableField(value = "pid")
    @ApiModelProperty(value="上级菜单id")
    private Long pid;

    /**
     * 账户code
     */
    @TableField(value = "user_code")
    @ApiModelProperty(value="账户code")
    private Long userCode;

    /**
     * 部门code
     */
    @TableField(value = "department_code")
    @ApiModelProperty(value="部门code")
    private Long departmentCode;

    /**
     * 菜单标题
     */
    @TableField(value = "title")
    @ApiModelProperty(value="菜单标题")
    private String title;

    /**
     * 菜单排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="菜单排序")
    private Integer sort;

    /**
     * 图标
     */
    @TableField(value = "icon")
    @ApiModelProperty(value="图标")
    private String icon;

    /**
     * 0目录，1菜单，2按钮
     */
    @TableField(value = "`type`")
    @ApiModelProperty(value="0目录，1菜单，2按钮")
    private String type;

    /**
     * 权限
     */
    @TableField(value = "permission")
    @ApiModelProperty(value="权限")
    private String permission;

    /**
     * 路由
     */
    @TableField(value = "`path`")
    @ApiModelProperty(value="路由")
    private String path;

    /**
     * 是否可见
     */
    @TableField(value = "is_visible")
    @ApiModelProperty(value="是否可见")
    private Boolean isVisible;

    /**
     * 组件名称
     */
    @TableField(value = "component_name")
    @ApiModelProperty(value="组件名称")
    private String componentName;

    /**
     * 组件路径
     */
    @TableField(value = "component_path")
    @ApiModelProperty(value="组件路径")
    private String componentPath;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    @ApiModelProperty(value="创建人")
    private String createBy;

    /**
     * 创建人id
     */
    @TableField(value = "create_by_id")
    @ApiModelProperty(value="创建人id")
    private Long createById;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private LocalDateTime createTime;

    /**
     * 更新人名称
     */
    @TableField(value = "update_by")
    @ApiModelProperty(value="更新人名称")
    private LocalDateTime updateBy;

    /**
     * 更新人id
     */
    @TableField(value = "update_by_id")
    @ApiModelProperty(value="更新人id")
    private Long updateById;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="更新时间")
    private LocalDateTime updateTime;

    /**
     * 是否删除 默认false
     */
    @TableField(value = "deleted")
    @ApiModelProperty(value="是否删除 默认false")
    private Boolean deleted;

    /**
     * 子菜单数量
     */
    @TableField(value = "sub_count")
    @ApiModelProperty(value="子菜单数量")
    private Integer subCount;

    /**
     * 1启用
     */
    @TableField(value = "menu_enable")
    @ApiModelProperty(value="1启用")
    private Boolean menuEnable;

    private static final long serialVersionUID = 1L;
}