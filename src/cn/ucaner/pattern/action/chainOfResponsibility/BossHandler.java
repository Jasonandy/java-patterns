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
* @ClassName：BossHandler   
* @Description：   <p> 责任链模式 </p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午1:40:14   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class BossHandler extends Handler {

    @Override
    public int getLevel() {
        return 3;
    }

    @Override
    public String getnName() {
        return "方老板";
    }
}
