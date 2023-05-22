package com.jiuyuetian.sevendaycouple.services.mybatiss2.impl;

import com.jiuyuetian.sevendaycouple.base.service.impl.BaseServiceImpl;
import com.jiuyuetian.sevendaycouple.mappers.mybatiss2.BackUserMapper;
import com.jiuyuetian.sevendaycouple.mappers.mybatiss2.BackUserMapper;
import com.jiuyuetian.sevendaycouple.model.UserModel;
import com.jiuyuetian.sevendaycouple.services.mybatiss2.IBackUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BackUserServiceImpl extends BaseServiceImpl<UserModel, String, BackUserMapper> implements IBackUserService {
    @Autowired
    private BackUserMapper backUserMapper;

    @Override
    public BackUserMapper getDao() {
        return backUserMapper;
    }

    @Override
    public UserModel getOneByUserName(String userName) {
        return this.getDao().getOneByUserName(userName);
    }
}
