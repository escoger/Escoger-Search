package com.escoger.searchapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escoger.aggregator.impl.AggregatorServiceimpl;
import com.escoger.aggregator.impl.TemplateAggregatorSvc;
import com.escoger.aggregator.service.AggregatorService;
import com.escoger.searchapi.service.SearchApiService;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@RequestMapping(path = "/search",produces = "application/json")
public class SearchApiController {
	private static final Logger logger = LoggerFactory.getLogger(SearchApiController.class);
	
	
	SearchApiService searchService;
	//AggregatorService randomSearchSvc;
	

	@Autowired
	public SearchApiController(SearchApiService searchService , AggregatorService randomSearchSvc) {
		this.searchService = searchService;
	//	this.randomSearchSvc = randomSearchSvc;
	}

	@PostMapping	("/All")
	public ObjectNode getAllSearchBasedOnKey() {
		ObjectNode objectNode = searchService.getAllSearchBasedOnKey();
		return objectNode;
	}
	
	@PostMapping("/randomSearch/{keysearch}")
	public ObjectNode getRandomSearch(@PathVariable String key) {
		TemplateAggregatorSvc randomSearchSvc = new AggregatorServiceimpl();
		randomSearchSvc.aggregateResponse(key);
		return null;
	}

}
