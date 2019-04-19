package com.aquash.platform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aquash")
public class TestController {
	
	@RequestMapping("/test")
	public String test() {
		return "application working fine";
	}

}
