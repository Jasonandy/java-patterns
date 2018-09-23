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
package cn.ucaner.pattern.structure.adapter.charge;

import cn.ucaner.pattern.structure.adapter.charge.inf.ThreeInterface;

/**
* @Package：cn.ucaner.pattern.structure.adapter.charge   
* @ClassName：HongKongCharge
* @Description：   <p> </p>
* @Author： -  Jason 
* @CreatTime：2018年9月23日 - 上午11:00:08  
* @Modify By：   
* @ModifyTime：  2018年9月23日
* @Modify marker：   
* @version    V1.0
 */
public class HongKongCharge implements  ThreeInterface{

	/**
	 * 	大家好这里是标准的3口插头
	 */
	@Override
	public void OfferPowerForThree() {
		System.out.println("I'm Three Charge - HK Standard");
	}

}
