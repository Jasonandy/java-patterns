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

import java.util.HashMap;

import cn.ucaner.pattern.structure.adapter.adapterAbs.IOtherInfo;

/**
* @Package：cn.ucaner.pattern.structure.adapter   
* @ClassName：OtherUserInfo   
* @Description：   <p> 适配器模式  --- 其他用户类的实现类</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午6:02:17   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class OtherUserInfo implements IOtherInfo {
	
    @Override
    public HashMap<String, String> getUserInfo() {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("username","员工名称");
        hashMap.put("address","员工住址");
        hashMap.put("number","员工号码");
        hashMap.put("sex","员工性别");
        return hashMap;
    }

    @Override
    public HashMap<String, String> getUserJobInfo() {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("jobaddress","员工公司地址");
        return hashMap;
    }
}
