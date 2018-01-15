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
* @Description：   <p> 观察者模式  -- 抽像女神(被观察者)</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:30:06   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public interface Subject {
	
    //添加一个观察者
    public void Attach(Observer observer);
    
    //删除一个观察者
    public void Detach(Observer observer);
    
    //通知所有的观察者
    public void Notify();
}
