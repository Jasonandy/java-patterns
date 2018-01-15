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
package cn.ucaner.pattern.action.state.allState;

import cn.ucaner.pattern.action.state.absState.Context;
import cn.ucaner.pattern.action.state.absState.State;

/**
* @Package：cn.ucaner.pattern.action.state.allState   
* @ClassName：Stop   
* @Description：   <p> 状态模式   - 停止状态 </p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午4:57:27   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class Stop extends State {

	//停下来要开电梯门
    @Override
    public void open() {
        context.setNowState(Context.open);
        context.getNowState().open();
    }


    @Override
    public void close() {

    }

    @Override
    public void run() {
        context.setNowState(Context.run);
        context.getNowState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }
}
