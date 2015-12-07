package com.bharat.soap.service;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.bharat.soap.GetStudentRequest;
import com.bharat.soap.GetStudentResponse;

@Endpoint
public class StudentDataEndpoint {
	
	private static final String NAMESPACE_URI = "http://bharat.com/soap";
	
	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStudentRequest")
	@ResponsePayload
	public GetStudentResponse getCountry(@RequestPayload GetStudentRequest request) {
		GetStudentResponse response = new GetStudentResponse();
		
		response.setTOTALASSETSIMPUTED(4545454);
		response.setTOTALASSETSPERCONTR(34343);
		response.setTOTALASSETSSENSITIVITY("sfdfdsfsdfsdf");
		response.setLOANOVERDEPOSITSIMPUTED("dfsdfsdfds");
		
		return response;
	}
	
}
