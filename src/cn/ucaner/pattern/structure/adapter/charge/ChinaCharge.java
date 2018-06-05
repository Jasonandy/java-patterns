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

import cn.ucaner.pattern.structure.adapter.charge.inf.TwoInterface;

/**     
* @Package：cn.ucaner.pattern.structure.adapter.charge   
* @ClassName：RealTwo   
* @Description：   <p>  China 中国的插头  标准两口 220v </p>
* @Author： - Jason   
* @CreatTime：2018年6月5日 下午8:54:41   
* @Modify By：   
* @ModifyTime：  2018年6月5日
* @Modify marker：   
* @version    V1.0
*/
public class ChinaCharge implements TwoInterface{

	@Override
	public void OfferPowerForTwo() {
		System.out.println("I'm China Charge. 220V.");
	}
	
	

}
