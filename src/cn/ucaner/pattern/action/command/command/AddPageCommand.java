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
package cn.ucaner.pattern.action.command.command;

import cn.ucaner.pattern.action.command.absCommand.Command;

/**
* @Package：cn.ucaner.pattern.action.command.command   
* @ClassName：AddPageCommand   
* @Description：   <p> 命令模式  --  新增一个页面</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:36:00   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class AddPageCommand extends Command {
	
    @Override
    public void execute() {
    	//项目经理
    	super.pm.getCommand();
        product.getCommand();//产品经理
        ui.getCommand();//ui
        code.getCommand();//码农
        pm.doAdd();
        product.doAdd();//添加
        pm.plan();
        product.plan();//执行
        ui.doAdd();//添加
        ui.plan();//执行
        code.doAdd();//添加
        code.plan();//执行
        product.acceptance();
        pm.acceptance();
    }
}
