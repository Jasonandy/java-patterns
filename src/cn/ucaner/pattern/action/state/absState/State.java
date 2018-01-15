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
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午4:55:13   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public abstract class State {
	
    protected Context context;

    //设置状态
    public void setContext(Context context) {
        this.context = context;
    }

    //电梯门开启的动作
    public abstract void open();
    
    //电梯门关闭的动作
    public abstract void close();
    
    //电梯运行起来
    public abstract void run();
    
    //电梯停下来
    public abstract void stop();
}
