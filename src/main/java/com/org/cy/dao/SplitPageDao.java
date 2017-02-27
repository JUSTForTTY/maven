package com.org.cy.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;

import com.org.cy.common.Page;

 
public interface SplitPageDao extends BaseDao {
	public final int PAGE_SIZE = 15;
	
	/**
	 * @param query hibernate查询
	 * @param nowpage 当前页
	 * @param pageSize 每页记录数
	 * @return 根据query查询出分页结果
	 */
	public Page findByQuery(Query query,int nowPage,int pageSize);

	/**
	 * @param criteria hibernate查询
	 * @param nowpage 当前页
	 * @param pageSize 每页记录数
	 * @return
	 * 根据criteria 查询出分页结果
	 */
	public Page findByCriteria(Criteria criteria,int nowPage,int pageSize);
	
	/**
	 * @param hql hql语句
	 * @param nowpage 当前记录数
	 * @param pageSize 每页记录数
	 * @return 返回指定hql的分页Page
	 */
	public Page findByHql(String hql, int nowPage, int pageSize);

	/**
	 * @param hql hql语句
	 * @param nowpage 当前记录数
	 * @return 返回指定hql的分页Page
	 */
	public Page findByHql(String hql, int nowPage);

	/**
	 * @param sql sql语句
	 * @param nowpage 当前记录数
	 * @param pageSize 每页显示记录数
	 * @return 返回指定sql的分页Page
	 */
	public Page findBySql(String sql, int nowPage, int pageSize);

	/**
	 * @param sql
	 * @param nowpage
	 * @return 返回指定sql的分页Page
	 */
	public Page findBySql(String sql, int nowPage);
	
	/**
	 * @author tty
	 * @param hql
	 * @objs  数组，存放positional parameter
	 * @param nowpage
	 * @param pageSize 分页尺寸
	 * @return 返回指定sql的分页Page
	 */
	public Page findByHql(String hql,Object[] objs, int nowPage,int pageSize);
	
	
	/**
	 * @author tty
	 * @param sql
	 * @objs  数组，存放positional parameter
	 * @param nowpage
	 * @param pageSize 分页尺寸
	 * @return 返回指定sql的分页Page
	 */
	public Page findBySql(String sql,Object[] objs, int nowPage,int pageSize);
	
}
