package com.jiuyuetian.sevendaycouple.base.model.impl;

import com.jiuyuetian.sevendaycouple.base.model.IBaseModel;

import java.io.Serializable;
import java.util.Date;


public class BaseModelAdapter<PK extends Serializable> implements IBaseModel<PK> {

    private static final long serialVersionUID = -7195993679503613535L;

    protected PK id;


    private Date createDate;

    private Date updateDate;

    private Date createTime;

    private Date updateTime;


    public BaseModelAdapter() {

    }

    final public PK getId() {
        return this.id;
    }

    final public void setId(PK id) {
        this.id = id;

    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


}
