基于Dubbo+Fescar+Nacos分布式事务解决案例

基于dubbo的rpc框架，服务注册发现采用nacos

主要用到的依赖
* SpringBoot
* Durid
* Mybatis
* Dubbo
* Fescar
* Nacos

模块说明
* dubbo-nacos-api 公共依赖包
* dubbo-nacos-provider1 提供者1
* dubbo-nacos-provider2 提供者2
* dubbo-nacos-consumer 消费者

使用步骤
* 将sql目录中的sql脚本导入到mysql数据库中
* 启动Nacos和Fescar
* 启动生产者、消费者
* 开始调用