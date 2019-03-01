package com.zrytech.framework.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zrytech.framework.app.entity.Waybill;

@Repository
public interface WaybillRepository extends JpaRepository<Waybill, Integer> {

	Waybill findByBillNo(String billNo);
	
}