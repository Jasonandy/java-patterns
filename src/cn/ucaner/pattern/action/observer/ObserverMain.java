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
import cn.ucaner.pattern.action.observer.observerIml.GaoFuShuai;
import cn.ucaner.pattern.action.observer.observerIml.NvShen;

/**
* @Package：cn.ucaner.pattern.action.observer   
* @ClassName：ObserverMain   
* @Description：   <p> 观察者模式   - 观察者模式运行类 </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:26:58   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class ObserverMain {

	/**
	 * @Description: Test 
	 * @Autor: Jason - Jasonandy@hotmail.com
	 */
    public static void main(String[] args) {
    	
        NvShen nvShen=new NvShen();
        
        /**
         * 添加观察者
         */
        getObservers(nvShen);
        
        
        //女神要出去逛街了!!!
        nvShen.goShopping();

    }

    /**
     * 添加观察者
     */
    public static void getObservers(Subject nvShen){
        for (int i = 0; i < 10 ; i++) {
        	String remark = String.format("有车 : %s ,有房: %s ,有学历: %s", "BBQ","BeiJing","常春藤");
        	GaoFuShuai gaoFuShuai = new GaoFuShuai("GFS"+i, (long)(i^(i+88)),remark );
            DiaoSi diaosi=new DiaoSi("DiaoSi"+i);
            nvShen.Attach(diaosi);
            if (i%2!=0) {
            	nvShen.Attach(gaoFuShuai);//添加高富帅
                nvShen.Detach(diaosi);
                /*if (i%3==0) {
                	nvShen.Detach(gaoFuShuai);//剔除高富帅
				}*/
			}
           
        }
    }

}
//Outputs
//Sorry , 条件不满足 - DiaoSi1已经被踢出队伍.
//Sorry , 条件不满足 - DiaoSi3已经被踢出队伍.
//Sorry , 条件不满足 - DiaoSi5已经被踢出队伍.
//Sorry , 条件不满足 - DiaoSi7已经被踢出队伍.
//Sorry , 条件不满足 - DiaoSi9已经被踢出队伍.
//女神准备要去逛街了!!!
//Hello , I'm GaoFuShuai .My Name is GFS1
//Little sister ,小姐姐约吗？ My Wechat is 88
//DiaoSi2已经知道女神出门,准备跟(wei)踪(sui)
//DiaoSi2在下想约你可以吗？
//Hello , I'm GaoFuShuai .My Name is GFS3
//Little sister ,小姐姐约吗？ My Wechat is 88
//DiaoSi4已经知道女神出门,准备跟(wei)踪(sui)
//DiaoSi4在下想约你可以吗？
//Hello , I'm GaoFuShuai .My Name is GFS5
//Little sister ,小姐姐约吗？ My Wechat is 88
//DiaoSi6已经知道女神出门,准备跟(wei)踪(sui)
//DiaoSi6在下想约你可以吗？
//Hello , I'm GaoFuShuai .My Name is GFS7
//Little sister ,小姐姐约吗？ My Wechat is 88
//DiaoSi8已经知道女神出门,准备跟(wei)踪(sui)
//DiaoSi8在下想约你可以吗？
//Hello , I'm GaoFuShuai .My Name is GFS9
//Little sister ,小姐姐约吗？ My Wechat is 104
//追求者已全部出动!