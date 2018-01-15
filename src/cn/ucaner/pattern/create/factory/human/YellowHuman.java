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
package cn.ucaner.pattern.create.factory.human;

import cn.ucaner.pattern.create.factory.Human;

/**
* @Package：cn.ucaner.pattern.create.factory.human   
* @ClassName：YellowHuman   
* @Description：   <p> 工厂模式  --- 黄色人种</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:49:38   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class YellowHuman implements Human {
	
    @Override
    public void getColor() {
        System.out.println("黄色人种");
    }
}
