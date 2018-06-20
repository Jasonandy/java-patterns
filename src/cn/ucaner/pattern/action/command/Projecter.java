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
package cn.ucaner.pattern.action.command;

import cn.ucaner.pattern.action.command.absCommand.Group;

/**     
* @Package：cn.ucaner.pattern.action.command   
* @ClassName：Projecter   
* @Description：   <p> 项目经理</p>
* @Author： - Jason   
* @CreatTime：2018年6月20日 上午8:38:44   
* @Modify By：   
* @ModifyTime：  2018年6月20日
* @Modify marker：   
* @version    V1.0
*/
public class Projecter extends Group{

	@Override
	public void getCommand() {
		System.out.println("项目经理讨论项目方案");
	}

	@Override
	public void doAdd() {
		System.out.println("批准项目");
	}

	@Override
	public void doDel() {
		System.out.println("重审项目");
	}

	@Override
	public void plan() {
		System.out.println("实施项目落地");
	}
	
	public void acceptance() {
		System.out.println("项目验收");
	}

}
