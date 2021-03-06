package com.zrytech.framework.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zrytech.framework.app.constants.ApproveConstants;
import com.zrytech.framework.app.constants.CarPersonConstants;
import com.zrytech.framework.app.dto.carperson.CarPersonCheckUpdateDto;
import com.zrytech.framework.app.utils.DictionaryUtil;
import com.zrytech.framework.base.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * 车辆司机与压货人
 * @author cat
 */
@Setter
@Getter
@Entity
@Table(name = "`car_person`")
public class CarPerson extends BaseEntity {
	
	@Transient
	private String customerUserAccount;
	
	@Transient
	private String customerTel;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7265007835206061355L;

	/**主键，自增*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	/**姓名*/
	@Column(name = "`name`")
    private String name;

	/**logo*/
	@Column(name = "`logo`")
    private String logo;
	
	/**手机号*/
	@Column(name = "`tel`")
    private String tel;
	
	/**性别*/
	@Column(name = "`sex`")
    private String sex;

	/**年龄*/
	@Column(name = "`age`")
    private Integer age;
	
	/**身份证*/
	@Column(name = "`id_card`")
    private String idCard;

	/**客户Id*/
	@Column(name = "`customer_id`")
    private Integer customerId;
	
	/**驾驶证*/
	@Column(name = "`driving_licence`")
    private String drivingLicence;
	
	/**删除标识*/
	@Column(name = "`is_delete`")
    private Boolean isDelete;
	
	/**创建人Id*/
	@Column(name = "`create_by`")
    private Integer createBy;

	/**车主Id*/
	@Column(name = "`car_owner_id`")
	private Integer carOwnerId;
	
	/**需要审批字段的JSON字符串*/
	@JsonIgnore
	@Column(name = "`approve_content`")
	private String approveContent;
	
    /**创建日期*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	@Column(name = "`create_date`")
    private Date createDate;
	
	/**状态*/
	@Column(name = "`status`")
    private String status;
	
	/**状态*/
	public String getStatusCN() {
		if (StringUtils.isNotBlank(status)) {
            return DictionaryUtil.getValue(CarPersonConstants.PERSON_STATUS, status);
        }
        return status;
	}
	
	/**类型*/
	@Column(name = "`person_type`")
    private String personType;
	
	/**类型*/
	public String getPersonTypeCN() {
		if (StringUtils.isNotBlank(personType)) {
            return DictionaryUtil.getValue(CarPersonConstants.PERSON_TYPE, personType);
        }
        return personType;
	}
	
	/**审批状态*/
	@Column(name = "`approve_status`")
	private String approveStatus;
	
	/**审批状态*/
	public String getApproveStatusCN() {
		if (StringUtils.isNotBlank(approveStatus)) {
            return DictionaryUtil.getValue(ApproveConstants.STATUS, approveStatus);
        }
        return approveStatus;
	}
	
	/**司机账号状态*/
	@Transient
	private Boolean isActive;
	
	/**车主企业名称*/
	@Transient
	private String carOwnerName;
	
	/**车主*/
	@Transient
	private CarCargoOwnner carOwner;
	
	/**需要审核的内容*/
	public CarPersonCheckUpdateDto getApproveContentCN() {
		return JSON.parseObject(approveContent, CarPersonCheckUpdateDto.class);
	}
}