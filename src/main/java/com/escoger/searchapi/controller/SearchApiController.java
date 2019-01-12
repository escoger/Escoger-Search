package com.escoger.searchapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escoger.searchapi.service.SearchApiService;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@RequestMapping(path = "/search",produces = "application/json")
public class SearchApiController {
	private static final Logger logger = LoggerFactory.getLogger(SearchApiController.class);
	
	
	SearchApiService searchService;

	@Autowired
	public SearchApiController(SearchApiService searchService) {
		this.searchService = searchService;
	}

	@GetMapping	("/All")
	public ObjectNode getAllSearchBasedOnKey() {
		ObjectNode objectNode = searchService.getAllSearchBasedOnKey();
		return objectNode;
	}

}
