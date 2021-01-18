package com.gadgetmart.soa.soagadget.controller;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.gadgetmart.soa.soagadget.dto.ItemDTO;

@Component
public class WebClient {
	public String[] getItems() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://localhost:8090/api/v1/abans" + "user", String[].class);
	}

	public List<ItemDTO> getItemAll() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://localhost:8083/api/v1/abans/get" + "", List.class);
	}

}
