# main

这是个人sentinel学习项目 sentinel官方文档地址:https://sentinelguard.io/zh-cn/index.html

# 安装Sentinel控制台

https://github.com/alibaba/Sentinel/releases
本次下载的为1.8.4，放置于manager目录下

启动控制台命令： java  -Dproject.name=sentinel-dashboard   -Dserver.port=8089  -Dcsp.sentinel.dashboard.
server=localhost:8089 -jar .
/manager/sentinel-dashboard-1.8.4.jar 

启动后控制台地址:
http://localhost:8089

java -jar sentinel-dashboard.jar

# spring boot Web Servlet 环境下使用 集成 Sentinel

https://github.com/alibaba/spring-cloud-alibaba/wiki/Sentinel#%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8-sentinel

启动项目后访问接口:
http://local.dasouche.net:8080/hello/demoDemo


