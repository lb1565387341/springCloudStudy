# server-consumer
服务消费者
Eureka client + Ribbon：
1. Eureka client 负责服务发现，从注册中心拉取服务列表
2. Ribbon负责服务消费：
   Ribbon是一个基于HTTP和TCP的客户端负载均衡器，它可以通过客户端中配置的ribbonServerList服务端列表去轮询访问以达到均衡负载的作用。
   当Ribbon与Eureka联合使用时，Ribbon的服务实例清单RibbonServerList会被DiscoveryEnabledNIWSServerList重写， 扩展成从Eureka注册中心中获取服务端列表。 同时它也会用NIWSDiscoveryPing来取代IPing, 它将职责委托给Eureka来确定服务端是否已经启动。
3. 这里新版的spring cloud netflix套件默认引入eureka client自动集成了负载均衡的框架，不需要再单独引入ribbon包