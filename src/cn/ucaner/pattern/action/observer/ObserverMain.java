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
package cn.ucaner.pattern.action.observer;

import cn.ucaner.pattern.action.observer.observerAbs.Subject;
import cn.ucaner.pattern.action.observer.observerIml.DiaoSi;
import cn.ucaner.pattern.action.observer.observerIml.NvShen;

/**
* @Package：cn.ucaner.pattern.action.observer   
* @ClassName：ObserverMain   
* @Description：   <p> 观察者模式   - 观察者模式运行类 </p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:26:58   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class ObserverMain {

    public static void main(String[] args) {
        //实例化一个女神。(现实中也能这么New就好了  for(;;) new Nvshen();  哈哈)
        NvShen nvShen=new NvShen();
        //添加尾随大军
        getObservers(nvShen);
        //女神要出去逛街了!!!
        nvShen.goShopping();

    }

    //添加10个观察者(真变态)
    public static void getObservers(Subject nvShen){
        for (int i = 0; i < 100 ; i++) {
            DiaoSi diaosi=new DiaoSi("屌丝"+i);
            nvShen.Attach(diaosi);//添加
            nvShen.Detach(diaosi);//删除
        }
    }


}
