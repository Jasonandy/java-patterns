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
package cn.ucaner.pattern.create.singleton;

/**
* @Package：cn.ucaner.pattern.create.singleton   
* @ClassName：Singleton   
* @Description：   <p> 双重锁的单例   单例模式</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:38:56   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class Singleton {
	
    //防止外部创建实例 私有
    private Singleton() {

    }
    
    //唯一实例
    private static volatile Singleton mInstance;

    public static Singleton getInstance() {
        //第一个锁，如果没有实例
        if (mInstance == null) {
            synchronized (Singleton.class) {
                //第二个锁，如果没有任何线程创建Singleton实例
                if (mInstance == null) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }
    
    
    public static void main(String[] args) {
		System.out.println(mInstance);
	}
}

