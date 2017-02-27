package com.org.cy.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.cy.common.Page;
import com.org.cy.dao.SplitPageDao;
import com.org.cy.entity.News;
import com.org.cy.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService, Serializable {

	@Autowired
	private SplitPageDao splitPageDao;

	/*
	 * 严禁直接赋值，如有违反，扣工资 
	 * 推荐使用hql
	 */
	@Override
	public Page getList(Object[] objs) {

		String hql = "from News where onHome=?";

		return splitPageDao.findByHql(hql, objs, 0, 8);
	}

}
