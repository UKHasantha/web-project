package com.gadgetmart.soa.soagadget.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gadgetmart.soa.soagadget.dto.UserDTO;
import com.gadgetmart.soa.soagadget.service.UserService;

import net.minidev.json.JSONObject;

@CrossOrigin
@RestController
@RequestMapping("api/v1/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/save")
	public boolean saveUser(@RequestBody UserDTO userDTO) {
		userService.saveUser(userDTO);
		return true;
	}

	@PostMapping("/login")
	public JSONObject login(@RequestBody String name, String password) {
		JSONObject obj = userService.login(name, password);
		System.out.println("json "+obj.toJSONString());
		return obj;
	}

}
