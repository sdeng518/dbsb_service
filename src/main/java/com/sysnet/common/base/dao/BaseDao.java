/**
 * 
 */
package com.sysnet.common.base.dao;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;

/**
 * @author 秦晓东
 *
 */
public interface BaseDao<T> {

	/**
	 * 
	* @Title: insertBatch
	* @Description: 批量新增
	* @param list
	* @return int   
	* @throws
	 */
	int insertBatch(List<T> list);

	/**
	 * 新增
	 * 
	 * @param t
	 * @return i 新增条数
	 */
	int insert(T t);

	/**
	 * 更新
	 * 
	 * @param t
	 * @return i 更新影响条数
	 */
	int update(T t);

	/**
	 * 查询所有，无条件
	 * 
	 * @return res 对象列表
	 */
	List<T> queryAll();

	/**
	 * 根据条件查询
	 * 
	 * @param filter
	 *            查询条件
	 * @return res 对象列表
	 */
	List<T> queryByFilter(Map<String, Object> filter);

	/**
	 * 根据对象查询
	 * 
	 * @param t
	 * @return res
	 */
	List<T> queryByObject(T t);

	/**
	 * 根据条件查询带分页
	 * 
	 * @param filter
	 *            查询条件
	 * @return res对象列表
	 */
	Page<T> queryByFilterAndPage(Map<String, Object> filter);

	/**
	 * 根据对象查询，带分页
	 * 
	 * @param t
	 * @return res
	 */
	Page<T> queryByObjectAndPage(T t);

	/**
	 * 根据ID查询
	 * 
	 * @param id
	 * @return res 单个对象
	 */
	T queryById(Object id);

	/**
	 * 根据条件查询单个对象
	 * 
	 * @param filter
	 *            查询条件
	 * @return res 单个对象
	 */
	T queryOneByFilter(Map<String, Object> filter);

	/**
	 * 统计条数
	 * 
	 * @param filter
	 * @return
	 */
	int queryCount(Map<String, Object> filter);

	/**
	 * 根据ID删除记录(物理删除,慎用,一般情况只是更新状态即可)
	 * 
	 * @param id
	 * @return i
	 */
	int deleteById(Object id);

	/**
	 * 多表关联VO对象查询
	 * 
	 * @param filter
	 * @return res
	 */
	List<Object> queryVoByFilter(Map<String, Object> filter);

	/**
	 * 多表关联VO对象查询
	 * 
	 * @param t
	 * @return res
	 */
	List<Object> queryVoByObject(T t);

	/**
	 * 多表关联VO对象查询带分页
	 * 
	 * @param t
	 * @return res
	 */
	Page<Object> queryVoByObjectAndPage(T t);

	/**
	 * 多表关联VO对象查询带分页
	 * 
	 * @param filter
	 * @return res
	 */
	Page<Object> queryVoByFilterAndPage(Map<String, Object> filter);
}
