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
* @ClassName：FinanceHandler   
* @Description：   <p>  *模式：责任链模式
*                     备注  公司财务,李财务*</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午1:41:00   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class FinanceHandler extends Handler {

    @Override
    public int getLevel() {
        return 2;
    }

    @Override
    public String getnName() {
        return "李财务";
    }
}
