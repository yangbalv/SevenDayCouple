package com.jiuyuetian.sevendaycouple.controller;

import com.jiuyuetian.sevendaycouple.dto.LoginRequestDto;
import com.jiuyuetian.sevendaycouple.mappers.mybatiss1.UserMapper;
import com.jiuyuetian.sevendaycouple.mappers.mybatiss2.BackUserMapper;
import com.jiuyuetian.sevendaycouple.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    public static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserMapper userMapper;


    @Autowired
    private BackUserMapper backUserMapper;

    @RequestMapping("/login")
    public String login(LoginRequestDto requestDto) {
        logger.info("/login:[{}]", requestDto);
        UserModel userModel = userMapper.getOneByUserName(requestDto.getUserName());
        logger.info("userModel is:[{}]", userModel.toString());
        return requestDto.toString();
    }

    @RequestMapping("/register")
    public String register(LoginRequestDto requestDto) throws Exception {
        logger.info("/register:[{}]", requestDto);
        UserModel userModel = userMapper.getOneByUserName(requestDto.getUserName());
        if (null == userModel) {
            userModel = new UserModel();
            userModel.setUserName(requestDto.getUserName());
            userModel.setPassword(requestDto.getPassword());
            userMapper.insert(userModel);
            backUserMapper.insert(userModel);
            return "添加成功";
        } else {
            logger.info("userModel is:[{}]", userModel.toString());
            return "用户以及被注册";
        }
    }

}
