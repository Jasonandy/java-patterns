/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月13日 下午3:03:50</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.action.observer.subject;

import cn.ucaner.pattern.action.observer.observerAbs.ObserverInf;

/**     
* @Package：cn.ucaner.pattern.action.observer.subject   
* @ClassName：Subject   
* @Description：   <p> 主题接口 </p>
* @Author： - Jason   
* @CreatTime：2018年10月13日 下午3:03:50   
* @Modify By：   
* @ModifyTime：  2018年10月13日
* @Modify marker：   
* @version    V1.0
*/
public interface Subject {

	/**
	 * @Description: 用以注册观察者   - 也就是都有谁来关注这个 可以理解为订阅这个消息
	 * @param o 具体的观察者
	 * @Autor: Jason
	 */
    public void registerObserver(ObserverInf o);

    /**
     * @Description: 用以删除观察者  - 也就会谁会来退订这个所观察的对象  - 可以通俗的理解为退订
     * @param o 具体的观察者
     * @Autor: Jason
     */
    public void removeObserver(ObserverInf o);

    /**
     * @Description: 来通知这个观察者 
     * @Autor: Jason
     */
    public void notifyObservers();
}
