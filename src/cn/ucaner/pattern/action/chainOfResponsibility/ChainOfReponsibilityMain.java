/**
 * <html>
 * <body>
 *  <P> Copyright 1994 JsonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 19941115</p>
 *  <p> Created by Jason</p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.action.chainOfResponsibility;

import cn.ucaner.pattern.action.chainOfResponsibility.abs.Handler;

/**
* @Package：cn.ucaner.pattern.action.chainOfResponsibility   
* @ClassName：ChainOfReponsibilityMain   
* @Description：   <p> 责任链模式</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午1:40:32   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class ChainOfReponsibilityMain {

    public static void main(String[] args) {
        //我要报销的钱数;
        int money=5;
        //初始化各个处理者
        Handler manager = new ManagerHandler();
        Handler finance = new FinanceHandler();
        Handler boss = new BossHandler();
        //设置链中的顺序
        manager.setNextHandler(finance);
        finance.setNextHandler(boss);
        //开始请求
        System.out.println("我要报销"+money+"元");
        if (manager.handlerRequst(money)) {
            System.out.println("报销成功");
        } else {
            System.out.println("报销失败");
        }
    }

}
