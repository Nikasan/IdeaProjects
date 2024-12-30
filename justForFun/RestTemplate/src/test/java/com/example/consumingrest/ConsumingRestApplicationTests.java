package com.example.consumingrest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class ConsumingRestApplicationTests {

    String URL = "https://www.healthcare.gov/api/articles.json";
    //	@Autowired

    @Autowired
    private RestTemplate restTemplate;


    @Test
    void contextLoads() {
        ResponseEntity<Articles> response
                = restTemplate.getForEntity(URL, Articles.class);
        Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);
    }

    @Test
    void pojoMapper() {
		System.out.println("Before test");
        Articles art = restTemplate.getForObject(URL, Articles.class);
        System.out.println(art.getArticles().get(0).getTitle());
		System.out.println("After test");
    }

}
