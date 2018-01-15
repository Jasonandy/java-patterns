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
package cn.ucaner.pattern.structure.adapter;

import cn.ucaner.pattern.structure.adapter.adapterAbs.IUserInfo;

/**
* @Package：cn.ucaner.pattern.structure.adapter   
* @ClassName：AdapterMain   
* @Description：   <p> 适配器模式  --   适配器模式执行类</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午6:03:00   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class AdapterMain {
	
    public static void main(String[] args) {
        //得到一个其他的用户类型
        IUserInfo iUserInfo=new UserAdapter();
        iUserInfo.getHomeAddress();
        //得到一个自己的用户类
        IUserInfo iUserInfoMy=new MeUserInfo();
        iUserInfoMy.getHomeAddress();
    }
}
