package com.tiem.springswgger.modal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Contact {

	@NotBlank
	@Size(min = 0, max = 20)
	private String id;
	
	@NotBlank
	@Size(min = 0, max = 30)
	private String name;
	private String phone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
