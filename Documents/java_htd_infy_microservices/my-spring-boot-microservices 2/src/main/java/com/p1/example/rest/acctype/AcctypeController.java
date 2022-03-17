package com.p1.example.rest.acctype;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcctypeController {

	protected Logger logger = Logger.getLogger(AcctypeController.class
			.getName());

	@RequestMapping("/acc-type")
	public String doAdd() {

		
		return "acc-type";
	}
}
