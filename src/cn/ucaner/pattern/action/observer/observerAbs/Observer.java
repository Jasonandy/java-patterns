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
* @ClassName：Observer   
* @Description：   <p> 观察者模式  -- you 
* 
* 观察者Observer
* 
* For  Study Listener
* </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:29:32   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public interface Observer {
	
	/**
	 * @Description: Update
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
    public  void  Update();
    
    
    /**
     * @Description: Say
     * @Autor: Jason - jasonandy@hotmail.com
     */
    public  void  Say();
    
}
