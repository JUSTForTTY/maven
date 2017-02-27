package com.org.cy.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.cy.biz.DemoBiz;
import com.org.cy.common.Page;
import com.org.cy.entity.News;

/**
 * 
 * @author tty  开发规范
 *         1.字符串的拼加操作，必须使用StringBuilder；
 *         2.Java类的名称第一个子母必须大写，有多个单词组成的，每个单词的首字母大写 3.jsp的文件名必须全部小写；
 * 
 *         4.代码中严禁使用System.out.println()进行调试输出，如果要使用调试信息，必须使用log.debug()。
 *         5.对于必要的信息使用log.info()进行输出； 
 *         6.有业务逻辑处理的类必须写junit单元测试类 
 *         7.try…catch的用法
 *  
 *         try{
 * 
 *         }catch{Exception e e.printStackTrace(); 
 *         }finally{
 * 
 *         }//在最外层的Action中可以使用，其它地方一律禁止使用；
 *         8.编写通用性的类时，请遵守标准形式。包括定义equals()、hasCode()、
 *         toString()、Clone(实现Cloneable接口)，并实现Comparable和Serialiable接口
 */
@RequestMapping({ "/demo" })
@Controller
public class DemoAction {

	private final Log logger = LogFactory.getLog(getClass());
	@Autowired
	private DemoBiz demoBiz;

	/*
	 * 查询操作，请使用位参进行赋值 接收的参数请在注释中表明意思 例： param：id 商品id
	 * 如需使用常量参数，请在commonDefine中定义，或者建枚举，严禁直接写 0,1,2
	 * 
	 */
	@RequestMapping({ "/getlist" })
	public String getList() {
        
		Page page = demoBiz.getList();

		logger.debug("列表尺寸" + page.getRows().size());

		return "success";
	}

}
