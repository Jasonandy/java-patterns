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
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:36:00   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class AddPageCommand extends Command {
	
    @Override
    public void execute() {
        product.getCommand();
        ui.getCommand();
        code.getCommand();
        product.doAdd();
        product.plan();
        ui.doAdd();
        ui.plan();
        code.doAdd();
        code.plan();
    }
}
