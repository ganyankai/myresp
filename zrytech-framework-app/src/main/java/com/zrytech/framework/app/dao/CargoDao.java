package com.zrytech.framework.app.dao;

import com.github.pagehelper.PageInfo;
import com.zrytech.framework.app.entity.Cargo;
import com.zrytech.framework.app.entity.Offer;
import com.zrytech.framework.base.entity.Page;

import java.util.Date;
import java.util.List;

public interface CargoDao {
    PageInfo<Cargo> cargoPage(Cargo cargo, String orderField, Page page);

    Cargo get(Integer id);

    int updateAudit(Cargo cargo);

    int pushSave(Cargo cargo);

    void batch(List<Integer> list, Integer id, Date date);

    void updateSource(Cargo cargo);

    int deleteSource(Integer id);

    int invitationOffer(List<Offer> offerList, String status);

    Offer getOfferWill(Integer cargoId, Integer carOwnnerId);

    int updateMatter(Integer cargoId, String offerPromissed, Integer carId);

}
