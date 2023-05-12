package com.jiuyuetian.sevendaycouple.mappers.mybatiss2;

import com.jiuyuetian.sevendaycouple.base.dao.IBaseDao;
import com.jiuyuetian.sevendaycouple.model.UserModel;

public interface BackUserMapper extends IBaseDao<UserModel, String> {
    UserModel getOneByUserName(String userName);
}
