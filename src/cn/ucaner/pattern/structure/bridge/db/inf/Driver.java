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
package cn.ucaner.pattern.structure.bridge.db.inf;

/**     
* @Package：cn.ucaner.pattern.structure.bridge.db.inf   
* @ClassName：Driver   
* @Description：   <p>  JDBC 驱动 </p>
* @Author： - Jason    
* @CreatTime：2018年6月5日 下午9:29:12   
* @Modify By：   
* @ModifyTime：  2018年6月5日
* @Modify marker：   
* @version    V1.0
*/
public interface Driver {
	
	/**
	 * @Description: 连接器
	 * @Autor: Jason  -  jasonandy@hotmail.com
	 */
	public void connect();

}
