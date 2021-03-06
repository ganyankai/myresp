package com.zrytech.framework.app.dao.impl;

import com.github.pagehelper.PageInfo;
import com.zrytech.framework.app.dao.CargoDao;
import com.zrytech.framework.app.entity.Cargo;
import com.zrytech.framework.app.entity.Offer;
import com.zrytech.framework.app.mapper.CargoMapper;
import com.zrytech.framework.base.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

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

    @Override
    public void batch(List<Integer> list, Integer id, Date date) {
        if(list !=null&& list.size()>0) {
            cargoMapper.batch(list, id, date);
        }
    }

    @Override
    public void updateSource(Cargo cargo) {
        cargoMapper.updateSource(cargo);
    }

    @Override
    public int deleteSource(Integer id) {
        return cargoMapper.deleteSource(id);
    }

    @Override
    public int invitationOffer(List<Offer> offerList, String status) {
        return cargoMapper.invitationOffer(offerList,status);
    }

    @Override
    public Offer getOfferWill(Integer cargoId, Integer carOwnnerId) {
        return cargoMapper.getOfferWill(cargoId,carOwnnerId);
    }

    @Override
    public int updateMatter(Integer cargoId, String offerPromissed, Integer carId) {
        return cargoMapper.updateMatter(cargoId,offerPromissed,carId);
    }
}
