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
package cn.ucaner.pattern.create.factory.factory;

import cn.ucaner.pattern.create.factory.AbsHumanFactory;
import cn.ucaner.pattern.create.factory.Human;

/**
* @Package：cn.ucaner.pattern.create.factory.factory   
* @ClassName：HumanFactory   
* @Description：   <p> 工厂模式   --- 具体工厂</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:46:37   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class HumanFactory extends AbsHumanFactory {
	
    @Override
    public <T extends Human> T createHumen(Class<T> tClass) {
        Human humen=null;
        try {
            humen= (T) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)humen;
    }
}
