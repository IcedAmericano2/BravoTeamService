package com.mju.management.domain.user.controller;

import com.mju.management.domain.user.dto.UserInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "feign", url = "")
public interface UserFeignClient {
    @GetMapping("/user/response_user/{userId}")
    UserInfoDto getUserInfo(@PathVariable("userId") String userId);
}
