package com.org.cy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.cy.biz.CampBiz;
import com.org.cy.common.Page;
import com.org.cy.dao.SplitPageDao;
import com.org.cy.entity.Activity;
import com.org.cy.service.CampService;

@Service
public class CampServiceImpl implements CampService {

	@Autowired
	private SplitPageDao splitPageDao;

	@Override
	public Page getCampList(Activity activity, Page page) {

		String hql = "from Activity where 1=1";

		ArrayList array = new ArrayList();

		if (!"".equals(activity.getType()) && null != activity.getType()) {

			hql += " and type=?";
			// 营地类型
			array.add(activity.getType());
		}
		if (!"".equals(activity.getStatus()) && null != activity.getStatus()) {

			hql += " and status=?";
			// 营地活动进行的状态
			array.add(activity.getStatus());
		}
		if (!"".equals(activity.getIsDelete()) && null != activity.getIsDelete()) {

			hql += " and isDelete=?";
			// 是否删除
			array.add(activity.getIsDelete().toString());
		}

		  

		Object[] objs = array.toArray();

		return splitPageDao.findByHql(hql, objs, page.getNowPage(), 8);
	}

	@Override
	public Activity getCampDetail(String aid) {
		ArrayList array = new ArrayList();
		array.add(aid);
		String hql="from Activity where aid=?";
		
		Object[] objs = array.toArray();
		List<Activity> lst=splitPageDao.query(hql, objs);
		if(lst.size()>0){
			return lst.get(0);
		}else{
			return null;
		}
		 
	}

}
