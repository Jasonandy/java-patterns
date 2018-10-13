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
* @Description：   <p> 访问者模式 -  具体元素   abstract </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午4:51:52   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public abstract class Element {
	
	/**
	 * 抽象类 定义元素具体可以做的事
	 */
	
	/**
	 * @Description: INTRODUCE
	 * @Autor: Jason
	 */
	public abstract void introduce();
	
	/**
	 * @Description: 定义访问逻辑
	 * @Autor: Jason
	 */
    public abstract void doVisite();
    
    /**
     * @Description: 定义谁能访问
     * @param iVisitor  访问接口 - impl - Visitor - doVisite
     * @Autor: Jason
     */
    public abstract void accept(IVisitor iVisitor);
}
