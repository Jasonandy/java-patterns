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

import cn.ucaner.pattern.structure.decorator.decoratorAbs.Decorator;
import cn.ucaner.pattern.structure.decorator.decoratorAbs.SchoolReport;

/**
* @Package：cn.ucaner.pattern.structure.decorator.decoratorIml   
* @ClassName：GoodBoyDecortaor   
* @Description：   <p> 装饰器模式  - - 装饰在学校的表现</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:20:40   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class GoodBoyDecortaor extends Decorator {
    public GoodBoyDecortaor(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void goodBoyDecorator(){
        System.out.println("我在学校表现很好,没毛病");
    }

    @Override
    public void report() {
        goodBoyDecorator();
        super.report();

    }

	@Override
	public void discuss(String discuss) {
		
	}
}
