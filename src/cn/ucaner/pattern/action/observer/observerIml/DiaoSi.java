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
package cn.ucaner.pattern.action.observer.observerIml;

import cn.ucaner.pattern.action.observer.observerAbs.Observer;

/**
* @Package：cn.ucaner.pattern.action.observer.observerIml   
* @ClassName：DiaoSi   
* @Description：   <p> 观察者模式  ---  屌丝</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:28:58   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class DiaoSi  implements Observer{
   
	//你的名字
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiaoSi(String name) {
        this.name = name;
    }

    public DiaoSi() {
    }

    @Override
    public void Update() {
        System.out.println(name+"已经知道女神出门,准备跟(wei)踪(sui)");
    }


}
