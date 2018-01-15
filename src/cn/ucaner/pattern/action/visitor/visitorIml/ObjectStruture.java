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

/**
* @Package：cn.ucaner.pattern.action.visitor.visitorIml   
* @ClassName：ObjectStruture   
* @Description：   <p> 访问者模式   结构对象,获取一个Element,现实中的数据源 </p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午4:49:51   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class ObjectStruture {
	
   /**
    * 返回一个具体的Element
    * @return
    */
    public static Element createElement(){
        Random random=new Random();
        if(random.nextInt(100)>50){
        	//普通用户
            return new ConcreateElementUser();
        }else {
        	//管理员用户
            return new ConcreateElementAdmin();
        }
    }
}
