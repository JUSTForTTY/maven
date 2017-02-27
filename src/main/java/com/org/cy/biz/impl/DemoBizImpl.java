package com.org.cy.biz.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.cy.biz.DemoBiz;
import com.org.cy.common.Page;
import com.org.cy.entity.News;
import com.org.cy.service.DemoService;

@Component
public class DemoBizImpl implements DemoBiz, Serializable {

	@Autowired
	private DemoService demoService;

	/*
	 * biz 业务逻辑层,如需处理业务逻辑的请在这层进行完成。
	 * 
	 */
	@Override
	public Page getList() {
		ArrayList al = new ArrayList();
		al.add("1");
		Object[] objs = al.toArray();

		return demoService.getList(objs);
	}

}
