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

import cn.ucaner.pattern.structure.decorator.decoratorAbs.SchoolReport;

/**
* @Package：cn.ucaner.pattern.structure.decorator.decoratorIml   
* @ClassName：FouthGradeSchoolReport   
* @Description：   <p> 装饰器模式  - - 四年级成绩单</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:17:57   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class FouthGradeSchoolReport extends SchoolReport {


    @Override
    public void report() {
        System.out.print("数学60,语文:80,英语:90");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名 : "+name);
    }

	@Override
	public void discuss(String discuss) {
		 System.out.println("建议 : "+discuss);
	}

}
