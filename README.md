### SpringCloud技术栈
#### 端口配置
1. eureka-server：9090
2. zuul-gateway：9091
3. home-customer：9092
4. home-feign：9093

# 服务分发
1. feign访问：http://localhost:9093/home-customer/get/customer?id=1
2. 网关访问：http://localhost:9091/teacherblitz/home-customer/get/customer?id=1