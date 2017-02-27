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
@Table(name = "assoc_building_category")
@DataTransferObject
public class AssocBuilingCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "category_id",length=10,nullable=true,updatable=true)
	private Integer categoryId;

	@RemoteProperty
	@Column(name = "building_id",length=10,nullable=true,updatable=true)
	private Integer buildingId;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setCategoryId(Integer categoryId){
		this.categoryId = categoryId;
	}
	public Integer getCategoryId(){
		return this.categoryId;
	}
	public void setBuildingId(Integer buildingId){
		this.buildingId = buildingId;
	}
	public Integer getBuildingId(){
		return this.buildingId;
	}
}