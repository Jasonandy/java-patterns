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
* @ClassName：UI   
* @Description：   <p> 命令模式    --- UI妹子</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:33:50   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class UI extends Group {


    @Override
    public void getCommand() {
        System.out.println("UI收到命令");
    }

    @Override
    public void doAdd() {
        System.out.println("UI新增了一个页面");
    }

    @Override
    public void doDel() {
        System.out.println("UI去掉了一个页面");
    }

    @Override
    public void plan() {
        System.out.println("UI变更完毕");
    }
}
