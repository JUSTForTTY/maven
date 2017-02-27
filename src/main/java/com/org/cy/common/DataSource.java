package com.org.cy.common;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class DataSource extends BasicDataSource {
	public static long num = 0 ;
	
	private Log log = LogFactory.getLog(DataSource.class); 
	
	private String databasename; 
	
	public String getDatabasename() {
		return databasename;
	}

	public void setDatabasename(String databasename) {
		this.databasename = databasename;
	}

	@Override
	public Connection getConnection() throws SQLException { 
		num ++ ;
		if(log.isDebugEnabled())
			log.debug("当前活动链接数:"+this.getNumActive()+",空闲连接数："+this.getNumIdle()+",最大连接数："+this.getMaxActive());
		
		if(this.getNumActive() == 0){
			log.debug("无数据库连接可提供!当前活动链接数:"+this.getNumActive()+",空闲连接数："+this.getNumIdle()+",最大连接数："+this.getMaxActive());
		}

		Connection con = super.getConnection();    
		return con;
	}

	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		return super.getConnection(username, password);
	}

	
}
