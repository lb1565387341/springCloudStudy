package com.didispace.serverconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*默认不需要注解 引了client包自动注册eureka client*/
public class ServerConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerConsumerApplication.class, args);
	}

}
