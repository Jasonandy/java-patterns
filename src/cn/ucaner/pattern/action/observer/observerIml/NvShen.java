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


import java.util.ArrayList;
import java.util.List;

import cn.ucaner.pattern.action.observer.observerAbs.Observer;
import cn.ucaner.pattern.action.observer.observerAbs.Subject;

/**
* @Package：cn.ucaner.pattern.action.observer.observerIml   
* @ClassName：NvShen   
* @Description：   <p> 观察者模式  --- 女神</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:28:12   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */

public class NvShen implements Subject{
	
	/**
	 * 女神有一大堆观察者.
	 */
    private List<Observer> observersList;

    //女神要去逛街了
    public void goShopping(){
        System.out.println("女神准备要去逛街了!!!");
        //调用通知方法
        Notify();
    }

    
    /**
     * 添加观察者
     */
    @Override
    public void Attach(Observer observer) {
        if(observersList==null){
            observersList=new ArrayList<Observer>();
        }else {
            observersList.add(observer);
        }
    }

    
    /**
     * 删除观察者
     */
    @Override
    public void Detach(Observer observer) {
        String name=((DiaoSi)observer).getName();
        if(observersList==null||observersList.size()==0){
            return;
        }
       if( observersList.remove(observer)){
           System.out.println("Sorry , 条件不满足 - "+name+"已经被踢出队伍.");
       }
    }

    
    /**
     * 通知所有观察者
     */
    @Override
    public void Notify() {
    	//observersList 观察者List
        for (Observer observer:observersList) {
            //通知所有的跟随人员
            observer.Update();
            observer.Say();
        }
        System.out.print("追求者已全部出动!");
    }

}
