package com.graphql.exception;

import java.util.List;

import graphql.ErrorClassification;
import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class ResourceNotFoundException extends RuntimeException implements GraphQLError {

	
	public ResourceNotFoundException(String message) {
		super(message);
		
	}

	@Override
	public List<SourceLocation> getLocations() {
		//specify the location where error happens
		return null;
	}

	@Override
	public ErrorClassification getErrorType() {
		
		return ErrorType.DataFetchingException;
	}

}
