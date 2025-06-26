package com.zecservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {

	@RequestMapping("/data")
	public String getData() {
		return "First message fron AWS Ecs";
	}
}
