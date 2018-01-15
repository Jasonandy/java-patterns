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

import java.util.Random;

import cn.ucaner.pattern.action.visitor.visitorAbs.Element;
import cn.ucaner.pattern.action.visitor.visitorAbs.IVisitor;

/**
* @Package：cn.ucaner.pattern.action.visitor.visitorIml   
* @ClassName：ConcreateElementUser   
* @Description：   <p> 访问者模式 备注   具体元素--用户 </p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午4:50:33   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class ConcreateElementUser extends Element {

	@Override
	public void doVisite() {
		Random random = new Random();
		System.out.println("我是用户,在线时长 " + random.nextInt(100)+ " 分钟 ***********");
	}

	@Override
	public void accept(IVisitor iVisitor) {
		iVisitor.visit(this);
	}
}
