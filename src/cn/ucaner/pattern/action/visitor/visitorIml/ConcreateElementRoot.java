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
* @ClassName：ConcreateElementRoot   
* @Description：   <p> Root 管理员</p>
* @Author： -    
* @CreatTime：2018年1月16日 上午11:47:40   
* @Modify By：   
* @ModifyTime：  2018年1月16日
* @Modify marker：   
* @version    V1.0
*/
public class ConcreateElementRoot extends Element{

	@Override
	public void doVisite() {
		Random random = new Random();
		System.out.println("大家好，我是Root管理员，我倒数"+ random.nextInt(10)+"秒，不要给我搞什么大新闻！");
	}

	@Override
	public void accept(IVisitor iVisitor) {
		iVisitor.visit(this);
	}

}
