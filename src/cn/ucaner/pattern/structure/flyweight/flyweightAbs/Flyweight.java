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
package cn.ucaner.pattern.structure.flyweight.flyweightAbs;

/**
* @Package：cn.ucaner.pattern.structure.flyweight.flyweightAbs   
* @ClassName：Flyweight   
* @Description：   <p> 享元模式  --- 抽象享元对象 - https://www.cnblogs.com/lfxiao/p/6817141.html</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午6:11:06   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public abstract class Flyweight {
	
	/**
	 * 内部状态
	 */
    private String intrinsic;

    /**
     * 外部状态
     */
    protected final String Extrinsic;
    
    /**
    * Flyweight.  要求享元角色必须接受外部状态
    * @param extrinsic
     */
    public Flyweight(String extrinsic) {
        Extrinsic = extrinsic;
    }
    
    /**
     * @Description:定义业务操作
     * @Autor: Jason
     */
    public abstract void operate();
    
    /**
     * @Description: 展示操作
     * @Autor: Jason
     */
    public abstract void show();
    
    /**
     * @Description: 内部状态的get和set
     * @return String
     * @Autor: Jason
     */
    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
