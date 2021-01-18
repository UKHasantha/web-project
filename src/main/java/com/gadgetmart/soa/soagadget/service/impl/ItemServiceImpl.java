package com.gadgetmart.soa.soagadget.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gadgetmart.soa.soagadget.controller.WebClient;
import com.gadgetmart.soa.soagadget.dto.ItemDTO;
import com.gadgetmart.soa.soagadget.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private WebClient webclient;

	@Override
	public List<ItemDTO> getAll() {
		List<ItemDTO> listDTO= webclient.getItemAll();
		return listDTO;
	}

}
