/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月18日 下午2:24:40</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.structure.flyweight;

import java.util.HashMap;

import cn.ucaner.pattern.structure.flyweight.flyweightAbs.Shape;

/**     
* @Package：cn.ucaner.pattern.structure.flyweight   
* @ClassName：DrawFactory   
* @Description：   <p> DrawFactory </p>
* @Author： - Jason   
* @CreatTime：2018年10月18日 下午2:24:40   
* @Modify By：   
* @ModifyTime：  2018年10月18日
* @Modify marker：   
* @version    V1.0
*/
public class DrawFactory {

	/**
	 * 定义一个池容器 - 享元池
	 */
    private static HashMap<String,Shape> colorsPool = new HashMap<String,Shape>();

    /**
     * @Description: 获取对象
     * @param color
     * @return Shape
     * @Autor: Jason
     */
    public static Shape getShape(String color){
    	
    	/**
    	 * 需要返回的对象
    	 */
    	Shape  shape  = null;
        
        if(colorsPool.containsKey(color)){
        	shape = colorsPool.get(color); //外部状态
        }else {
        	shape = new Circle(color); //如果不存在的话创建  放入池子中
        	colorsPool.put(color,shape);
        }
        return shape;
    }

    /**
     * @Description: 获取池的大小
     * @return int   池子大小
     * @Autor: Jason
     */
    public static  int getPoolSize(){
        return colorsPool.size();
    }
    
}
