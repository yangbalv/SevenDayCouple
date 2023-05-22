package com.jiuyuetian.sevendaycouple.services.mybatiss1;

import com.jiuyuetian.sevendaycouple.base.model.IBaseModel;
import com.jiuyuetian.sevendaycouple.base.service.IBaseService;
import com.jiuyuetian.sevendaycouple.model.UserModel;

public interface IUserService extends IBaseService<UserModel,String> {
    UserModel getOneByUserName(String userName);
}
