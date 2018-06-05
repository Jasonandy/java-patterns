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
package cn.ucaner.pattern.structure.bridge.db;

import cn.ucaner.pattern.structure.bridge.db.inf.Driver;

/**     
* @Package：cn.ucaner.pattern.structure.bridge.db   
* @ClassName：BridgeTest   
* @Description：   <p> BridgeTest </p>
* @Author： - Jason   
* @CreatTime：2018年6月5日 下午9:37:19   
* @Modify By：   
* @ModifyTime：  2018年6月5日
* @Modify marker：   
* @version    V1.0
*/
public class BridgeTest {
	
	public static void main(String[] args) {
		
		 Bridge mysqlBridge = new MyBridge();
		 Driver mysqlDriver = new Mysql();  
	     mysqlBridge.setDriver(mysqlDriver);  
	     mysqlBridge.connect();  
		  
	     Driver oracle = new Oracle();  
	     mysqlBridge.setDriver(oracle);  
	     mysqlBridge.connect();  
	}
}
