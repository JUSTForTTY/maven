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
@Table(name = "city")
@DataTransferObject
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "cityID",length=6,nullable=true,updatable=true)
	private String cityid;

	@RemoteProperty
	@Column(name = "city",length=50,nullable=true,updatable=true)
	private String city;

	@RemoteProperty
	@Column(name = "father",length=6,nullable=true,updatable=true)
	private String father;

	@RemoteProperty
	@Column(name = "code",length=32,updatable=true)
	private String code;

	@RemoteProperty
	@Column(name = "description",length=255,updatable=true)
	private String description;

	@RemoteProperty
	@Column(name = "name",length=255,updatable=true)
	private String name;

	@RemoteProperty
	@Column(name = "province_id",length=10,updatable=true)
	private Integer provinceId;

	@RemoteProperty
	@Column(name = "sort",length=10,updatable=true)
	private Integer sort;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setCityid(String cityid){
		this.cityid = cityid;
	}
	public String getCityid(){
		return this.cityid;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return this.city;
	}
	public void setFather(String father){
		this.father = father;
	}
	public String getFather(){
		return this.father;
	}
	public void setCode(String code){
		this.code = code;
	}
	public String getCode(){
		return this.code;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return this.description;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setProvinceId(Integer provinceId){
		this.provinceId = provinceId;
	}
	public Integer getProvinceId(){
		return this.provinceId;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public Integer getSort(){
		return this.sort;
	}
}