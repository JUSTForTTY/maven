package com.org.cy.biz.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.cy.biz.CampBiz;
import com.org.cy.common.Page;
import com.org.cy.entity.Activity;
import com.org.cy.service.CampService;
import com.org.cy.service.DemoService;

@Component
public class CampBizImpl implements CampBiz {

	@Autowired
	private CampService campService;
	@Override
	public Page getCampList(Activity activity,Page page) {
		 
		
		return campService.getCampList(activity, page);
	}
	@Override
	public Activity getCampDetail(String aid) {
		
		
		
		return campService.getCampDetail(aid);
	}

}
