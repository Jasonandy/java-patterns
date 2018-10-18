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
* @Package：cn.ucaner.pattern.structure.flyweight   
* @ClassName：ConcreateFlyweight   
* @Description：   <p> 享元模式 -- 具体享元对象 </p>
* @Author： - Jason   
* @CreatTime：2017年10月26日 下午6:10:48 
* @Modify By：   
* @ModifyTime：  2018年10月18日
* @Modify marker：   
* @version    V1.0
 */
public class ConcreateFlyweight extends Flyweight{

	/**
	* ConcreateFlyweight.  传入外部状态
	* @param extrinsic     外部状态
	 */
    public ConcreateFlyweight(String extrinsic) {
        super(extrinsic);
    }

    /**
     * 根据外部状态进行逻辑处理
     */
    @Override
    public void operate() {
        System.out.println(Extrinsic + "订单,订单编号"+new Random().nextInt(99999));
    }

	@Override
	public void show() {
		System.out.println("内部状态"+getIntrinsic());
	}
}
