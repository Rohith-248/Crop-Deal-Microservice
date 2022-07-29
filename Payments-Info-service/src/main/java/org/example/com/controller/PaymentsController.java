package org.example.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentsController {
	
	@RequestMapping("info")
	public String getPaymentsInfo() {
		return "Paymenst-Info";
	}

}
