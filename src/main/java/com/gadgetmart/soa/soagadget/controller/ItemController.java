package com.gadgetmart.soa.soagadget.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gadgetmart.soa.soagadget.dto.ItemDTO;
import com.gadgetmart.soa.soagadget.service.ItemService;

@CrossOrigin
@RestController
@RequestMapping("api/v1/web")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/Ab")
	public List<ItemDTO> getAllItemsAb(){
		return itemService.getAllItems();
	}

}
