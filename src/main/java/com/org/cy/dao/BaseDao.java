package com.org.cy.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public interface BaseDao {
	/**
	 * @param entityName 实例类名
	 * @param key 主键
	 * @return 返回数据库中指定主键的数据库�?
	 * @throws org.hibernate.HibernateException
	 */
	public <T> T findByPrimaryKey(String entityName ,Serializable key)
			throws org.hibernate.HibernateException;
	
	/**
	 * @param clazz �?
	 * @param key 主键
	 * @return 返回对应clazz的指定的主键的数据库�?
	 * @throws org.hibernate.HibernateException
	 */
	public <T> T findByPrimaryKey(Class<T> clazz, Serializable key)
			throws org.hibernate.HibernateException;

	/**
	 * @param clazz �?
	 * @param key 主键
	 * @return 返回对应clazz的指定的主键的数据库�?
	 * @throws org.hibernate.HibernateException
	 */
	public <T> T loadByPrimaryKey(Class<T> clazz, Serializable key)
			throws org.hibernate.HibernateException;

	/**
	 * @param obj �?��保存的对象实�?
	 * @return 返回设置完主键后的对象实�?
	 * @throws org.hibernate.HibernateException
	 */
	public Serializable insert(Object obj)
			throws org.hibernate.HibernateException;

	/**
	 * @param objs
	 * @return 批量插入对象实例
	 */
	public <T> Collection<T> insert(Collection<T> objs);

	/**
	 * @param obj
	 * @throws org.hibernate.HibernateException
	 * @todo 保存或�?更新指定的数据库实例
	 */
	public void saveOrUpdate(Object obj)
			throws org.hibernate.HibernateException;

	/**
	 * @param objs
	 * @throws org.hibernate.HibernateException
	 * @todo 批量保存或�?更新指定的数据库类型
	 */
	public <T> void saveOrUpdate(Collection<T> objs)
			throws org.hibernate.HibernateException;

	/**
	 * @param obj
	 * @todo 更新指定的数据库类型
	 */
	public void update(Object obj);

	/**
	 * @param objs
	 * @todo 批量更新指定的数据库类型
	 */
	public <T> void update(Collection<T> objs);

	/**
	 * @param obj
	 * @throws org.hibernate.HibernateException
	 * @todo 删除某实�?
	 */
	public void delete(Object obj) throws org.hibernate.HibernateException;

	/**
	 * @param objs
	 * @todo 批量删除多个hibernate实例
	 */
	public <T> void delete(Collection<T> objs);

	/**
	 * @param obj
	 * @throws org.hibernate.HibernateException
	 * 执行sql语句
	 */
	
	public void excuteSql(Object obj) throws org.hibernate.HibernateException;
	/**
	 * clear session;
	 */
	public void Clear();
	/**
	 * @param objs
	 * @throws org.hibernate.HibernateException
	 * @todo 批量执行sql语句
	 */
	public <T> void excuteSql(Collection<T> objs)
			throws org.hibernate.HibernateException;

	/**
	 * @param hql 执行hql语句
	 */
	public void excuteHql(String hql);

	/**
	 * @param hqls 批量执行sql语句
	 */
	public <T> void excuteHql(Collection<T> hqls);

	/**
	 * @param namedQuery
	 * @return 获取hibernate中已定义的named查询
	 */
	public Query getNamedQuery(String namedQuery);
	
	
	public List query(String hql, Object[] objs);
	

	
	public List query(String hql, Object[] objs,int nowPage,int pageSize);
	/**
	 * @return 返回当前hibernate的对话session
	 */
	public Session getSession();

	
	/**
	 * @param hql
	 * @return 返回hql查询结果�?
	 */
	@SuppressWarnings("rawtypes")
	public List findByHql(String hql);

	/**
	 * @param sql
	 * @return 返回sql查询结果�?
	 */
	@SuppressWarnings("rawtypes")
	public List findBySql(String sql);
	
	@SuppressWarnings("rawtypes")
	public List findBySql(String sql, Class clazs);

	/**
	 * @param hql hql语句
	 * @param start �?��结果
	 * @param limit 当前显示的记录数
	 * @return 执行hql语句，返回start�?��，数量为limit的记录list
	 */
	@SuppressWarnings("rawtypes")
	public List searchHql(String hql, int start, int limit);

	/**
	 * @param sql sql查询语句
	 * @param start �?��位置
	 * @param limit 当前显示的记录数
	 * @return 执行sql语句，返回start�?��，数据位limit的记录list
	 */
	@SuppressWarnings("rawtypes")
	public List searchSql(String sql, int start, int limit);
	
	
	public Object hqlUniqueResult(String hql);
	
	public Integer findBySequence(String sql);
	
	public String findByjkSequence(String sql);
	
	public Float   selectBuyNumber(String sql);
	
	
	/**
	 * @author tty
	 * @清空session
	 */
	@SuppressWarnings("rawtypes")
	public void clearSession();
	
	
	/**
	 * @author tty
	 * @param sql
	 * @objs  数组，存放positional parameter
	 * @param nowpage
	 * @param pageSize 分页尺寸
	 * @return 返回指定sql的分页Page
	 */
	public List findBySql(String sql,Object[] objs);
	
	
	
	/**
	 * @author tty
	 * @param sql
	 * @objs  数组，存放positional parameter
	 * @param nowpage
	 * @param pageSize 分页尺寸
	 * @return 返回指定sql的分页Page
	 */
	public void executeSql(String sql,Object[] objs);
	

	
	/**
	 * @author tty
	 * @param sql
	 * @objs  数组，存放positional parameter
	 * @delete 
	 * @
	 */
	public void deleteAll(String sql,Object[] objs);
	
}
