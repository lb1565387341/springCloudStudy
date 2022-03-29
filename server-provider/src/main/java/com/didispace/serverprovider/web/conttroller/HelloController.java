package com.didispace.serverprovider.web.conttroller;

import com.netflix.discovery.EurekaClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Slf4j
public class HelloController {

    /*DiscoveryClient相当于spring cloud的通用API 需要加注解才能生成这个bean*/
    @Autowired
    private DiscoveryClient client;

    /*EurekaClient是Netflix的接口 不用加注解默认就有bean*/
    // @Autowired
    private EurekaClient discoveryClient;

    @RequestMapping("/hello")
    public String index() {
        List<ServiceInstance> instance = client.getInstances("server-provider1");
        return "Hello World";
    }
}
