package com.org.cy.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.directwebremoting.annotations.DataTransferObject;
import org.directwebremoting.annotations.RemoteProperty;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "service_package")
@DataTransferObject
public class ServicePackage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "item1",length=100,nullable=true,updatable=true)
	private String item1;

	@RemoteProperty
	@Column(name = "item2",length=100,nullable=true,updatable=true)
	private String item2;

	@RemoteProperty
	@Column(name = "item3",length=100,nullable=true,updatable=true)
	private String item3;

	@RemoteProperty
	@Column(name = "item4",length=500,nullable=true,updatable=true)
	private String item4;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setItem1(String item1){
		this.item1 = item1;
	}
	public String getItem1(){
		return this.item1;
	}
	public void setItem2(String item2){
		this.item2 = item2;
	}
	public String getItem2(){
		return this.item2;
	}
	public void setItem3(String item3){
		this.item3 = item3;
	}
	public String getItem3(){
		return this.item3;
	}
	public void setItem4(String item4){
		this.item4 = item4;
	}
	public String getItem4(){
		return this.item4;
	}
}