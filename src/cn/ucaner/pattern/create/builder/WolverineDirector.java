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
package cn.ucaner.pattern.create.builder;

/**
* @Package：cn.ucaner.pattern.create.builder   
* @ClassName：WolverineDirector   
* @Description：   <p> 控制builder生产金刚狼</p>
* @Author： -    
* @CreatTime：2018年1月16日 下午2:05:17   
* @Modify By：   
* @ModifyTime：  2018年1月16日
* @Modify marker：   
* @version    V1.0
 */
public class WolverineDirector {
	
    public XMan constructWolverine(WolverineBuilder wolverineBuilder) {
        return wolverineBuilder
                .buildXFactor()
                .buildLover()
                .buildName()
                .buildAge()
                .buildXman();
    }
}
