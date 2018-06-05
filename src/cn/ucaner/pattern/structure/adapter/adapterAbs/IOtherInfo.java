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
package cn.ucaner.pattern.structure.adapter.adapterAbs;


import java.util.HashMap;

/**
* @Package：cn.ucaner.pattern.structure.adapter.adapterAbs   
* @ClassName：IOtherInfo   
* @Description：   <p> 适配器模式   - - 需要对接的用户接口类</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午6:03:38   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public interface IOtherInfo {
	
	/**
	 * @Description: 获取用户的User信息
	 * @return HashMap<String,String>
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
    HashMap<String,String> getUserInfo();
    
    /**
     * @Description: 获取的是用户的job信息
     * @return HashMap<String,String>
     * @Autor: Jason - jasonandy@hotmail.com
     */
    HashMap<String,String> getUserJobInfo();
}
