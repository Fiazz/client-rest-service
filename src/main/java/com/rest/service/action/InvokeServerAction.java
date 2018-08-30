package com.rest.service.action;

import java.net.URI;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Component
public class InvokeServerAction {

	private RestTemplate restTemplate = new RestTemplate();

	public void invoke() {
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
		headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
		RequestEntity requestEntity = new RequestEntity(headers, HttpMethod.POST,
				URI.create("https://localhost:11402/restservice/invoke"));
		ResponseEntity<String> response = restTemplate.exchange(requestEntity, String.class);
		System.out.println("Downstream server response : " + response);

	}

}
