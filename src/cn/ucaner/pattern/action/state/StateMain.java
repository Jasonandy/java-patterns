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
package cn.ucaner.pattern.action.state;

import cn.ucaner.pattern.action.state.absState.Context;
import cn.ucaner.pattern.action.state.allState.Stop;

/**
* @Package：cn.ucaner.pattern.action.state   
* @ClassName：StateMain   
* @Description：   <p> 状态模式  - 执行类 </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午4:58:00   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class StateMain {
	
	/**
	 * @Description: TEST 不同的状态组合有不同的结果  - 电梯的运行和不同的状态有关.
	 * @Autor: Jason
	 */
    public static void main(String[] args) {
        Context context=new Context();
        
        /**
         * tips:
         * 		不同的状态导致有不同的运行结果.
         */
        
        //context.setNowState(new Run());// 运行
        //context.setNowState(new Open());//Open 开启状态
        //context.setNowState(new Close()); //close 关闭
        context.setNowState(new Stop());// stop状态  
        
        
        /**
         * tips:
         * 		不同的状态 可以进行的操作前提是有条件的.
         */
        //context.open();
        //context.close(); 
        context.run();
        //context.stop();
    }
}
//Outputs
//电梯门开启
//电梯门关闭电梯正在运行
//电梯停止了


