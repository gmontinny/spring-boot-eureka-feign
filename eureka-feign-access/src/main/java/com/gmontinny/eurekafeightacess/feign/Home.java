package com.gmontinny.eurekafeightacess.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "home", path = "/home")
public interface Home {
    @RequestMapping(value = "/check/{login}", method = RequestMethod.GET)
    boolean check(@PathVariable("login") String login);
}
