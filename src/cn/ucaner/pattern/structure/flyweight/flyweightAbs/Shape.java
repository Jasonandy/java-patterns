/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月18日 下午2:22:23</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.structure.flyweight.flyweightAbs;

/**     
* @Package：cn.ucaner.pattern.structure.flyweight.flyweightAbs   
* @ClassName：Shape   
* @Description：   <p> Shape </p>
* @Author： - Jason   
* @CreatTime：2018年10月18日 下午2:22:23   
* @Modify By：   
* @ModifyTime：  2018年10月18日
* @Modify marker：    
* @version    V1.0
*/
public abstract class Shape {
	
	/**
	 * 内部状态
	 */
    private String intrinsic;
	
	/**
	 * @Description: 假如我们有一个绘图的应用程序，通过它我们可以出绘制各种
	 * 各样的形状、颜色的图形，那么这里形状和颜色就是内部状态了
	 * 通过享元模式我们就可以实现该属性的共享了
	 * @Autor: Jason
	 */
	public abstract void draw();

	
	public String getIntrinsic() {
		return intrinsic;
	}

	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}

}
