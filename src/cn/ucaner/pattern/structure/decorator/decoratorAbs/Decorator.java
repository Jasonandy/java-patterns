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
package cn.ucaner.pattern.structure.decorator.decoratorAbs;

/**
* @Package：cn.ucaner.pattern.structure.decorator.decoratorAbs   
* @ClassName：Decorator   
* @Description：   <p> 装饰器模式  - 
* 抽象装饰器 这种方式看起来和静态代理模式很像 {@link structure.proxy.staticProxy.Proxy }</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:16:35   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public abstract class Decorator extends SchoolReport {
	
    private SchoolReport  schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    public void report(){
        schoolReport.report();
    }

    @Override
    public void sign(String name) {
        schoolReport.sign(name);
    }
}
