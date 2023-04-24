package com.jiuyuetian.sevendaycouple.controller;

import com.jiuyuetian.sevendaycouple.dto.LoginRequestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    public static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/login")
    public String login(LoginRequestDto requestDto) {
        logger.info("/login:[{}]", requestDto);
        return requestDto.toString();
    }
}
