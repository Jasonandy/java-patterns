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
package cn.ucaner.pattern.action.visitor.visitorIml;

import cn.ucaner.pattern.action.visitor.visitorAbs.Element;
import cn.ucaner.pattern.action.visitor.visitorAbs.IVisitor;

/**
* @Package：cn.ucaner.pattern.action.visitor.visitorIml   
* @ClassName：ConcreateElementAdmin   
* @Description：   <p> 访问者模式    具体元素--管理员 </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午4:51:01   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class ConcreateElementAdmin extends Element {
	
	
	/**
	 * 定义好的访问逻辑 - 管理员可以干啥.
	 */
    @Override
    public void doVisite() {
        System.out.println("我是管理员 活动了20分种,系统操作:删除了好多文件  ***********");
    }

    /**
    * 描述: ConcreateElementAdmin - 管理员 .
    * @param iVisitor   -- 接口impl 做的具体的动作.
     */
    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }

	@Override
	public void introduce() {
		System.out.println("I'M ADMIN.");
	}
}
