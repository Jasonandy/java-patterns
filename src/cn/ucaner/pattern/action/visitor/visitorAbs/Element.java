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
package cn.ucaner.pattern.action.visitor.visitorAbs;

/**
* @Package：cn.ucaner.pattern.action.visitor.visitorAbs   
* @ClassName：Element   
* @Description：   <p> 访问者模式 -  具体元素 </p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午4:51:52   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public abstract class Element {
	
	//具体的元素可以做的事
	
    //定义访问逻辑
    public abstract void doVisite();
    //定义谁能访问
    public abstract void accept(IVisitor iVisitor);
}
