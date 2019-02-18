package com.zry.framework.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.zry.framework.repository.CarRecordPlaceRepository;
import com.zry.framework.dto.CarRecordPlaceAddDto;
import com.zry.framework.dto.CarRecordPlacePageDto;
import com.zry.framework.entity.CarRecordPlace;
import com.zry.framework.service.CarRecordPlaceService;

/**
 * 车源起始地
 *
 */
@Service
public class CarRecordPlaceServiceImpl implements CarRecordPlaceService {

	@Autowired
	private CarRecordPlaceRepository carRecordPlaceRepository;

	/**
	 * 车源起始地分页
	 * 
	 * @param pageNumber
	 * @param pageSize
	 * @param dto
	 * @return
	 */
	@Override
	public Page<CarRecordPlace> page(Integer pageNumber, Integer pageSize, CarRecordPlacePageDto dto) {
		CarRecordPlace carRecordPlace = new CarRecordPlace();
		BeanUtils.copyProperties(dto, carRecordPlace);

		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);

		Example<CarRecordPlace> example = Example.of(carRecordPlace);

		return carRecordPlaceRepository.findAll(example, pageable);
	}

	
	/**
	 * 车源起始地详情
	 * 
	 * @param id  车源起始地Id
	 * @return
	 */
	@Override
	public CarRecordPlace details(Integer id) {
		return carRecordPlaceRepository.findById(id).get();
	}

	/**
	 * 新增车源起始地
	 * 
	 * @param dto
	 * @return
	 */
	public CarRecordPlace add(CarRecordPlaceAddDto dto) {
		CarRecordPlace carRecordPlace = new CarRecordPlace();
		BeanUtils.copyProperties(dto, carRecordPlace);
		return carRecordPlaceRepository.save(carRecordPlace);
	}
	
	
	
	
	
	
}