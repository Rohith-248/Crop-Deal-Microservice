package org.example.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crop")
public class CropController {
	@RequestMapping("/info")
	public String getCropInfo() {
		return "cropinfo";
	}

}
