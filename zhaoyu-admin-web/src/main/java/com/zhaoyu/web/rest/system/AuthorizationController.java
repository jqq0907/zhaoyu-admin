package com.zhaoyu.web.rest.system;

import com.zhaoyu.result.ResponseData;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangqiangqiang
 * @description: 授权rest
 * @date 2022/3/22 5:31 PM
 */
@Slf4j
@RestController
@RequestMapping("/auth")
@Tag(name = "系统:认证授权接口")
public class AuthorizationController {

	public ResponseData login() {

	}
}
