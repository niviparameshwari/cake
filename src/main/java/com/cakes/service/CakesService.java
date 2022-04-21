package com.cakes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakes.dao.CakesDao;
import com.cakes.entity.CakesEntity;
@Service
public class CakesService {
	@Autowired
	CakesDao cd;

	public String addDetails(CakesEntity ce) {
		return cd.addDetails(ce) ;
	}

}
