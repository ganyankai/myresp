package com.zry.framework.mapper;

import com.github.pagehelper.PageInfo;
import com.zrytech.framework.base.entity.Page;
import com.zrytech.framework.price.entity.Certification;
import org.apache.ibatis.annotations.Param;

public interface ShipperMapper {

    int save(Certification certification);

    int updateCertification(Certification certification);

    Certification get(@Param("id") Integer id);

    Certification getCustomerId(@Param("customerId") Integer customerId);

    PageInfo<Certification> certificationPage(@Param("certification") Certification certification, Page page);

    int updateAudit(Certification certification);

    int avoidAudit(Certification certification);

}