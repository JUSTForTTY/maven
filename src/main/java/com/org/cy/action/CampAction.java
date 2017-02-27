package com.org.cy.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.org.cy.biz.CampBiz;
import com.org.cy.biz.DemoBiz;
import com.org.cy.common.CommonDefine;
import com.org.cy.common.Page;
import com.org.cy.entity.Activity;


/**
 *
 * @author tty
 * @version 1.0
 * @date 2017 2-24
 * 功能：营地模块
 */
@RequestMapping({ "/camp" })
@Controller
public class CampAction {

	
	private final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private CampBiz campBiz;
	
	
	/*
	 * 营地首页
	 *  
	 */
	@RequestMapping({ "/index" })
	public String getList(Page campPage,Activity activity,Model model) {

	 
		//查询营地图片切换新闻
		
		
		//查询社团type列表
		
		
		
		//查询推荐营地列表
		
		activity.setType(CommonDefine.ACTIVITY_TYPE_RECOMMEND);
		activity.setStatus(CommonDefine.ACTIVITY_STATUS_ENROLLMENT);
		activity.setIsDelete(CommonDefine.ID_DELETE_FALSE);
		
		campPage=campBiz.getCampList(activity,campPage);
		model.addAttribute("campPage", campPage);

		return "views/campsite/camp";
	}
	
	
	
	
	
	/*
	 * 推荐营地模块，查询官方推荐的营地
	 * @param:type  营地类型，分为普通类型和推荐类型 ，如果不设置类型，将全部查出
	 * @param:status 活动状态，0-报名中，1-进行中，2-已结束，3-已取消
	 * @param:isDelete  是否删除  0：否，1是
	 * @param bean:page 分页
	 */
	@RequestMapping({ "/getCampList" })
	public String getList(@RequestParam(value="type",defaultValue="-1") String type,
	@RequestParam(value="status") String status,@RequestParam(value="isDelete") String isDelete,Page page) {

	 
		Activity activity=new  Activity();
		activity.setType(type);
		activity.setStatus(status);
		activity.setIsDelete(Integer.parseInt(isDelete));
		page=campBiz.getCampList(activity,page);
		
		logger.info("列表尺寸"+page.getRows().size());

		return "success";
	}
	
	
	/*
	 * 营地详情
	 * @param:id   营地id
	 *  
	 */
	@RequestMapping({ "/campDetail" })
	public String getList(@RequestParam(value="aid") String aid) {

	 
		 
		Activity activity=campBiz.getCampDetail(aid);
		logger.info("营地编号"+activity.getAid());

		return "success";
	}
	
	
}
