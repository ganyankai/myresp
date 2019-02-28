package com.zry.framework.dao.impl;

import com.github.pagehelper.PageInfo;
import com.zry.framework.dao.CargoCustomerDao;
import com.zry.framework.entity.Cargo;
import com.zry.framework.entity.CargoCustomer;
import com.zry.framework.mapper.CargoCustomerMapper;
import com.zrytech.framework.base.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = Exception.class)
public class CargoCustomerDaoImpl implements CargoCustomerDao {

    @Autowired
    CargoCustomerMapper cargoCustomerMapper;

    @Override
    public int insertCustomer(CargoCustomer cargoCustomer) {
       return cargoCustomerMapper.insertCustomer(cargoCustomer);
    }

    @Override
    public PageInfo<CargoCustomer> selectCustomerPage(CargoCustomer cargoCustomer, Page page) {
        if (page == null) {
            page = new Page();
        }
        return cargoCustomerMapper.selectCargoCustomerPage(cargoCustomer, page);
    }

    @Override
    public List<CargoCustomer> checkTelOrCount(String tel, String loginCounter) {
        return cargoCustomerMapper.checkTelOrCount(tel, loginCounter);
    }

    @Override
    public CargoCustomer findByCargoCustomerCount(String loginCounter) {
        return cargoCustomerMapper.findByCargoCustomerCount(loginCounter);
    }

    @Override
    public CargoCustomer id(Integer id) {
        return cargoCustomerMapper.id(id);
    }

    @Override
    public int update(CargoCustomer cargoCustomer) {
        return cargoCustomerMapper.update(cargoCustomer);
    }

    @Override
    public CargoCustomer findByTelCargoCustomer(CargoCustomer cargoCustomer) {
        return cargoCustomerMapper.findByTelCargoCustomer(cargoCustomer);
    }

    @Override
    public int forget(CargoCustomer cargo) {
        return cargoCustomerMapper.forget(cargo);
    }

    @Override
    public int updatePhone(CargoCustomer cargoCustomer) {
        return cargoCustomerMapper.updatePhone(cargoCustomer);
    }

    @Override
    public int setUpEnable(Integer id, Boolean isActive) {
        return cargoCustomerMapper.setUpEnable(id, isActive);
    }

    @Override
    public List<Integer> selectCarList(Cargo cargoGoods, String customerType) {
        return cargoCustomerMapper.selectCarList(cargoGoods, customerType);
    }

    @Override
    public List<Integer> selectChildListIds(Integer id) {
        return cargoCustomerMapper.selectChildListIds(id);
    }

    @Override
    public PageInfo<CargoCustomer> selectChildCustomerList(List<Integer> childCustomerIds, Page page) {
        if (page == null) {
            page = new Page();
        }
        return cargoCustomerMapper.selectChildCustomerListPage(childCustomerIds, page);
    }

    @Override
    public void editChildCustomer(CargoCustomer customer) {
        cargoCustomerMapper.editChildCustomer(customer);
    }

    @Override
    public int deleteAccount(Integer id) {
        return cargoCustomerMapper.deleteAccount(id);
    }
}
