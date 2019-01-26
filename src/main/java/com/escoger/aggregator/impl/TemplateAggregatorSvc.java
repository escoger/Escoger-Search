package com.escoger.aggregator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.escoger.searchapi.algo.ReservoirRandomSearch;
import com.escoger.searchapi.service.SearchApiServiceImpl;
import com.fasterxml.jackson.databind.node.ObjectNode;

public abstract class TemplateAggregatorSvc {

	
	
	@Autowired
	SearchApiServiceImpl searchData;
	
	@Autowired
	ReservoirRandomSearch reservoirSearch;
	
	public final ResponseEntity aggregateResponse(String searchKey){
		
		getMobRandomSearch();
		getMobRandomFiteredMainSearchData( searchKey);
		getTvRandomSearch();
		getTvRandomFiteredMainSearchData( searchKey);
		getTabRandomSearch();
		getTabRandomFiteredMainSearchData( searchKey);
		getAggregatedResponseFromAllApi();
		return null;
	}
	
	public abstract ObjectNode getMobRandomSearch();
	public abstract ObjectNode getTvRandomSearch();
	public abstract ObjectNode getTabRandomSearch();
	public abstract ObjectNode getMobRandomFiteredMainSearchData(String key);
	public abstract ObjectNode getTvRandomFiteredMainSearchData(String key);
	public abstract ObjectNode getTabRandomFiteredMainSearchData(String key);
	public abstract ObjectNode getAggregatedResponseFromAllApi();
	
}
