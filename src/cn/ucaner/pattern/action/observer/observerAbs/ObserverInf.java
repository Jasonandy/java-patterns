/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月13日 下午3:01:22</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.action.observer.observerAbs;

/**     
* @Package：cn.ucaner.pattern.action.observer.observerAbs   
* @ClassName：ObserverInf   
* @Description：   <p> ObserverInf 观察者接口 </p>
* @Author： - Jason   
* @CreatTime：2018年10月13日 下午3:01:22   
* @Modify By：   
* @ModifyTime：  2018年10月13日
* @Modify marker：   
* @version    V1.0
*/
public interface  ObserverInf {
	
	/**
	 * @Description: 更新数据 - 数据发生改变的时候通知到其他地方.
	 * @param temp  温度
	 * @param humidity 湿度
	 * @param pressure 气压
	 * @Autor: Jason
	 */
	public void update(float temperature, float humidity, float pressure);

}
