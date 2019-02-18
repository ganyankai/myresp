package com.zry.framework.dao.impl;

import com.github.pagehelper.PageInfo;
import com.zry.framework.dao.CargoDao;
import com.zry.framework.entity.Cargo;
import com.zry.framework.mapper.CargoMapper;
import com.zrytech.framework.base.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(rollbackFor = Exception.class)
public class CargoDaoImpl implements CargoDao {

    @Autowired
    private CargoMapper cargoMapper;

    @Override
    public PageInfo<Cargo> cargoPage(Cargo cargo, String orderField, Page page) {
        if (page == null) {
            page = new Page();
        }
        return cargoMapper.cargoPage(cargo, orderField, page);
    }

    @Override
    public Cargo get(Integer id) {
        return cargoMapper.get(id);
    }

    @Override
    public int updateAudit(Cargo cargo) {
        return cargoMapper.updateAudit(cargo);
    }

    @Override
    public int pushSave(Cargo cargo) {
        return cargoMapper.pushSave(cargo);
    }
}
