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
package cn.ucaner.pattern.structure.adapter.charge.inf;

/**     
* @Package：cn.ucaner.pattern.structure.adapter.charge.inf   
* @ClassName：ThreeInterface   
* @Description：   <p> 三口插头 </p>
* <pre>创建一个能够根据所传递对象的不同而具有不同行为的方法被称为[策略设计模式]</pre>
* @Author： - Jason   
* @CreatTime：2018年6月5日 下午8:51:29   
* @Modify By：   
* @ModifyTime：  2018年6月5日
* @Modify marker：   
* @version    V1.0
*/
public interface ThreeInterface {
	
	/**
	 * @Description: 三个口的插头有 一 个 功能，能够为三个触角的插头提供电源
	 * @Autor: jasonandy@hotmail.com
	 */
	public void OfferPowerForThree();
	
	
	

}
