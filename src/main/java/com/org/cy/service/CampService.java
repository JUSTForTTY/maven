package com.org.cy.service;

import com.org.cy.common.Page;
import com.org.cy.entity.Activity;

public interface CampService {

	public Page getCampList(Activity activity,Page page);
	
	public Activity getCampDetail(String aid);
}
