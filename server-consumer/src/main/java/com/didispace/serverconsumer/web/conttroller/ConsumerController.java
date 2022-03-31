package com.didispace.serverconsumer.web.conttroller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/ribbon-consumer")
    public String index() {
        /*restTemplate已通过注解开启ribbon，集成eureka。域名会被当成eureka注册的服务名*/
        return restTemplate.getForEntity("http://server-provider/hello", String.class).getBody();
    }
}
