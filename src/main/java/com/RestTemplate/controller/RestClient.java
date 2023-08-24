package com.RestTemplate.controller;


import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


public class RestClient
{
    private static final String GET_ALL_EMPLOYEES_API="http://localhost:8080/api/v1/employees";

    static RestTemplate restTemplate=new RestTemplate();

    public static void main(String args[])
    {
        HttpHeaders headers=new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity=new HttpEntity<>("parameters",headers);
        ResponseEntity<String> exchange = restTemplate.exchange(GET_ALL_EMPLOYEES_API, HttpMethod.GET, entity, String.class);
        System.out.println(exchange);
    }
}
