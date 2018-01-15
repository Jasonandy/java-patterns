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

import cn.ucaner.pattern.action.visitor.visitorAbs.IVisitor;

/**
* @Package：cn.ucaner.pattern.action.visitor.visitorIml   
* @ClassName：Visitor   
* @Description：   <p> 访问者模式  具体的访问者</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午4:49:26   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(ConcreateElementUser user) {
        user.doVisite();
    }

    @Override
    public void visit(ConcreateElementAdmin admin) {
        admin.doVisite();
    }
}
