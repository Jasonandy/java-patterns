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
package cn.ucaner.pattern.structure.decorator.decoratorIml;

/**
* @Package：cn.ucaner.pattern.structure.decorator.decoratorIml   
* @ClassName：SuagrFouthGradeSchoolReport   
* @Description：   <p> 装饰器模式 </p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:21:41   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class SuagrFouthGradeSchoolReport extends FouthGradeSchoolReport {

    /**
     * 先把最高成绩说出去
     */
    private void reportHighSorce(){
        System.out.print("我英语得了90分,语文得了80分");
    }

    @Override
    public void report() {
        reportHighSorce();
        super.report();
    }
}

