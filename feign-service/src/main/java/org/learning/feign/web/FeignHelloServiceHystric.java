package org.learning.feign.web;

import org.springframework.stereotype.Service;

@Service(value = "feignHelloServiceHystric")
public class FeignHelloServiceHystric implements FeignHelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
