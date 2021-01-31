package com.gadgetmart.soa.soagadget.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gadgetmart.soa.soagadget.dto.UserDTO;
import com.gadgetmart.soa.soagadget.model.User;
import com.gadgetmart.soa.soagadget.repository.UserRepository;
import com.gadgetmart.soa.soagadget.service.UserService;

import net.minidev.json.JSONObject;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean saveUser(UserDTO userDTO) {
		userRepository.save(new User(userDTO.getId(), userDTO.getName(), userDTO.getMobile(), userDTO.getAddress(),
				userDTO.getPassword()));
		return true;
	}

	@Override
	public JSONObject login(String username, String userpassword) {
		JSONObject json = new JSONObject();
		List<User> users = userRepository.findBynamepassword(username, userpassword);
		List<UserDTO> all = new ArrayList<>();
		for (User users1 : users) {
			UserDTO userDTO = new UserDTO(users1.getId(), users1.getName(), users1.getMobile(), users1.getAddress(),
					users1.getPassword());
			all.add(userDTO);						
			json.put("name", userDTO.getName());
			json.put("mobile", userDTO.getMobile());

		}
		return json;
	}

}
