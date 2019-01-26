package com.escoger.aggregator.service;

import com.fasterxml.jackson.databind.node.ObjectNode;

public interface AggregatorService {

	public ObjectNode getRandomSearchData(String searchKey);
	
	
}
