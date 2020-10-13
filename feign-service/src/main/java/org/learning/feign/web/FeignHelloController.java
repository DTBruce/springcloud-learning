package org.learning.feign.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHelloController {
    private final FeignHelloService feignHelloService;

    public FeignHelloController(FeignHelloService feignHelloService) {
        this.feignHelloService = feignHelloService;
    }

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return this.feignHelloService.sayHiFromClientOne(name);
    }
}
