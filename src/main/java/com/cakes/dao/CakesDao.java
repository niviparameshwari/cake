package com.cakes.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cakes.entity.CakesEntity;
import com.cakes.repository.CakesRepository;
@Repository
public class CakesDao {
	@Autowired
	CakesRepository cr;

	public String addDetails(CakesEntity ce) {
		cr.save(ce);
		return "Data Saved";
	}

}
