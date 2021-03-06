package com.zrytech.framework.app.constants;

/**
 * 车辆相关常量
 * 
 * @author cat
 */
public class CarConstants {

	/**
	 * 车辆状态
	 */
	public static final String CAR_STATUS = "car_status";
	/** 车辆状态：未认证 */
	public static final String CAR_STATUS_UNCERTIFIED = "uncertified";
	/** 车辆状态：空闲 */
	public static final String CAR_STATUS_FREE = "free";
	/** 车辆状态：繁忙 */
	public static final String CAR_STATUS_BUSY = "busy";
	/** 车辆状态：正则 */
	public static final String REG_EX_CAR_STATUS = "^(" + CAR_STATUS_UNCERTIFIED + ")|(" + CAR_STATUS_FREE + ")|("
			+ CAR_STATUS_BUSY + ")|()$";
	public static final String REG_EX_CAR_STATUS_ERR_MSG = "车辆状态有误";

	
	
	/**
	 * 车辆类型
	 */
	public static final String CAR_TYPE = "car_type";
	/** 车辆类型：牵引车 */
	public static final String CAR_TYPE_TRACTOR = "car_tractor";
	/** 罐装车 */
	public static final String CAR_TYPE_FILLING = "car_filling";
	/** 车辆类型：正则 */
	public static final String REG_EX_CAR_TYPE = "^(" + CAR_TYPE_TRACTOR + ")|(" + CAR_TYPE_FILLING + ")|()$";
	public static final String REG_EX_CAR_TYPE_ERR_MSG = "车辆类型有误";
	
	
	
	/**
	 * 车辆核载量单位
	 */
	public static final String CAR_UNIT = "car_unit";
	/** 车辆核载量单位:吨 */
	public static final String CAR_UNIT_TON = "ton";
	/** 车辆核载量单位:升 */
	public static final String CAR_UNIT_LITRE = "litre";
	/** 车辆核载量单位:正则 */
	public static final String REG_EX_CAR_UNIT = "^(" + CAR_UNIT_TON + ")|(" + CAR_UNIT_LITRE + ")|()$";
	public static final String REG_EX_CAR_UNIT_ERR_MSG = "车辆核载量单位有误";

	/**
	 * 车辆长度
	 */
	public static final String CAR_LENGTH = "car_length";
	/** 3米 */
	public static final String CAR_LENGTH_THREE = "three";
	/** 5米 */
	public static final String CAR_LENGTH_FIVE = "five";
	/** 10米 */
	public static final String CAR_LENGTH_TEN = "ten";

	/** 车辆长度:正则 */
	public static final String REG_CAR_LENGTH = "^(" + CAR_LENGTH_THREE + ")|(" + CAR_LENGTH_FIVE + ")|(" + CAR_LENGTH_TEN + ")|()$";
	public static final String REG_CAR_LENGTH_ERR_MSG = "长度有误";
}
