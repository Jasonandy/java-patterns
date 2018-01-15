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

import cn.ucaner.pattern.structure.flyweight.flyweightAbs.Flyweight;

/**
* @Package：cn.ucaner.pattern.structure.flyweight   
* @ClassName：FlyweightMain   
* @Description：   <p> 享元模式  --- 享元模式执行类</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午6:09:45   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class FlyweightMain {


    public static void main(String[] args) {
        Flyweight fly1;
        Flyweight fly2;
        Flyweight fly3;
        Flyweight fly4;
        Flyweight fly5;
        Flyweight fly6;

        //根据类型创建订单对象
        fly1 = FlyweightFactory.getFlyweight("图书");
        fly2 = FlyweightFactory.getFlyweight("图书");
        fly3 = FlyweightFactory.getFlyweight("图书");
        fly4 = FlyweightFactory.getFlyweight("图书");
        fly5 = FlyweightFactory.getFlyweight("你懂得");
        fly6 = FlyweightFactory.getFlyweight("女神娃娃");

        //调用
        fly1.operate();
        fly2.operate();
        fly3.operate();
        fly4.operate();
        fly5.operate();
        fly6.operate();

        //查看池中对象的数量
        System.out.print("pool 中对象的大小 = "+FlyweightFactory.getPoolSize());

    }


}
