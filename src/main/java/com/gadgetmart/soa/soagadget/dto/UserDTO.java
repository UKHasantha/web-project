package com.gadgetmart.soa.soagadget.dto;

public class UserDTO {
	private int id;
	private String name;
	private String mobile;
	private String address;
	private String password;

	public UserDTO() {
		super();
	}

	public UserDTO(int id, String name, String mobile, String address, String password) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", mobile=" + mobile + ", address=" + address + ", password="
				+ password + "]";
	}

}
