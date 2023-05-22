package com.jiuyuetian.sevendaycouple.services.mybatiss1.impl;

import com.jiuyuetian.sevendaycouple.base.dao.IBaseDao;
import com.jiuyuetian.sevendaycouple.base.model.IBaseModel;
import com.jiuyuetian.sevendaycouple.base.service.IBaseService;
import com.jiuyuetian.sevendaycouple.base.service.impl.BaseServiceImpl;
import com.jiuyuetian.sevendaycouple.mappers.mybatiss1.UserMapper;
import com.jiuyuetian.sevendaycouple.model.UserModel;
import com.jiuyuetian.sevendaycouple.services.mybatiss1.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserModel, String, UserMapper> {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserMapper getDao() {
        return userMapper;
    }
}
