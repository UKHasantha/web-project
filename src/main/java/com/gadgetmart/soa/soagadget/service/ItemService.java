package com.gadgetmart.soa.soagadget.service;

import java.util.List;

import com.gadgetmart.soa.soagadget.dto.ItemDTO;
import com.gadgetmart.soa.soagadget.model.Item;

public interface ItemService {
	
	public List<ItemDTO> getAllItems();
}
