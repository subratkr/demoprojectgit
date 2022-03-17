package com.p1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityControllr {
	
	@RequestMapping("/")
	public String hello() {
		return "Welcome to SpringBoot Security API  @Infy ";
	}
}