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
package cn.ucaner.pattern.action.observer.observerAbs;

/**
* @Package：cn.ucaner.pattern.action.observer.observerAbs   
* @ClassName：Subject   
* @Description：   <p> 观察者模式  -- 抽像女神(被观察者)
* 
* 被观察的对象  
* 
* </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:30:06   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public interface Subject {
	
	/**
	 * @Description: 添加一个观察者
	 * @param observer void
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
    public void Attach(Observer observer);
    
    /**
	 * @Description: 删除一个观察者
	 * @param observer void
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
    public void Detach(Observer observer);
    
    /**
	 * @Description: 通知所有的观察者
	 * @param observer void
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
    public void Notify();
    
}
