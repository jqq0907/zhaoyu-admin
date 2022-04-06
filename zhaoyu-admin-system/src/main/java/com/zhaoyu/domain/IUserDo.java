package com.zhaoyu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zhaoyu.based.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author jiangqiangqiang
 * @description: 用户表
 * @date 2022/3/22 5:27 PM
 */
@Data
@Builder
@Schema( name = "用户表")
@TableName(value = "i_user")
public class IUserDo extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	@TableId(value = "user_id", type = IdType.INPUT)
	@Schema(name = "用户id")
	private Long userId;

	/**
	 * 用户code
	 */
	@TableField(value = "user_code")
	@Schema(name = "用户code")
	private String userCode;

	/**
	 * 账户名
	 */
	@TableField(value = "username")
	@Schema(name = "账户名")
	private String username;

	/**
	 * 账户密码
	 */
	@TableField(value = "`password`")
	@Schema(name = "账户密码")
	private String password;

	/**
	 * 部门id
	 */
	@TableField(value = "department_id")
	@Schema(name = "部门id")
	private Long departmentId;

	/**
	 * 部门名称
	 */
	@TableField(value = "department_name")
	@Schema(name = "部门名称")
	private String departmentName;

	/**
	 * 部门code
	 */
	@TableField(value = "department_code")
	@Schema(name = "部门code")
	private String departmentCode;

	/**
	 * 用户昵称
	 */
	@TableField(value = "nick_name")
	@Schema(name = "用户昵称")
	private String nickName;

	/**
	 * 性别，默认男
	 */
	@TableField(value = "gender")
	@Schema(name = "性别，默认男")
	private String gender;

	/**
	 * 头像
	 */
	@TableField(value = "profile_photo")
	@Schema(name = "头像")
	private String profilePhoto;

	/**
	 * 头像地址
	 */
	@TableField(value = "profile_photo_src")
	@Schema(name = "头像地址")
	private String profilePhotoSrc;

	/**
	 * 邮箱
	 */
	@TableField(value = "email")
	@Schema(name = "邮箱")
	private String email;

	/**
	 * 手机号
	 */
	@TableField(value = "phone")
	@Schema(name = "手机号")
	private String phone;

	/**
	 * 地址
	 */
	@TableField(value = "address")
	@Schema(name = "地址")
	private String address;

	/**
	 * 城市
	 */
	@TableField(value = "city")
	@Schema(name = "城市")
	private String city;

	/**
	 * 状态 1启用，0禁用，默认1
	 */
	@TableField(value = "user_enable")
	@Schema(name = "状态 1启用，0禁用，默认1")
	private Boolean userEnable;

	/**
	 * 是否管理员，默认false
	 */
	@TableField(value = "admin_user")
	@Schema(name = "是否管理员，默认false")
	private Boolean adminUser;

	/**
	 * 最后一次修改密码时间
	 */
	@TableField(value = "pwd_reset_time")
	@Schema(name = "最后一次修改密码时间")
	private LocalDateTime pwdResetTime;
}