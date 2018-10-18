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
package cn.ucaner.pattern.structure.flyweight;

import java.util.HashMap;

import cn.ucaner.pattern.structure.flyweight.flyweightAbs.Flyweight;

/**
* @Package：cn.ucaner.pattern.structure.flyweight   
* @ClassName：FlyweightFactory   
* @Description：   <p> 享元模式  --- 享元工厂</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午6:10:24   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class FlyweightFactory {
	
	/**
	 * 定义一个池容器 - 享元池
	 */
    private static HashMap<String,Flyweight> pool=new HashMap<>();

    /**
     * @Description: 获取 Flyweight 对象
     * @param Extrinsic  外部状态
     * @return Flyweight
     * @Autor: Jason
     */
    public static Flyweight getFlyweight(String Extrinsic){
    	/**
    	 * 需要返回的对象
    	 */
        Flyweight flyweight = null;
        if(pool.containsKey(Extrinsic)){
            flyweight=pool.get(Extrinsic); //外部状态
        }else {
            flyweight=new ConcreateFlyweight(Extrinsic); //如果不存在的话创建  放入池子中
            pool.put(Extrinsic,flyweight);
        }
        return flyweight;
    }

    /**
     * @Description: 获取池的大小
     * @return int   池子大小
     * @Autor: Jason
     */
    public static  int getPoolSize(){
        return pool.size();
    }
}
