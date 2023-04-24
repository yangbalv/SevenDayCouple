package com.jiuyuetian.sevendaycouple.base.servise;

import com.jiuyuetian.sevendaycouple.base.model.IBaseModel;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


/**
 * @author Everelegance ESBuilder Workgroup> josh
 * @version 1.0
 * @created 2013-3-22 上午11:55:53
 * @comment 通用的服务接口类
 * @modify
 */
public interface IBaseService<M extends IBaseModel<PK>, PK extends Serializable> {


//     void addServiceCallback(IBaseServiceCallback<M, PK> callback);


    /**
     * 添加实体
     *
     * @param t
     * @return
     */
    M add(M t) throws Exception;

    /**
     * 修改实体
     *
     * @param t
     * @return
     */
    M update(M t) throws Exception;

    /**
     * 删除实体
     *
     * @param id
     */
    int delete(PK id);


    /**
     * 删除指定条件实体
     *
     * @param m
     */
    int delete(M m);


    /**
     * 删除指定条件实体
     *
     * @param params
     */
    int delete(Map<String, Object> params);


    /**
     * 删除所有实体
     *
     * @param
     */
    int deleteAll();


    /**
     * 删除指定的所有实体
     *
     * @param pks
     */
    int delete(PK pks[]);


    /**
     * 根据Key查询单个实体
     *
     * @param id
     * @return
     */
    M getModel(PK id);

    /**
     * 根据实体条件查询单个实体
     *
     * @param m
     * @return
     */
    M getModel(M m);

    /**
     * 根据查询条件查询单个实体
     *
     * @param param
     * @return
     */
    M getModel(Map<String, Object> param);


    /**
     * 查询所有列表
     *
     * @return
     */
    List<M> getAllList();

    /**
     * 查询列表
     *
     * @param param
     * @return
     */
    List<M> getList(Map<String, Object> param);

    /**
     * 查询列表
     *
     * @param m
     * @return
     */
    List<M> getList(M m);
//
//    /**
//     * 查询分页列表
//     * @param m
//     * @return
//     */
//     PageModel<M> getPageList(M m, IPageQueryModel pageQueryModel);
//
//
//    /**
//     * 查询分页列表
//     * @param param
//     * @param start
//     * @param limit
//     * @return
//     */
//     PageModel<M> getPageList(Map<String, Object> param, IPageQueryModel pageQueryModel);

}
