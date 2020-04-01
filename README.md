某大型KTV公司拥有2个停车场，编号为A、B，每个停车场分别可以拥有的停车位为：A: 8, B:10。    
客人来公司后，会将车辆交给公司停车小弟，停车小弟根据如下规则进行停车：   
1. 这2个停车场有一个停车小弟进行停车取车，停车小弟会按照顺序进行停车。   
2. 如果没有车位，则不能停车。   
3. 停车完毕之后，可以拿到一张有效的停车券，由停车小弟将该券交给客户保存。  
停车小弟会按照下列规则进行取车：       
1. 取车的时候，如果停车券为停车时取到的停车券，则能够取到对应的车，如果停车券无效或已经用过了，则不能取到车。

要求：
1. 停车场中停车位的信息用数据库存储。
2. 通过一个命令行进行相应的操作。当程序启动时，我们会看到一个命令行界面：
     ```
      1. 初始化停车场数据
      2. 停车
      3. 取车
      4. 退出
      请输入你的选择(1~4)：
      ```
      如果我们输入1，那么界面就会变成：
      ```
      请输入停车场初始化数据
      格式为"停车场编号1:车位数,停车场编号2:车位数" 如 "A:8,B:9"：
      ```
      如果我们输入2，那么界面就会变成：
      ```
      请输入车牌号
      格式为"车牌号" 如: "8"：
      ```
      命令行会输出返回的停车券信息，
      ```
      停车场编号,车位编号,车牌号" 如 "A,1,1"
      ```
      如果停车场已满，则程序中断，输出信息为
      ```
      抱歉，停车场已没有空位，暂时无法停车。
      ```
      如果我们输入3，那么界面就会变成：
      ```
      请输入停车券信息
      格式为"停车场编号,车位编号,车牌号" 如 "A,1,1"
      ```
      如果输入停车券为停车时拿到的停车券，则命令行输出取到的车的信息
      ```
      格式为"车牌号" 如: "8"
      ```
      如果输入停车券不属于给定的停车场或已经被用过，则程序中断，输出对应的信息
      
      如果我们输入4，那么界面就会变成：
      ```
      已退出
      ```

扩展部分：   
1. 随着公司业务规模的扩大，客户数量的增多，一个停车小弟已经无法满足停车需求，现在公司决定再聘请一个停车小弟，管理规则如下：   
    * 这次聘请的停车小弟非常聪明，他们能够在停车的时候会把车停到空车位最多的停车场，取车规则和之前的停车小弟一样  
2. 公司决定聘请停车经理来管理两个停车小弟，对接停车客户后，让停车小弟去停车取车  
3. 由于停车的人太多，对车辆进行收费规则调整如下：  
    1）2小时内免单   
    2）超过2小时，小于5小时的时间，每小时5元，不足一小时按一小时计算   
    3）超过5小时的时间，每小时10元
4. 上述功能同样可以用命令行控制