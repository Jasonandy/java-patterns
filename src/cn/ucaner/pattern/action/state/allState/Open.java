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
* @ClassName：Open   
* @Description：   <p> 状态模式  - 打开</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午4:56:20   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class Open extends State {


    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        //状态修改
        context.setNowState(Context.close);
        //委托执行
        context.getNowState().close();
    }

    //开着门不能跑
    @Override
    public void run() {
    	// by Jason
    	System.out.println("开着门不能跑！");
    }

    //开着门就是停止的
    @Override
    public void stop() {
    	//by Jason
    	System.out.println("开着门就是停止的!");
    }
}
