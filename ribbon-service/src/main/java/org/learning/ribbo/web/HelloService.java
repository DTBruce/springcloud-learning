package org.learning.ribbo.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    private final RestTemplate restTemplate;

    public HelloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "hiForError")
    public String hiService(String name) {
        return this.restTemplate.getForObject("http://EUREKA-LEARNING/hi?name=" + name, String.class);
    }

    public String hiForError(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
