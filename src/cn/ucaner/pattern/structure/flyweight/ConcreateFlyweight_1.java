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
package cn.ucaner.pattern.structure.flyweight;


import java.util.Random;

import cn.ucaner.pattern.structure.flyweight.flyweightAbs.Flyweight;

/**
*    
* @Package：cn.ucaner.pattern.structure.flyweight   
* @ClassName：ConcreateFlyweight_1   
* @Description：   <p> 享元模式 -- 具体享元对象</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午6:10:48   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class ConcreateFlyweight_1 extends Flyweight{

    //接受外部状态
    public ConcreateFlyweight_1(String extrinsic) {
        super(extrinsic);
    }

    //根据外部状态进行逻辑处理
    @Override
    public void operate() {
        System.out.println(Extrinsic+"订单,订单编号"+new Random().nextInt(99999));
    }
}
