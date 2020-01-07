package com.teste.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NameController {

    @GetMapping(path = "/name", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> getName() {

	Map<String, String> map = new HashMap<>();
	map.put("name1", "client");

	return map;
    }
}
