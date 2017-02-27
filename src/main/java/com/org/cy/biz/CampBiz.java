package com.org.cy.biz;

import com.org.cy.common.Page;
import com.org.cy.entity.Activity;

public abstract interface CampBiz {
	
	public Page getCampList(Activity activity,Page page); 

	public Activity getCampDetail(String aid);
}
