/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月13日 下午3:21:16</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.action.observer.display;

import cn.ucaner.pattern.action.observer.observerAbs.ObserverInf;
import cn.ucaner.pattern.action.observer.subject.Subject;

/**     
* @Package：cn.ucaner.pattern.action.observer.display   
* @ClassName：CurrentConditionsDisplay   
* @Description：   <p> CurrentConditionsDisplay 布告板</p>
* @Author： - Jason   
* @CreatTime：2018年10月13日 下午3:21:16   
* @Modify By：   
* @ModifyTime：  2018年10月13日
* @Modify marker：   
* @version    V1.0
*/
public class CurrentConditionsDisplay implements ObserverInf, DisplayElement{

	private float temperature;    //温度
	
    private float humidity;       //湿度
    
    private Subject weatherData;  //主题
	    
    // 当前布告板 构造之时 订阅 了 主题
    /**
    * CurrentConditionsDisplay.   构造的时候订阅被观察的对象
    * @param weatherData
    */
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

	@Override
	public void display() {
		System.out.println("1,当前布告板: 温度"+ temperature +"度,湿度"+humidity+"%");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
	}

	@Override
	public void sysnc() {
		System.out.println("CURRENTCONDITIONSDISPLAY-开始数据同步");
	}

}
