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

import cn.ucaner.pattern.create.prototype.prototypeAbs.BaseMessage;

/**
* @Package：cn.ucaner.pattern.create.prototype   
* @ClassName：ShallowCopy   
* @Description：   <p> 设计模式  原型模式     --- 浅拷贝的对象</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:42:16   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class ShallowCopy  extends BaseMessage implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ShallowCopy shallowCopy=null;
        try {
            shallowCopy= (ShallowCopy) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return shallowCopy;
    }

}
