package com.cakes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cakes.entity.CakesEntity;
import com.cakes.service.CakesService;

@RestController
public class CakesController {
	@Autowired
	CakesService cs;
	
	@PostMapping("/add") 
	public String addDetails(@RequestBody CakesEntity ce) {
		return cs.addDetails(ce);
	}

}
