# eureka-server
注册中心
Eureka server：
引入eureka-server包，启动类加上@EnableEurekaServer注解即可。
同时此包自带eureka-client包，eureka-server可配置eureka client行为，注册自身到其他注册中心，实现高可用

1.我注意到，当强行停止注册的服务时（我只注册了2个服务）。默认情况下，eureka显示如下消息
EMERGENCY! EUREKA MAY BE INCORRECTLY CLAIMING INSTANCES ARE UP WHEN THEY'RE NOT. RENEWALS ARE LESSER THAN THRESHOLD AND HENCE THE INSTANCES ARE NOT BEING EXPIRED JUST TO BE SAFE.
且服务永久不下线。这好像是由于eureka的自我保护机制（大量实例下线时，有个阈值控制比例，认为出现了大规模的网络波动，而非微服务真正下线，此时进入自我保护机制，它认为微服务本身是健康的，等待网络波动后自行恢复，等待网络健康时，自行退出自我保护机制）
https://blog.csdn.net/u012373281/article/details/89601509