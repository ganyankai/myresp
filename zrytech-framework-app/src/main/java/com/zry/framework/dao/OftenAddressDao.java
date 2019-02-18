package com.zry.framework.dao;

import com.zrytech.framework.price.entity.OftenAddress;

import java.util.Date;
import java.util.List;

public interface OftenAddressDao {

    void batchSave(int cargoId, List<OftenAddress> list, Date date);
}