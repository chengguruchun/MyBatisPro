# MyBatisPro

mybatis入门简单实例

## 项目环境的搭建
- 操作系统: Windows 8.1

- IDE:myeclipse

- JDK: JDK1.7

- 数据库:Mysql-5.5.60

- 框架: mybatis

## 入到的问题汇总
- 对实体 "characterEncoding" 的引用必须以 ';' 分隔符结尾。
问题描述： 
mybatis连接mysql数据库时，url中指定了编码格式以及ssl方式：

<property name="url" value="jdbc:mysql://localhost:3306/mybatis?useSSL=true&characterEncoding=utf8" />

解决方案： 
在xml的配置文件中 “；”要用 “ &amp;” 代替。

参考：https://blog.csdn.net/cuiyaoqiang/article/details/51853052

- mybatis连接mysql数据库插入中文乱码
https://blog.csdn.net/zht666/article/details/8955952

-  Mybatis中自动生成主键
https://blog.csdn.net/suwu150/article/details/52895855/