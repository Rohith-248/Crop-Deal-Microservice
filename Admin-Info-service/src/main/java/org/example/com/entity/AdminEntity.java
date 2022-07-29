package org.example.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class AdminEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="Admin-First-Name")
	private String adminFirstName;
	@Column(name ="Admin-Last-Name")
	private String adminLastName;
	
	public AdminEntity() {
		super();
		
	}
	

	public AdminEntity(int id, String adminFirstName, String adminLastName) {
		super();
		this.id = id;
		this.adminFirstName = adminFirstName;
		this.adminLastName = adminLastName;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminFirstName() {
		return adminFirstName;
	}
	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}
	public String getAdminLastName() {
		return adminLastName;
	}
	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}

}
