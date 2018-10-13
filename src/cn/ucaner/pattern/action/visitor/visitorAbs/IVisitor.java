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

import cn.ucaner.pattern.action.visitor.visitorIml.ConcreateElementAdmin;
import cn.ucaner.pattern.action.visitor.visitorIml.ConcreateElementRoot;
import cn.ucaner.pattern.action.visitor.visitorIml.ConcreateElementUser;

/**
* @Package：cn.ucaner.pattern.action.visitor.visitorAbs   
* @ClassName：IVisitor   
* @Description：   <p> 访问者模式 - 抽象访问者 </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午4:51:32   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public interface IVisitor {
	
	/**
	 * @Description:可以访问哪些对象 
	 * @param user 普通用户
	 * @Autor: Jason
	 */
    public void visit(ConcreateElementUser user);
    
    /**
     * @Description: 管理员可以做的事情
     * @param admin 管理员
     * @Autor: Jason
     */
    public void visit(ConcreateElementAdmin admin);
    
    /**
     * @Description: 超级管理员拥有的权限
     * @param root Root管理员 超级管理员
     * @Autor: Jason
     */
    public void visit(ConcreateElementRoot root);
}
