/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月18日 下午2:28:01</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.structure.flyweight;

import cn.ucaner.pattern.structure.flyweight.flyweightAbs.Shape;

/**     
* @Package：cn.ucaner.pattern.structure.flyweight   
* @ClassName：DrawMain   
* @Description：   <p> DrawMain </p>
* @Author： - Jason   
* @CreatTime：2018年10月18日 下午2:28:01   
* @Modify By：   
* @ModifyTime：  2018年10月18日
* @Modify marker：   
* @version    V1.0
*/
public class DrawMain {
	
	public static void main(String[] args) {
		
		Shape shape1 = DrawFactory.getShape("RED");
        Shape shape2 = DrawFactory.getShape("GREY");
        Shape shape3 = DrawFactory.getShape("GREEN");
        Shape shape4 = DrawFactory.getShape("RED");
        Shape shape5 = DrawFactory.getShape("GREY");
        Shape shape6 = DrawFactory.getShape("GREY");
        
        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();
        shape5.draw();
        shape6.draw();
        
        System.out.println("一共绘制了" + DrawFactory.getPoolSize() + "种颜色的圆形.");
	}

}
