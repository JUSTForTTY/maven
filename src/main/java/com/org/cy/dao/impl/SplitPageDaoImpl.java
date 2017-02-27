package com.org.cy.dao.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.Projections;
 
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.org.cy.common.Page;
import com.org.cy.dao.SplitPageDao;

 

/**
 * @author Administrator
 * @date 2012-3-13
 * @time 下午11:18:29 分页dao
 */

public class SplitPageDaoImpl extends BaseDaoImpl implements SplitPageDao {

	/**
	 * 去除select 子句，未考虑union的情况
	 */
	private static String removeSelect(String hql) {
		Assert.hasText(hql);
		int beginPos = hql.toLowerCase().indexOf("from");
		Assert.isTrue(beginPos != -1, " hql : " + hql + " must has a keyword from");
		return hql.substring(beginPos);
	}

	/**
	 * 去除orderby 子句
	 */
	private static String removeOrders(String hql) {
		Assert.hasText(hql);
		Pattern p = Pattern.compile("order\\s*by[\\w|\\W|\\s|\\S]*", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(hql);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, "");
		}
		m.appendTail(sb);
		return sb.toString();
	}

	@SuppressWarnings("rawtypes")
	public Page findByHql(String hql, int nowPage, int pageSize) {
		Page page = new Page();
		try {
			// List list = findByHql(hql);
			// Long totalRecords = (long) list.size();
			// page.setTotal(totalRecords);
			String countQueryString = "SELECT COUNT(*) " + removeSelect(removeOrders(hql));
			Long totalRecords = Long.parseLong(hqlUniqueResult(countQueryString).toString());
			page.setTotal(totalRecords);

			// 如果nowPage为-1 列出所有信息，不进行分页
			if (nowPage == -1) {
				page.setNowPage(1);
				// page.setRows(list);
			} else {
				int start = pageSize * (nowPage - 1);
				int totalPage = (int) (totalRecords / pageSize);
				if (totalPage * pageSize < totalRecords) {
					totalPage++;
				}

				List data = super.searchHql(hql, start, pageSize);
				// page.setData(InvokeUtils.list2Maps((data)));
				page.setRows(data);
				page.setNowPage(nowPage);
				page.setTotalPage(totalPage);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return page;
	}

	public Page findByHql(String hql, int nowPage) {
		return findByHql(hql, nowPage, PAGE_SIZE);
	}

	@SuppressWarnings("rawtypes")
	public Page findBySql(String sql, int nowPage, int pageSize) {
		Page page = new Page();
		try {
			// List list = findBySql(sql);

			// Long totalRecords = (long) list.size();
			/*
			 * int whereIndex=sql.toLowerCase().lastIndexOf("where"); int
			 * orderIndex=sql.toLowerCase().lastIndexOf("order"); String
			 * countSql=""; countSql=sql; if (orderIndex>whereIndex) { countSql=
			 * "select count(0) from ( "+ sql.substring(0,orderIndex)+") AA ";
			 * }else { countSql="select count(0) from ( "+ sql+") AA "; }
			 */
			Long totalRecords = Long.parseLong(SqlUniqueResult("select count(0) from ( " + sql + " ) AA").toString());
			page.setTotal(totalRecords);
			// 如果nowPage为-1 列出所有信息，不进行分页
			if (nowPage == -1) {
				page.setRows(findBySql(sql));
				// page.setRows(list);
			} else {
				int start = pageSize * (nowPage - 1);
				int totalPage = (int) (totalRecords / pageSize);
				if (totalPage * pageSize < totalRecords) {
					totalPage++;
				}

				List data = super.searchSql(sql, start, pageSize);
				page.setRows(data);
				page.setNowPage(nowPage);
				page.setTotalPage(totalPage);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return page;
	}

	public Page findBySql(String sql, int nowPage) {

		return findBySql(sql, nowPage, PAGE_SIZE);
	}

	@SuppressWarnings("rawtypes")
	public Page findByQuery(Query query, int nowPage, int pageSize) {
		Page page = new Page();
		try {
			List list = query.list();
			Long totalRecords = (long) list.size();
			page.setTotal(totalRecords);
			// 如果nowPage为-1 列出所有信息，不进行分页
			if (nowPage == -1) {
				page.setNowPage(1);
				page.setRows(list);
			} else {
				int start = pageSize * (nowPage - 1);
				int totalPage = (int) (totalRecords / pageSize);
				if (totalPage * pageSize < totalRecords) {
					totalPage++;
				}

				query.setFirstResult(start);
				query.setMaxResults(pageSize);

				List data = query.list();
				// page.setData(InvokeUtils.list2Maps((data)));
				page.setRows(data);
				page.setNowPage(nowPage);
				page.setTotalPage(totalPage);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return page;
	}

	@SuppressWarnings("rawtypes")
	public Page findByCriteria(Criteria criteria, int nowPage, int pageSize) {
		Page page = new Page();
		try {
			// 获取总的页码数
			Long totalRecords = (Long) criteria.setProjection(Projections.rowCount()).uniqueResult();

			criteria.setProjection(null);
			page.setTotal(totalRecords);
			// 如果nowPage为-1 列出所有信息，不进行分页
			if (nowPage == -1) {
				page.setNowPage(1);
				page.setRows(criteria.list());
			} else {
				int start = pageSize * (nowPage - 1);
				int totalPage = (int) (totalRecords / pageSize);
				if (totalPage * pageSize < totalRecords) {
					totalPage++;
				}

				criteria.setFirstResult(start);
				criteria.setMaxResults(pageSize);

				List data = criteria.list();
				// page.setData(InvokeUtils.list2Maps((data)));
				page.setRows(data);
				page.setNowPage(nowPage);
				page.setTotalPage(totalPage);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return page;
	}

	@Override
	public Page findByHql(String hql, Object[] objs, int nowPage, int pageSize) {
		//
		Page page = new Page();

		String countQueryString = "SELECT COUNT(*) " + removeSelect(removeOrders(hql));
		Query query = this.getSession().createQuery(countQueryString);

		int i = 0;
		for (Object obj : objs) {
			if (obj.getClass().equals(String.class)) {
				query.setString(i, (String) obj);
				 

			}
			if (obj.getClass().equals(Integer.class)) {
				query.setInteger(i, (Integer) obj);
				 
			}
			if (obj.getClass().equals(Double.class)) {
				query.setDouble(i, (Double) obj);
				 
			}
			if (obj.getClass().equals(Float.class)) {
				query.setFloat(i, (Float) obj);
				 
			}
			if (obj.getClass().equals(Date.class)) {
				query.setDate(i, (Date) obj);
				 
			}
			if (obj.getClass().equals(Timestamp.class)) {
				query.setTimestamp(i, (Timestamp) obj);
				 
			}
			i++;
		}

		Long totalRecords = Long.parseLong(query.uniqueResult().toString());
		 
		page.setTotal(totalRecords);

		if (nowPage == -1) {
			page.setNowPage(1);
			// page.setRows(list);
		} else {
			int start = pageSize * (nowPage - 1);
			int totalPage = (int) (totalRecords / pageSize);
			if (totalPage * pageSize < totalRecords) {
				totalPage++;
			}

			Query queryselect = this.getSession().createQuery(hql);
			int j = 0;
			for (Object obj : objs) {
				if (obj.getClass().equals(String.class)) {
					queryselect.setString(j, (String) obj);
				}
				if (obj.getClass().equals(Integer.class)) {
					query.setInteger(i, (Integer) obj); 
				}
				 
				if (obj.getClass().equals(Double.class)) {
					query.setDouble(i, (Double) obj); 
				}
				if (obj.getClass().equals(Float.class)) {
					query.setFloat(i, (Float) obj); 
				}
				
				if (obj.getClass().equals(Date.class)) {
					queryselect.setDate(j, (Date) obj);
				}
				if (obj.getClass().equals(Timestamp.class)) {
					queryselect.setTimestamp(j, (Timestamp) obj);
				}
				j++;
			}

			queryselect.setFirstResult(start);
			queryselect.setMaxResults(pageSize);
			List data = queryselect.list();
			// page.setData(InvokeUtils.list2Maps((data)));
			page.setRows(data);
			page.setNowPage(nowPage);
			page.setTotalPage(totalPage);
		}

		return page;
	}

	@Override
	public Page findBySql(String sql, Object[] objs, int nowPage, int pageSize) {
		Page page = new Page();

		String countQueryString = "select count(0) from ( " + sql + " ) AA".toString();
		Query query = this.getSession().createSQLQuery(countQueryString);

		int i = 0;
		for (Object obj : objs) {
			if (obj.getClass().equals(String.class)) {
				query.setString(i, (String) obj);

			}
			if (obj.getClass().equals(Integer.class)) {
				query.setInteger(i, (Integer) obj); 
			}
			if (obj.getClass().equals(Double.class)) {
				query.setDouble(i, (Double) obj); 
			}
			if (obj.getClass().equals(Float.class)) {
				query.setFloat(i, (Float) obj); 
			}
			if (obj.getClass().equals(Date.class)) {
				query.setDate(i, (Date) obj);
			}
			if (obj.getClass().equals(Timestamp.class)) {
				query.setTimestamp(i, (Timestamp) obj);
			}
			i++;
		   }

		Long totalRecords = Long.parseLong(query.uniqueResult().toString());
		 
		page.setTotal(totalRecords);

		if (nowPage == -1) {
			page.setNowPage(1);
			// page.setRows(list);
		} else {
			int start = pageSize * (nowPage - 1);
			int totalPage = (int) (totalRecords / pageSize);
			if (totalPage * pageSize < totalRecords) {
				totalPage++;
			}

			//查询的结果自动封装成map
			Query queryselect = this.getSession().createSQLQuery(sql).setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
			int j = 0;
			for (Object obj : objs) {
				if (obj.getClass().equals(String.class)) {
					queryselect.setString(j, (String) obj);
				}
				if (obj.getClass().equals(Integer.class)) {
					queryselect.setInteger(j, (Integer) obj); 
				}
				if (obj.getClass().equals(Double.class)) {
					queryselect.setDouble(j, (Double) obj); 
				}
				if (obj.getClass().equals(Float.class)) {
					queryselect.setFloat(j, (Float) obj); 
				}
				if (obj.getClass().equals(Date.class)) {
					queryselect.setDate(j, (Date) obj);
				}
				if (obj.getClass().equals(Timestamp.class)) {
					queryselect.setTimestamp(j, (Timestamp) obj);
				}
				j++;
			}

			queryselect.setFirstResult(start);
			queryselect.setMaxResults(pageSize);
			List data = queryselect.list();
			// page.setData(InvokeUtils.list2Maps((data)));
			page.setRows(data);
			page.setNowPage(nowPage);
			page.setTotalPage(totalPage);
		}

		return page;
	}

}
