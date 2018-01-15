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
package cn.ucaner.pattern.create.prototype;

import java.util.ArrayList;
import cn.ucaner.pattern.create.prototype.prototypeAbs.BaseMessage;

/**
* @Package：cn.ucaner.pattern.create.prototype   
* @ClassName：DeepCopy   
* @Description：   <p> 原型模式  ---  原型模式深拷贝</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:43:23   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class DeepCopy extends BaseMessage implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCopy deepCopy=null;
        try {
            deepCopy= (DeepCopy) super.clone();
            this.setImgList((ArrayList<String>) this.getImgList().clone());
        }catch (Exception e){
            e.printStackTrace();
        }
        return deepCopy;
    }
}
