package com.zrytech.framework.app.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zrytech.framework.app.entity.Evaluate;
import com.zrytech.framework.base.repository.BaseRepository;

@Repository
public interface EvaluateRepository extends BaseRepository<Evaluate, Integer> {

	List<Evaluate> findByBillNo(String billNo);

	Evaluate findByWaybillIdAndAppraiserId(Integer waybillId, Integer appraiserId);

	Evaluate findByWaybillIdAndAppraiserIdAndEvaluateType(Integer waybillId, Integer appraiserId, String evaluateType);

	List<Evaluate> findByAppraiserById(Integer appraiserById);

}
