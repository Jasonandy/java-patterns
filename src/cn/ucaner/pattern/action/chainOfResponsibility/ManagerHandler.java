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
* @ClassName：ManagerHandler   
* @Description：   <p> 责任链模式
*                    备注  你的上司,牛经理</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午1:41:26   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class ManagerHandler extends Handler {

    @Override
    public int getLevel() {
        return 1;
    }

    @Override
    public String getnName() {
        return "牛经理";
    }
}
