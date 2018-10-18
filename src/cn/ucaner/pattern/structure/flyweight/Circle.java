/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月18日 下午2:23:26</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.structure.flyweight;

import cn.ucaner.pattern.structure.flyweight.flyweightAbs.Shape;

/**     
* @Package：cn.ucaner.pattern.structure.flyweight   
* @ClassName：Circle   
* @Description：   <p> Circle </p>
* @Author： - Jason   
* @CreatTime：2018年10月18日 下午2:23:26   
* @Modify By：   
* @ModifyTime：  2018年10月18日
* @Modify marker：   
* @version    V1.0
*/
public class Circle extends Shape{
	
	private String color;
	
    public Circle(String color){
        this.color = color;
    }

	@Override
	public void draw() {
		System.out.println("Draw a Circle Which Color is " + color +".");
	}

}
