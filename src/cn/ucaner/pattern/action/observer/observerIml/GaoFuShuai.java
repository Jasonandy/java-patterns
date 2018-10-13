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
package cn.ucaner.pattern.action.observer.observerIml;

import cn.ucaner.pattern.action.observer.observerAbs.Observer;

/**     
* @Package：cn.ucaner.pattern.action.observer.observerIml   
* @ClassName：GaoFuShuai   
* @Description：   <p> 观察者对象 - 高富帅 </p>
* @Author： - Jason   
* @CreatTime：
* @Modify By：   
* @ModifyTime： 
* @Modify marker：   
* @version    V1.0
*/
public class GaoFuShuai implements Observer{

	/**
	 * 名字
	 */
	private String name;
	
	/**
	 * 资产
	 */
	private Long property;
	
	/**
	 * 备注
	 */
	private String Remark;
	
	@Override
	public void Update() {
		System.out.println("Hello , I'm GaoFuShuai .My Name is "+name);
	}

	@Override
	public void Say() {
		System.out.println("Little sister ,小姐姐约吗？ My Wechat is "+property);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getProperty() {
		return property;
	}

	public void setProperty(Long property) {
		this.property = property;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	/**  
	* GaoFuShuai. 
	* @param name
	* @param property
	* @param remark  
	*/  
	public GaoFuShuai(String name, Long property, String remark) {
		super();
		this.name = name;
		this.property = property;
		Remark = remark;
	}

	@Override
	public String toString() {
		return "I'm GaoFuShuai [name=" + name + ", property=" + property + ", Remark=" + Remark + "]";
	}
	
	
	
}
