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
	
	/**
	 * 防止外部创建实例 私有 
	 * Singleton.
	 */
    private Singleton() {

    }
    
    /**
     * 唯一实例 
     * 内存可见性：通俗来说就是，线程A对一个volatile变量的修改，对于其它线程来说是可见的，即线程每次获取volatile变量的值都是最新的。
     * https://www.cnblogs.com/chengxiao/p/6528109.html
     */
    private static volatile Singleton mInstance;

    public static Singleton getInstance() {
        
        if (mInstance == null) {//第一个锁，如果没有实例
        	
        	/**
        	 * 第二个锁，如果没有任何线程创建Singleton实例  对象锁 - 若多个线程拥有同一个MyObject类的对象，则这些方法只能以同步的方式执行
        	 * https://www.cnblogs.com/hapjin/p/5452663.html
        	 */
            synchronized (Singleton.class) { 
                if (mInstance == null) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }
    
    public static void main(String[] args) {
    	//单例模式获取单例实例化对象
    	System.out.println(getInstance());
    	
		System.out.println(mInstance);
	}
}

