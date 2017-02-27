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
@Table(name = "marine_user")
@DataTransferObject
public class MarineUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "autoincrement")
	@GenericGenerator(name = "autoincrement", strategy = "identity")
	@RemoteProperty
	@Column(name = "id",length=10,updatable=true)
	private Integer id;

	@RemoteProperty
	@Column(name = "address",length=255,nullable=true,updatable=true)
	private String address;

	@RemoteProperty
	@Column(name = "birthday",length=0,nullable=true,updatable=true)
	private Date birthday;

	@RemoteProperty
	@Column(name = "cardId",length=45,nullable=true,updatable=true)
	private String cardid;

	@RemoteProperty
	@Column(name = "createtime",length=0,nullable=true,updatable=true)
	private Date createtime;

	@RemoteProperty
	@Column(name = "createUser",length=255,nullable=true,updatable=true)
	private String createuser;

	@RemoteProperty
	@Column(name = "eligibility_number",length=255,nullable=true,updatable=true)
	private String eligibilityNumber;

	@RemoteProperty
	@Column(name = "eligibility_valid",length=0,nullable=true,updatable=true)
	private Date eligibilityValid;

	@RemoteProperty
	@Column(name = "email",length=255,nullable=true,updatable=true)
	private String email;

	@RemoteProperty
	@Column(name = "emergency_number",length=255,nullable=true,updatable=true)
	private String emergencyNumber;

	@RemoteProperty
	@Column(name = "fax",length=50,nullable=true,updatable=true)
	private String fax;

	@RemoteProperty
	@Column(name = "gender",length=3,nullable=true,updatable=true)
	private String gender;

	@RemoteProperty
	@Column(name = "job",length=10,nullable=true,updatable=true)
	private Integer job;

	@RemoteProperty
	@Column(name = "marineId",length=255,nullable=true,updatable=true)
	private String marineid;

	@RemoteProperty
	@Column(name = "member_id",length=255,nullable=true,updatable=true)
	private String memberId;

	@RemoteProperty
	@Column(name = "mobile",length=96,nullable=true,updatable=true)
	private String mobile;

	@RemoteProperty
	@Column(name = "openId",length=255,nullable=true,updatable=true)
	private String openid;

	@RemoteProperty
	@Column(name = "passwd",length=50,nullable=true,updatable=true)
	private String passwd;

	@RemoteProperty
	@Column(name = "prepay",length=8,nullable=true,updatable=true)
	private String prepay;

	@RemoteProperty
	@Column(name = "qq",length=50,nullable=true,updatable=true)
	private String qq;

	@RemoteProperty
	@Column(name = "ships_id",length=255,nullable=true,updatable=true)
	private String shipsId;

	@RemoteProperty
	@Column(name = "status",length=10,nullable=true,updatable=true)
	private Integer status;

	@RemoteProperty
	@Column(name = "Train_valid",length=0,nullable=true,updatable=true)
	private Date trainValid;

	@RemoteProperty
	@Column(name = "updateUser",length=255,nullable=true,updatable=true)
	private String updateuser;

	@RemoteProperty
	@Column(name = "username",length=50,nullable=true,updatable=true)
	private String username;

	@RemoteProperty
	@Column(name = "userType",length=10,nullable=true,updatable=true)
	private Integer usertype;


	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	public Date getBirthday(){
		return this.birthday;
	}
	public void setCardid(String cardid){
		this.cardid = cardid;
	}
	public String getCardid(){
		return this.cardid;
	}
	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}
	public Date getCreatetime(){
		return this.createtime;
	}
	public void setCreateuser(String createuser){
		this.createuser = createuser;
	}
	public String getCreateuser(){
		return this.createuser;
	}
	public void setEligibilityNumber(String eligibilityNumber){
		this.eligibilityNumber = eligibilityNumber;
	}
	public String getEligibilityNumber(){
		return this.eligibilityNumber;
	}
	public void setEligibilityValid(Date eligibilityValid){
		this.eligibilityValid = eligibilityValid;
	}
	public Date getEligibilityValid(){
		return this.eligibilityValid;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmergencyNumber(String emergencyNumber){
		this.emergencyNumber = emergencyNumber;
	}
	public String getEmergencyNumber(){
		return this.emergencyNumber;
	}
	public void setFax(String fax){
		this.fax = fax;
	}
	public String getFax(){
		return this.fax;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return this.gender;
	}
	public void setJob(Integer job){
		this.job = job;
	}
	public Integer getJob(){
		return this.job;
	}
	public void setMarineid(String marineid){
		this.marineid = marineid;
	}
	public String getMarineid(){
		return this.marineid;
	}
	public void setMemberId(String memberId){
		this.memberId = memberId;
	}
	public String getMemberId(){
		return this.memberId;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getMobile(){
		return this.mobile;
	}
	public void setOpenid(String openid){
		this.openid = openid;
	}
	public String getOpenid(){
		return this.openid;
	}
	public void setPasswd(String passwd){
		this.passwd = passwd;
	}
	public String getPasswd(){
		return this.passwd;
	}
	public void setPrepay(String prepay){
		this.prepay = prepay;
	}
	public String getPrepay(){
		return this.prepay;
	}
	public void setQq(String qq){
		this.qq = qq;
	}
	public String getQq(){
		return this.qq;
	}
	public void setShipsId(String shipsId){
		this.shipsId = shipsId;
	}
	public String getShipsId(){
		return this.shipsId;
	}
	public void setStatus(Integer status){
		this.status = status;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setTrainValid(Date trainValid){
		this.trainValid = trainValid;
	}
	public Date getTrainValid(){
		return this.trainValid;
	}
	public void setUpdateuser(String updateuser){
		this.updateuser = updateuser;
	}
	public String getUpdateuser(){
		return this.updateuser;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getUsername(){
		return this.username;
	}
	public void setUsertype(Integer usertype){
		this.usertype = usertype;
	}
	public Integer getUsertype(){
		return this.usertype;
	}
}