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
* @ClassName：XManBuilder   
* @Description：   <p> XManBuilder</p>
* @Author： - DaoDou   
* @CreatTime：2018年1月16日 下午2:06:06   
* @Modify By：   
* @ModifyTime：  2018年1月16日
* @Modify marker：   
* @version    V1.0
 */
public interface XManBuilder {
	
    XManBuilder buildXFactor();
    
    XManBuilder buildLover();
    
    XMan buildXman();
}
