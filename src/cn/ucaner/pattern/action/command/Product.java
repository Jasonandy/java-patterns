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
package cn.ucaner.pattern.action.command;

import cn.ucaner.pattern.action.command.absCommand.Group;

/**
* @Package：cn.ucaner.pattern.action.command   
* @ClassName：Product   
* @Description：   <p> 命令模式 --- 产品经理</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:34:14   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class Product extends Group {


    @Override
    public void getCommand() {
        System.out.println("产品经理收到命令");
    }

    @Override
    public void doAdd() {
        System.out.println("产品经理新增了一个需求");
    }

    @Override
    public void doDel() {
        System.out.println("产品经理砍掉了一个需求");
    }

    @Override
    public void plan() {
        System.out.println("产品变更完毕");
    }
}
