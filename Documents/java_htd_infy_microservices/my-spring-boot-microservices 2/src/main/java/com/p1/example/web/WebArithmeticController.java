package com.p1.example.web;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebArithmeticController {
	@Autowired
	protected WebAcctypeService acctypeService;

	

	protected Logger logger = Logger.getLogger(WebArithmeticController.class
			.getName());



	public WebArithmeticController(WebAcctypeService acctypeService) {
		this.acctypeService = acctypeService;
		
	
	

	
}}
