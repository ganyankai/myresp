package com.zry.framework.service;

import org.springframework.stereotype.Service;

import com.zry.framework.dto.CargoMatterPageDto;
import com.zry.framework.dto.DetailsDto;
import com.zry.framework.dto.cargomatter.CargoMatterAddDto;
import com.zry.framework.dto.cargomatter.CargoMatterUpdateDto;
import com.zry.framework.entity.Customer;
import com.zrytech.framework.base.entity.ServerResponse;

@Service
public interface CargoMatterService {
	
	public ServerResponse page(CargoMatterPageDto dto, Integer pageNum, Integer pageSize);
	
	public ServerResponse details(Integer id);
	
	
	public ServerResponse add(CargoMatterAddDto dto, Customer customer);
	
	public ServerResponse update(CargoMatterUpdateDto dto, Customer customer);
	
	public ServerResponse details(DetailsDto dto, Customer customer);
	
	public ServerResponse page(CargoMatterPageDto dto, Integer pageNum, Integer pageSize, Customer customer);
	

}
