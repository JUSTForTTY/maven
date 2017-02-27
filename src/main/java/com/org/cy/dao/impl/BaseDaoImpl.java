package com.org.cy.dao.impl;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.RecoverableDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.cy.dao.BaseDao;

 


public class BaseDaoImpl implements BaseDao {
	 

	@SuppressWarnings("unchecked")
	public Object findByPrimaryKey(String entityName, Serializable key)
			throws HibernateException {
		return  getSession().get(entityName, key);
	}
	
	
	@SuppressWarnings("unchecked")
	public <T> T findByPrimaryKey(Class<T> clazz, Serializable key) {
		T obj = (T) getSession().get(clazz, key);
		return obj;
	}

	@SuppressWarnings("unchecked")
	public <T> T loadByPrimaryKey(Class<T> clazz, Serializable key) {
		
		return (T) getSession().load(clazz, key);
	}
	public void Clear(){
		this.getSession().clear();
	}
	
	public Query getNamedQuery(String namedQuery) {
		return getSession().getNamedQuery(namedQuery);
	}

	
	public void update(Object obj) {
		getSession().update(obj);
		getSession().flush();
	}

	
	public Serializable insert(Object obj) {
		
		return this.getSession().save(obj);
	}

	
	public void saveOrUpdate(Object obj)
			throws org.hibernate.HibernateException {
		getSession().saveOrUpdate(obj);
		
		getSession().flush();
	}

	 
	public void excuteSql(Object obj) throws org.hibernate.HibernateException {
		if (obj == null || "".equals(obj))
			return;
		
		
		this.getSession().createSQLQuery(obj.toString()).executeUpdate();
	 
		  
		 
	}

	
	public void excuteHql(String hql) {
		this.getSession().createQuery(hql).executeUpdate();
	}

	
	public void delete(Object obj) {
		this.getSession().delete(obj);
		getSession().flush();
	}

	@SuppressWarnings("rawtypes")
	
	public List findByHql(String hql) {
		Query query = this.getSession().createQuery(hql);
		this.getSession().clear();
		return query.list();
	}

	@SuppressWarnings("rawtypes")
	
	public List findBySql(String sql) {
		Query query = this.getSession().createSQLQuery(sql)
				.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		return query.list();
	}

	@SuppressWarnings("rawtypes")
	public List findBySql(String sql, Class clazs) {
		Query query = this.getSession().createSQLQuery(sql).addEntity(clazs);
		return query.list();
	}
	
	@SuppressWarnings("rawtypes")
	
	public List searchHql(String hql, int start, int limit) {
		Query query = this.getSession().createQuery(hql);
		query.setFirstResult(start);
		query.setMaxResults(limit);
		return query.list();
	}

	@SuppressWarnings("rawtypes")
	
	public List searchSql(String sql, int start, int limit) {
		Query query = this.getSession().createSQLQuery(sql)
				.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		query.setFirstResult(start);
		query.setMaxResults(limit);
		return query.list();
	}

	@SuppressWarnings("rawtypes")
	
	public List query(String hql, Object[] objs) {
		Query query = this.getSession().createQuery(hql);

		int i = 0;
		for (Object obj : objs) {
			if (obj.getClass().equals(String.class)) {
				query.setString(i, (String) obj);
				System.out.println((String) obj);
				 
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

		return query.list();
	}

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <T> Collection<T> insert(Collection<T> objs) {
		List result = new ArrayList();
		if (objs == null || objs.isEmpty())
			return result;
		Object t;
		for (Iterator iterator = objs.iterator(); iterator.hasNext();) {
			t = (Object) iterator.next();
			result.add(insert(t));
		}
		return result;
	}

	@SuppressWarnings({"rawtypes" })
	public <T> void saveOrUpdate(Collection<T> objs) throws HibernateException {
		if (objs == null || objs.isEmpty())
			return;
		Object t;
		for (Iterator iterator = objs.iterator(); iterator.hasNext(); saveOrUpdate(t))
			t = (Object) iterator.next();
	}

	@SuppressWarnings({ "rawtypes" })
	public <T> void update(Collection<T> objs) {
		if (objs == null || objs.isEmpty())
			return;
		Object t;
		for (Iterator iterator = objs.iterator(); iterator.hasNext(); update(t))
			t = (Object) iterator.next();
	}

	@SuppressWarnings({ "rawtypes" })
	public <T> void delete(Collection<T> objs) {
		if (objs == null || objs.isEmpty())
			return;
		Object t;
		for (Iterator iterator = objs.iterator(); iterator.hasNext(); delete(t))
			t = (Object) iterator.next();
	}
	
	

	@SuppressWarnings({ "rawtypes" })
	public <T> void excuteSql(Collection<T> objs) throws HibernateException {
		if (objs == null || objs.isEmpty())
			return;
		Object t;
		for (Iterator iterator = objs.iterator(); iterator.hasNext(); excuteSql(t))
			t = (Object) iterator.next();
	}

	
	public <T> void excuteHql(Collection<T> hqls) {
	}
	
	 

	public void merge(Object object) {
		getSession().merge(object);
	}
	
	 
 
 
	public Object hqlUniqueResult(String hql)
	{
		return this.getSession().createQuery(hql).uniqueResult();
	}
	
	public Object SqlUniqueResult(String hql)
	{
		return this.getSession().createSQLQuery(hql).uniqueResult();
	}
	
	
	public Session getSession() {
		
		if (null==sessionFactory.getCurrentSession()){
			Session session=sessionFactory.openSession();
			return session;
			}
		return sessionFactory.getCurrentSession();
	}

 
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public Integer findBySequence(String sql) {
		// TODO Auto-generated method stub
		 SQLQuery query = this.getSession().createSQLQuery(sql);    
		    String str =query.uniqueResult().toString();   
		    
		    return Integer.valueOf(str); 
		    
		 
	}
	@Override
	public String findByjkSequence(String sql) {
		// TODO Auto-generated method stub
		 SQLQuery query = this.getSession().createSQLQuery(sql);    
		    String str = query.uniqueResult().toString();   
		    
		    return str; 
		    
		 
	}


	@Override
	public Float selectBuyNumber(String sql) {
		// TODO Auto-generated method stub
		
		SQLQuery query = this.getSession().createSQLQuery(sql); 
            
		  String  str=query.uniqueResult().toString();  
         
	    
	    return Float.valueOf(str); 
	}


	@Override
	public void clearSession() {
		// 
		this.getSession().clear();
	}


	@Override
	public List findBySql(String sql, Object[] objs) {
	   
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
 	 
			List data = queryselect.list();
		 
		return data;
	 
	}
	
	@Override
	public void executeSql(String sql, Object[] objs) {
	   
			//查询的结果自动封装成map
			Query queryselect = this.getSession().createSQLQuery(sql.toString());
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
			queryselect.executeUpdate();
	 
			
			
	}


	@Override
	public void deleteAll(String sql, Object[] objs) {
		// 
		System.out.println(objs);
		Query queryselect = this.getSession().createSQLQuery(sql.toString());
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
				queryselect.executeUpdate();
		 
	}


	@Override
	public List query(String hql, Object[] objs, int nowPage, int pageSize) {
		// TODO Auto-generated method stub
		Query query = this.getSession().createQuery(hql);

		int i = 0;
		for (Object obj : objs) {
			if (obj.getClass().equals(String.class)) {
				query.setString(i, (String) obj);
				System.out.println((String) obj);
				 
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

		query.setFirstResult(nowPage);
		query.setMaxResults(pageSize);
		return query.list();
	}
	
	
	
	 
	
}
