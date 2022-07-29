package org.example.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/farmer")
public class FarmerController {
	
	@RequestMapping("/info")
	public String getFarmerInfo() {
		return "Farmer-Info";
	}

}
