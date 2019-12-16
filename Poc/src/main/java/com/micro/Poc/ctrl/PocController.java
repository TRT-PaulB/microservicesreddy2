package com.micro.Poc.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocController {

	@GetMapping("/")
	public String getTest() {
		return "poc returning value here";
	}
	
	
	
}
