/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月13日 下午3:07:39</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.action.observer.display;

/**     
* @Package：cn.ucaner.pattern.action.observer.observerAbs   
* @ClassName：DisplayElement   
* @Description：   <p> 用以强行要求写显示方法 </p>
* @Author： - Jason   
* @CreatTime：2018年10月13日 下午3:07:39   
* @Modify By：   
* @ModifyTime：  2018年10月13日
* @Modify marker：   
* @version    V1.0
*/
public interface  DisplayElement {

	/**
	 * @Description: 外观显示方法  - 展示 被观察者 的具体的信息的方法.
	 * @Autor: Jason
	 */
    public void display();
    
    /**
     * @Description:开始同步数据.
     * @Autor: Jason
     */
    public void sysnc();
}
