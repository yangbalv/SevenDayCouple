package com.jiuyuetian.sevendaycouple.services.mybatiss2;

import com.jiuyuetian.sevendaycouple.base.service.IBaseService;
import com.jiuyuetian.sevendaycouple.model.UserModel;

public interface IBackUserService extends IBaseService<UserModel,String> {
    UserModel getOneByUserName(String userName);
}
