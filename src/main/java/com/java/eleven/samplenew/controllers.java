package com.java.eleven.samplenew;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllers {

@GetMapping("/get")
public String getAllUsers() {
	return "this is first aws deployment";
}	
	
}
