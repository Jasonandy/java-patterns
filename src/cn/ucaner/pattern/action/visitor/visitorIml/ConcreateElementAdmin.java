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
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午4:51:01   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class ConcreateElementAdmin extends Element {
	
	
    @Override
    public void doVisite() {
        System.out.println("我是管理员 活动了20分种,系统操作:删除了好多文件  ***********");
    }

    /**
    * 描述: 
    * @param iVisitor
     */
    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
