package com.bvcott.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/courses
/*
 * {
 * 		"id": 1,
 * 		"name": "courseName",
 * 		"author": "authorName"
 * }
 */

@RestController()
public class CurrencyConfigurationController {
	@Autowired private CurrencyServiceConfiguration config;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourses() {
		return config;
	}
}
