package org.example.com.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dealer")
public class DealerController {
	
	@RequestMapping("info")
	public String getDealerInfo() {
		return "Dealer-Info";
	}

}
