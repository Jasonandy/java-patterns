/**
 * <html>
 * <body>
 *  <P> Copyright 1994-2018 JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on ${date} </p>
 *  <p> Created by Jason - jasonandy@hotmail.com </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.structure.adapter.charge;

import cn.ucaner.pattern.structure.adapter.charge.inf.ThreeInterface;
import cn.ucaner.pattern.structure.adapter.charge.inf.TwoInterface;

public class Three3TwoAdapter implements TwoInterface{

	ThreeInterface threeInterface;
	
	/**
	 * 2口 转3口的插座 - 适配
	 * @param twoInterface
	 */
	public Three3TwoAdapter(ThreeInterface threeInterface) {
		super();
		this.threeInterface = threeInterface;
	}

	
	@Override
	public void OfferPowerForTwo() {
		threeInterface.OfferPowerForThree();
	}

}
