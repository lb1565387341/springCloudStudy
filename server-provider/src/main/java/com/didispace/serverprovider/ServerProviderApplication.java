package com.didispace.serverprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
/*加上此注解。启动应用时初始化DiscoveryClient的实例Bean HelloController能拿到bean
* 注：这个注解不加也可以。只是为了拿到DiscoveryClient的bean,EurekaClient类型的bean默认就会拿到不需要加此注解
* */
@EnableDiscoveryClient
public class ServerProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerProviderApplication.class, args);
	}

}
