# springboot
springboot学习项目
1、当前项目已经注册到注册中心：注册中心项目地址：https://github.com/haibofaith/eureka-sever
如果不启动注册中心，心跳会在log日志中出现很多调用失败。可将注册中心注解注释掉EnableDiscoveryClient
2、当前项目已经添加网关层：网关层项目地址：https://github.com/haibofaith/zuul
3、当前项目已经到配置中心拉取属性：需先启动配置中心：https://github.com/haibofaith/configserver
4、当前项目已经注册到管理中心：管理中心项目地址：https://github.com/haibofaith/adminserver
管理中心访问地址：http://localhost:9090/#/applications