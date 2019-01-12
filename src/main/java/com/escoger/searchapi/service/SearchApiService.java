package com.escoger.searchapi.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public interface SearchApiService {

	public ObjectNode getAllSearchBasedOnKey();
}
