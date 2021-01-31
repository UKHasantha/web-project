package com.gadgetmart.soa.soagadget.service.impl;

import java.util.ArrayList;
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
	public List<ItemDTO> getAllItems() {
		try {
			List<ItemDTO> newList = new ArrayList<ItemDTO>();

			List<ItemDTO> listDTO1 = webclient.getItemAbans();
			List<ItemDTO> listDTO2 = webclient.getItemSin();
			List<ItemDTO> listDTO3 = webclient.getItemSoft();

			if (listDTO1.isEmpty()) {
				throw new Exception("cannot get abans data..");
			}
			if (listDTO2.isEmpty()) {
				throw new Exception("cannot get singer data..");
			}
			if (listDTO3.isEmpty()) {
				throw new Exception("cannot get softlogic data..");
			}

			newList.addAll(listDTO1);
			newList.addAll(listDTO2);
			newList.addAll(listDTO3);

			return newList;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
