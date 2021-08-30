package com.cal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * @author Murat Çelik 23:47:44 22 Tem 2021
 *
 */
@Endpoint
public class CustomerEndpoint {

	   private CustomerRepository _repository;
	   
	    @Autowired
	    public CustomerEndpoint(CustomerRepository repository) {
	        _repository = repository;
	    }

	@PayloadRoot(namespace = "http://cal.com/services", localPart = "getCustomerUsageRequest")
	@ResponsePayload
	public GetCustomerUsageResponse getUsageSummary(@RequestPayload GetCustomerUsageRequest request) {
		UsageSummary summary = _repository.GetSummaryByRegion(request.getRegion(), request.getSize());
		GetCustomerUsageResponse response = new GetCustomerUsageResponse();
		response.setUsageSummary(summary);
		return response;
	}
}
