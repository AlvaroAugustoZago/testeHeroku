package com.teste.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NameController {

    @Autowired
    private DealsRepository repository;
    
    @GetMapping(path = "/name", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> getName() {

	Deals deals = repository.getOne("10017");
	
	Map<String, String> map = new HashMap<>();
	map.put("name1", deals.getDealName());

	return map;
    }
}
