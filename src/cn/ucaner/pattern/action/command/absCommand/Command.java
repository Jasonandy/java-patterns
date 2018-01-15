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
package cn.ucaner.pattern.action.command.absCommand;

import cn.ucaner.pattern.action.command.Code;
import cn.ucaner.pattern.action.command.Product;
import cn.ucaner.pattern.action.command.UI;

/**
* @Package：cn.ucaner.pattern.action.command.absCommand   
* @ClassName：Command   
* @Description：   <p> 命令模式  ---  处理命令</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:36:46   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public abstract class Command {
    protected Product product=new Product();
    protected UI ui=new UI();
    protected Code code =new Code();
    //执行
    public abstract void execute();
}
