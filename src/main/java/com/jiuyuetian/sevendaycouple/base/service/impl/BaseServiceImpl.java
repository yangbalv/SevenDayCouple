
package com.jiuyuetian.sevendaycouple.base.service.impl;


import com.jiuyuetian.sevendaycouple.base.dao.IBaseDao;
import com.jiuyuetian.sevendaycouple.base.model.IBaseModel;
import com.jiuyuetian.sevendaycouple.base.service.IBaseService;
import com.jiuyuetian.sevendaycouple.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Everelegance ESBuilder Workgroup> josh
 * @version 1.0
 * @created 2013-4-28 下午11:19:23
 * @comment
 * @modify 修改Service 的Dao的注入方式为实现代码自行注入，解决java1.7-79以后对泛型抽象方法产生的代码不一致的问题
 */
public abstract class BaseServiceImpl<M extends IBaseModel<PK>, PK extends Serializable, D extends IBaseDao<M, PK>>
        implements IBaseService<M, PK> {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public abstract D getDao();

    public M add(M t) throws Exception {
        int ret = this.getDao().insert(t);
        if (ret == 1) {
            return t;
        }
        throw new Exception("system.model.add.error");
    }

    public M update(M t) throws Exception {

        int ret = this.getDao().update(t);
        if (ret == 1) {
            return t;
        }
        throw new Exception("system.model.update.error");
    }

    public int delete(PK key) {

        return this.getDao().deleteById(key);
    }

    public int delete(M m) {

        return this.getDao().delete(m);
    }

    public int delete(Map<String, Object> params) {

        return this.getDao().delete(params);
    }

    public int delete(PK pks[]) {

        return this.getDao().batchDelete(pks);
    }

    public int deleteAll() {

        return this.getDao().deleteAll();
    }

    public M getModel(PK id) {

        return this.getDao().selectById(id);
    }

    public M getModel(M m) {

        return this.getDao().selectOne(m);
    }

    public M getModel(Map<String, Object> param) {
        return this.getDao().selectOne(param);
    }

    public List<M> getAllList() {
        return this.getDao().selectAll();
    }


    public List<M> getList(Map<String, Object> param) {
        return this.getDao().selectList(param);
    }


    public List<M> getList(M m) {
        return this.getDao().selectList(m);
    }

}
