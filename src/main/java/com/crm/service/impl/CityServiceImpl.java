package com.crm.service.impl;

import com.crm.dao.CityDao;
import com.crm.domain.City;
import com.crm.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;
    @Override
    public String findCity(Long id) {
        City city = cityDao.selectCity(id);
        return city.getName();
    }
//    ConcurrentHashMap
}
