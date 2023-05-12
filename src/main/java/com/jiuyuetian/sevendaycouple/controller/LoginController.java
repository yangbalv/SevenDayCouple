package com.jiuyuetian.sevendaycouple.controller;

import com.jiuyuetian.sevendaycouple.dto.LoginRequestDto;
import com.jiuyuetian.sevendaycouple.dto.LoginResponseDto;
import com.jiuyuetian.sevendaycouple.mappers.mybatiss1.UserMapper;
import com.jiuyuetian.sevendaycouple.mappers.mybatiss2.BackUserMapper;
import com.jiuyuetian.sevendaycouple.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    public static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserMapper userMapper;


    @Autowired
//    注：多源数据库不能将接口名称设置成一样的，否则引用时需要使用包名称加上接口名称，会导致bean加载时出现问题
    private BackUserMapper backUserMapper;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    @ResponseBody(RestController相当于添加了ResponseBody)
    public LoginResponseDto login(LoginRequestDto requestDto) {
        logger.info("/login:[{}]", requestDto);
        LoginResponseDto responseDto = new LoginResponseDto();
        UserModel userModel = userMapper.getOneByUserName(requestDto.getUserName());
        if (null == userModel) {
            responseDto.setResult(false);
            responseDto.setResultMsg("没有查询到登录信息");
        } else if (requestDto.getPassword().equals(userModel.getPassword())) {
            responseDto.setResult(true);
            responseDto.setResultMsg("请求成功");
            responseDto.setUserId(userModel.getId());
        } else {
            responseDto.setResult(false);
            responseDto.setResultMsg("密码输入错误");
        }
        logger.info("login response is:[{}]", responseDto);
        return responseDto;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public LoginResponseDto register(LoginRequestDto requestDto) throws Exception {
        logger.info("/register:[{}]", requestDto);
        LoginResponseDto responseDto = new LoginResponseDto();
        UserModel userModel = userMapper.getOneByUserName(requestDto.getUserName());
        if (null == userModel) {
            userModel = new UserModel();
            userModel.setUserName(requestDto.getUserName());
            userModel.setPassword(requestDto.getPassword());
            int insert = userMapper.insert(userModel);
            backUserMapper.insert(userModel);
            responseDto.setResult(true);
            responseDto.setResultMsg("请求成功");
        } else {
            logger.info("userModel is:[{}]", userModel.toString());
            responseDto.setResult(false);
            responseDto.setResultMsg("用户已经被注册");
        }
        logger.info("register response is:[{}]", responseDto);
        return responseDto;
    }

}
