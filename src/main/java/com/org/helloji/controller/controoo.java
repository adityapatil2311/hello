package com.org.helloji.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controoo {

	@RequestMapping("/helllll")
	public String Adi() {
		return "hello harry";
		
	}
}
