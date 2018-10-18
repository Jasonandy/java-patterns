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
package cn.ucaner.pattern.structure.decorator;

import cn.ucaner.pattern.structure.decorator.decoratorAbs.SchoolReport;
import cn.ucaner.pattern.structure.decorator.decoratorIml.FouthGradeSchoolReport;
import cn.ucaner.pattern.structure.decorator.decoratorIml.GoodBoyDecortaor;
import cn.ucaner.pattern.structure.decorator.decoratorIml.RankDecortaor;
import cn.ucaner.pattern.structure.decorator.decoratorIml.SuagrFouthGradeSchoolReport;

/**
* @Package：cn.ucaner.pattern.structure.decorator   
* @ClassName：DecoratorMain   
* @Description：   <p> 装饰器模式  -  装饰器模式运行类 
*  {@link https://www.cnblogs.com/octobershiner/archive/2011/11/04/2236730.html}
*  </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:15:16   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class DecoratorMain   {

    public static void main(String[] args) {
        absDecorator();
        extendsDecorator();
        normol();
    }

    /**
     * @Description: 一般情况下   -- 没有包装的情况下
     * @Autor: Jason 
     */
    private static void normol(){
    	
    	System.out.println("****************没有包装成绩的情况下*********************");
        //把成绩单领回家
        SchoolReport schoolReport=new FouthGradeSchoolReport();
        //家长看成绩单
        schoolReport.report();
        schoolReport.sign(" 大家好我是校长");
        //schoolReport.discuss("我建议你别浪费钱!");
        //准备挨打
        System.out.println("********************************************************");
    }

    /**
     * @Description:如果用继承装饰
     * @Autor: Jason
     */
    private static void extendsDecorator(){
    	/**
    	 * 这里是被包装了的成绩单  家长看到的只是比较好的成绩
    	 */
        SchoolReport schoolReport = new SuagrFouthGradeSchoolReport();

        /**
         * 看成绩单
         */
        schoolReport.report();
        
        /**
         * 签字确认
         */
        schoolReport.sign("马化腾");

        /**
        * 继承方式的弊端,如果以后要有五年级 六年级 七年级的成绩单,
         * 那么需要你分别对这几个年级的成绩单进行装饰,
         * 如果需要装饰的条件一旦很多,比如说平时表现啊什么的,就得一一去装饰,带来类的爆炸性增长,
        **/
    }


    /**
     * @Description: 利用抽象装饰
     * @Autor: Jason
     */
    private static void absDecorator(){
        // ******************************** CallMethod Start *****************************************
    	
    	/**
    	 * 原始的成绩  -- 没有经过包装的成绩
    	 */
        SchoolReport schoolReport=new FouthGradeSchoolReport();
        /**
         * 装饰表现
         */
        schoolReport=new GoodBoyDecortaor(schoolReport);
        
        /**
         * 装饰排名
         */
        schoolReport=new RankDecortaor(schoolReport);
        
        /**
         * 装饰了几次后  - 开始报告成绩!
         */
        schoolReport.report();
        
        /**
         * 查阅者签名确认
         */
        schoolReport.sign("马云");
        
        schoolReport.discuss("建议好好读书！"); //这里没有打印出来
        
        // ******************************** CallMethod End *****************************************
    }

}
