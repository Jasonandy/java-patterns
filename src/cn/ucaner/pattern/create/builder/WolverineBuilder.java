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
* @ClassName：WolverineBuilder   
* @Description：   <p> 金刚狼的builder</p>
* @Author： -    
* @CreatTime：2018年1月16日 下午2:05:35   
* @Modify By：   
* @ModifyTime：  2018年1月16日
* @Modify marker：   
* @version    V1.0
 */
public class WolverineBuilder implements XManBuilder {
	
    XMan mXMan;
    
    WolverineBuilder() {
        mXMan = new XMan();
    }
    
    // need to consider 

   /* @Override
    public WolverineBuilder buildXFactor() {
        mXMan.setxFactor("claw");
        System.out.println(mXMan.getxFactor());
        return this;
    }*/
    
    @Override
	public XManBuilder buildXFactor() {
    	 mXMan.setxFactor("claw");
         System.out.println(mXMan.getxFactor());
         return this;
	}

    @Override
    public WolverineBuilder buildLover() {
        mXMan.setLover("Jane");
        System.out.println(mXMan.getLover());
        return this;
    }

    @Override
	public WolverineBuilder buildName() {
		mXMan.setName("Wali");
		System.out.println(mXMan.getName());
		return this;
	}
	
	@Override
	public WolverineBuilder buildAge() {
		mXMan.setAge(18);
		System.out.println(mXMan.getAge());
		return this;
	}
	
	@Override
	public XMan buildXman() {
        System.out.println("Wolverine is successfully built");
        return mXMan;
    }

}
