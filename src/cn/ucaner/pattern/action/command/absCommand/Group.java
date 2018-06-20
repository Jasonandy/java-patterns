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
package cn.ucaner.pattern.action.command.absCommand;

/**
* @Package：cn.ucaner.pattern.action.command.absCommand   
* @ClassName：Group   
* @Description：   <p>  命令模式 ---  抽象执行者</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:36:27   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public abstract class Group {
	
	/**
	 * @Description: 得到命令
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
	public abstract void getCommand();
	
	/**
	 * @Description: 新增一个功能
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
    public abstract void doAdd();
    
    /**
     * @Description: 减去一个功能
     * @Autor: Jason - jasonandy@hotmail.com
     */
    public abstract  void doDel();
    
    /**
     * @Description: 开始实施
     * @Autor: Jason - jasonandy@hotmail.com
     */
    public abstract void plan();

}
