package com.gadgetmart.soa.soagadget.service;

import java.util.List;

import com.gadgetmart.soa.soagadget.dto.UserDTO;

import net.minidev.json.JSONObject;

public interface UserService {
	
	public boolean saveUser(UserDTO userDTO);

    public JSONObject login(String name,String password);

}
