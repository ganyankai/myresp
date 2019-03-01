package com.zrytech.framework.app.front.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zrytech.framework.app.dto.CommonDto;
import com.zrytech.framework.app.dto.DeleteDto;
import com.zrytech.framework.app.dto.DetailsDto;
import com.zrytech.framework.app.dto.carperson.CarOwnerCarPersonPageDto;
import com.zrytech.framework.app.dto.carperson.CarPersonAddDto;
import com.zrytech.framework.app.dto.carperson.CarPersonCheckUpdateDto;
import com.zrytech.framework.app.dto.carperson.CarPersonEnabledDto;
import com.zrytech.framework.app.dto.carperson.CarPersonNoCheckUpdateDto;
import com.zrytech.framework.app.entity.Customer;
import com.zrytech.framework.app.service.CarPersonService;
import com.zrytech.framework.base.entity.RequestParams;
import com.zrytech.framework.base.entity.ServerResponse;
import com.zrytech.framework.base.util.RequestUtil;


/**
 * 前台 - 司机与压货人
 * 
 * @author cat
 *
 */
@RestController
@RequestMapping("/api/carPerson")
public class CarPersonAPIController {

	@Autowired
	private CarPersonService carPersonService;

	
	/**
	 * 司机与压货人启用禁用
	 * 
	 * @param requestParams
	 * @param result
	 * @param customer	车主或者车主子账号
	 * @return
	 */
	@Valid
	@RequestMapping("/enabled")
	public ServerResponse enabled(@RequestBody @Valid RequestParams<CarPersonEnabledDto> requestParams, BindingResult result) {
		Customer customer = RequestUtil.getCurrentUser(Customer.class);
		return carPersonService.enabled(requestParams.getParams(), customer);
	}
	
	
	/**
	 * 删除司机与压货人
	 * 
	 * @param requestParams
	 * @param result
	 * @param customer	车主或者车主子账号
	 * @return
	 */
	@Valid
	@RequestMapping("/delete")
	public ServerResponse delete(@RequestBody @Valid RequestParams<DeleteDto> requestParams, BindingResult result) {
		Customer customer = RequestUtil.getCurrentUser(Customer.class);
		return carPersonService.delete(requestParams.getParams(), customer);
	}
	
	
	/**
	 * 提交审核
	 * 
	 * @param requestParams
	 * @param result
	 * @param customer
	 * @return
	 */
	@Valid
	@RequestMapping("/submitAudit")
	public ServerResponse submitAudit(@RequestBody @Valid RequestParams<CommonDto> requestParams, BindingResult result) {
		Customer customer = RequestUtil.getCurrentUser(Customer.class);
		return carPersonService.submitAudit(requestParams.getParams(), customer);
	}

	
	/**
	 * 修改司机与压货人不需要审核的内容
	 * 
	 * @param requestParams
	 * @param result
	 * @param customer
	 * @return
	 */
	@Valid
	@RequestMapping("/updateNoCheck")
	public ServerResponse updateNoCheck(@RequestBody @Valid RequestParams<CarPersonNoCheckUpdateDto> requestParams, BindingResult result) {
		Customer customer = RequestUtil.getCurrentUser(Customer.class);
		return carPersonService.updateNoCheck(requestParams.getParams(), customer);
	}
	
	
	/**
	 * 修改司机与压货人需要审核的内容
	 * 
	 * @param requestParams
	 * @param result
	 * @param customer
	 * @return
	 */
	@Valid
	@RequestMapping("/updateCheck")
	public ServerResponse updateCheck(@RequestBody @Valid RequestParams<CarPersonCheckUpdateDto> requestParams, BindingResult result) {
		Customer customer = RequestUtil.getCurrentUser(Customer.class);
		return carPersonService.updateCheck(requestParams.getParams(), customer);
	}
	
	
	/**
	 * 添加司机与压货人
	 * 
	 * @param requestParams
	 * @param result
	 * @param customer	车主或者车主子账号
	 * @return
	 */
	@Valid
	@RequestMapping("/add")
	public ServerResponse add(@RequestBody @Valid RequestParams<CarPersonAddDto> requestParams, BindingResult result) {
		Customer customer = RequestUtil.getCurrentUser(Customer.class);
		return carPersonService.add(requestParams.getParams(), customer);
	}
	
	
	/**
	 * 司机与压货人详情
	 * 
	 * @param requestParams
	 * @param result
	 * @param customer
	 * @return
	 */
	@Valid
	@RequestMapping("/details")
	public ServerResponse details(@RequestBody @Valid RequestParams<DetailsDto> requestParams, BindingResult result) {
		Customer customer = RequestUtil.getCurrentUser(Customer.class);
		return carPersonService.details(requestParams.getParams(), customer);
	}
	
	
	/**
	 * 司机与压货人分页
	 * 
	 * @param requestParams
	 * @param result
	 * @param customer
	 * @return
	 */
	@Valid
	@RequestMapping("/page")
	public ServerResponse page(@RequestBody @Valid RequestParams<CarOwnerCarPersonPageDto> requestParams, BindingResult result) {
		Customer customer = RequestUtil.getCurrentUser(Customer.class);
		return carPersonService.page(requestParams.getParams(), requestParams.getPage().getPageNum(),
				requestParams.getPage().getPageSize(), customer);
	}
	
	
}
