package org.example.com.controller;

import java.util.List;

import org.example.com.entity.AdminEntity;
import org.example.com.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	public AdminRepository adminrepo;
	
	@GetMapping("/admin-info")
	public List<AdminEntity> getAdminInfoService(){
		return this.adminrepo.findAll();
		
	}
	
	@PostMapping("/admin-save")
	public AdminEntity addAdminInfo(@RequestBody AdminEntity adminEntity) {
		return this.adminrepo.save(adminEntity);
	}
	
	@RequestMapping("/info")
	public String getAdminInfo() {
		
		return "This Is Admin-Info";
	}

}
