# 苍穹外卖

文件说明
- caseyTakeOut：微信小程序端
- frontend：前端代码，需要运行 nginx
- sky-common：存放工具类、配置属性、字符串常量、异常类等代码
- sky-pojo：存放entity、dto和vo类
- sky-server：存放主体业务代码，包括配置类、拦截器、定时任务、controller、service和mapper

跟黑马官方的苍穹外卖相比，未实现微信支付的相关业务代码（需要注册微信支付的商户号），改为了只要下单直接付款成功
