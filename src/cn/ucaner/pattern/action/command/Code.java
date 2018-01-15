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
* @ClassName：Code   
* @Description：   <p> 命令模式  - coder  码农</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:35:37   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class Code extends Group {


    @Override
    public void getCommand() {
        System.out.println("开发收到命令");
    }

    @Override
    public void doAdd() {
        System.out.println("开发新写了一个页面");
    }

    @Override
    public void doDel() {
        System.out.println("开发注释了一个页面");
    }

    @Override
    public void plan() {
        System.out.println("开发变更完毕");
    }
}
