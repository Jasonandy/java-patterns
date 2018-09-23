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
import cn.ucaner.pattern.structure.adapter.charge.inf.TwoInterface;

/**     
* @Package：cn.ucaner.pattern.structure.adapter.charge   
* @ClassName：ChargeTest   
* @Description：   <p> ChargeTest 适配器测试</p>
* @Author： - Jason   
* @CreatTime：2018年6月5日 下午9:02:23   
* @Modify By：   
* @ModifyTime：  2018年6月5日
* @Modify marker：   
* @version    V1.0
*/
public class ChargeTest {
	
	/**
	 * 
	 * @Description: Just for test 
	 * @param args 
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
	public static void main(String[] args) {
		
		TwoInterface twoInterface = new ChinaCharge();//2口
		
		ThreeInterface threeInterface = new Three2TwoAdapter(twoInterface);
		
		ThreeInterface threeInterface2 = new HongKongCharge();
		
		Three3TwoAdapter three3TwoAdapter = new Three3TwoAdapter(threeInterface2);
		
		three3TwoAdapter.OfferPowerForTwo();
		
		threeInterface.OfferPowerForThree();
	}

}
