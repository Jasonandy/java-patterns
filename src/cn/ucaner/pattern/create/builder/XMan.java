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
* @ClassName：XMan   
* @Description：   <p> x战警通用属性</p>
* @Author： - DaoDou   
* @CreatTime：2018年1月16日 下午2:05:50   
* @Modify By：   
* @ModifyTime：  2018年1月16日
* @Modify marker：   
* @version    V1.0
 */
public class XMan {
	
    private String xFactor;
    
    private String lover;

    public String getxFactor() {
        return xFactor;
    }

    public XMan setxFactor(String xFactor) {
        this.xFactor = xFactor;
        return this;
    }

    public String getLover() {
        return lover;
    }

    public XMan setLover(String lover) {
        this.lover = lover;
        return this;
    }
}
