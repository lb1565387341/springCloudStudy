package com.didispace.serverconsumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    /*打开ribbon负载均衡，打开后集成eureka。restTemplate发起请求不再通过完整url直接访问，而是将url中域名当成service-id（服务名）查找对应实例调用请求*/
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
