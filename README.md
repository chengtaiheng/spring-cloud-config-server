# spring-cloud-config-server
spring-cloud-config 服务单节点配置
操作指南
第一步：启动服务配置和服务消费者
第二步：访问“ip:服务消费者port/consumer”，会得到相对应模式的属性值。
原来是想把属性封装到一个bean中，放到spring上下文中，但是刷新重新启动的时候，属性值刷新不了。
第三步：修改_x文件下相对应的情景模式下的属性值。
第四步：访问“ip：消费者port/actuator/refresh”,局部重新启动消费者。
第五步：再次访问“ip：消费者port/consumer”,会看到属性值已经刷新。
