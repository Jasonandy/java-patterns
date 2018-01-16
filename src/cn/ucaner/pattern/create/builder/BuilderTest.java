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
* @ClassName：BuilderTest   
* @Description：   <p> 测试类,生产一个金刚狼</p>
* @Author： - DaoDou   
* @CreatTime：2018年1月16日 下午2:04:55   
* @Modify By：   
* @ModifyTime：  2018年1月16日
* @Modify marker：   
* @version    V1.0
 */
public class BuilderTest {
	
    public static void main(String[] args) {
        WolverineDirector director = new WolverineDirector();
        XMan wolverine = director.constructWolverine(new WolverineBuilder());
        String lover = wolverine.getLover();
        String getxFactor = wolverine.getxFactor();
        System.out.println("Lover:"+lover+"  xFactor:"+getxFactor);
    }
}
