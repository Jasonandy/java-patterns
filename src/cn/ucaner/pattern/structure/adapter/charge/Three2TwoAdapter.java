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
* @ClassName：Three2TwoAdapter   
* @Description：   <p> 3口转2口  转接头 </p>
* @Author： - Jason   
* @CreatTime：2018年6月5日 下午8:58:51   
* @Modify By：   
* @ModifyTime：  2018年6月5日
* @Modify marker：   
* @version    V1.0
*/
public class Three2TwoAdapter implements ThreeInterface{

	/**
	 * 2口充电头 - 适配器
	 */
	TwoInterface twoInterface;
	
	/**
	 * 3口 转两口的插座 - 适配
	 * @param twoInterface
	 */
	public Three2TwoAdapter(TwoInterface twoInterface) {
		super();
		this.twoInterface = twoInterface;
	}


	/**
	 * 三口的适配器 适用的是俩孔的插座
	 */
	@Override
	public void OfferPowerForThree() {
		 twoInterface.OfferPowerForTwo();
	}

}
