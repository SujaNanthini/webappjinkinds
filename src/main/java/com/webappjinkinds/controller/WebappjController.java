package com.webappjinkinds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebappjController {
	@GetMapping(path = "/getmsg")
	public String getMsg() {
		return "Hello world";
	}

}
