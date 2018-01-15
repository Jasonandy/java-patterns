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
import cn.ucaner.pattern.action.state.allState.Open;

/**
* @Package：cn.ucaner.pattern.action.state   
* @ClassName：StateMain   
* @Description：   <p> 状态模式  - 执行类 </p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午4:58:00   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class StateMain {
    public static void main(String[] args) {
        Context context=new Context();
       // context.setNowState(new Run());// 运行
        context.setNowState(new Open());//Open 开启状态
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
