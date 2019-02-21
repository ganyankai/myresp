package com.zry.framework.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "`sys_customer`")
public class Customer {
	
	/**主键，自增*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	/**账号*/
	@Column(name = "`user_account`")
    private String userAccount;

	/**手机号*/
	@Column(name = "`tel`")
	private String tel;

	/**密码*/
	@JsonIgnore
	@Column(name = "`password`")
	private String password;

	/**名称*/
	@Column(name = "`user_name`")
	private String userName;

	/**logo*/
	@Column(name = "`logo`")
	private String logo;

	/**appOpenid*/
	@Column(name = "`app_openid`")
	private String appOpenid;

	/**openid*/
	@Column(name = "`openid`")
	private String openid;

	/**unionid*/
	@Column(name = "`unionid`")
	private String unionid;
	
	/***/
	@Column(name = "`extend`")
	private String extend;
	
	/**用户类型*/
	@Column(name = "`customer_type`")
	private String customerType;

	@Column(name = "`user_status`")
	private String userStatus;
	
	/**创建人*/
	@Column(name = "`create_by`")
	private Integer createBy;

	/**注册日期*/
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@Column(name = "`create_date`")
	private Date createDate;
	
	/**状态*/
	@Column(name = "`is_active`")
	private Boolean isActive;
	
	
}