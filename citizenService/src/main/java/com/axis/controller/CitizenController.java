package com.axis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.dao.ICitizenDao;
import com.axis.entity.Citizen;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	@Autowired
	ICitizenDao dao;
	@GetMapping("/get")
public ResponseEntity<Object> test(){
	return new ResponseEntity<Object>("welcome to microservices",HttpStatus.OK);
}
	
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Object> getCitizens(@PathVariable int id){
		return new ResponseEntity<Object>(dao.findCitizensByVaccinationCenterId(id),HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Object> addCitizen(@RequestBody Citizen citizen){
		dao.save(citizen);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
}
