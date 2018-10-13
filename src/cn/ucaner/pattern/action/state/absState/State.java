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
package cn.ucaner.pattern.action.state.absState;

/**
* @Package：cn.ucaner.pattern.action.state.absState   
* @ClassName：State   
* @Description：   <p> 状态模式 -  抽象状态角色</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午4:55:13   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public abstract class State {
	
	/**
	 * Context - 状态模式的上下文.
	 */
    protected Context context;

    /**
     * @Description: 设置状态
     * @param context 
     * @Autor: Jason
     */
    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * @Description: 电梯门开启的动作
     * @Autor: Jason
     */
    public abstract void open();
    
    /**
     * @Description: 电梯门关闭的动作
     * @Autor: Jason
     */
    public abstract void close();
    
    /**
     * @Description:电梯运行起来
     * @Autor: Jason
     */
    public abstract void run();
    
    /**
     * @Description:电梯停下来
     * @Autor: Jason
     */
    public abstract void stop();
}
