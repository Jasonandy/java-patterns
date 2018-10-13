/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月13日 下午3:24:35</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.action.observer.display;

import cn.ucaner.pattern.action.observer.observerAbs.ObserverInf;
import cn.ucaner.pattern.action.observer.subject.Subject;

/**     
* @Package：cn.ucaner.pattern.action.observer.display   
* @ClassName：StatisticsDisplay   
* @Description：   <p> 显示2 </p>
* @Author： - Jason   
* @CreatTime：2018年10月13日 下午3:24:35   
* @Modify By：   
* @ModifyTime：  2018年10月13日
* @Modify marker：   
* @version    V1.0
*/
public class StatisticsDisplay implements ObserverInf, DisplayElement{

	private float maxTemp = 0.0f;  // 最高温度
    private float minTemp = 0.0f;  // 最低温度
    private float tempSum = 0.0f;  // 温度更新和
    private int numReadings;       // 温度更新次数  

    Subject weatherData;           // 主题

    /**
    * StatisticsDisplay.   - 注册订阅者
    * @param weatherData
    */
    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

	@Override
	public void display() {
		System.out.println("NO.2:平均温度：" + (tempSum / numReadings) + ",最大温度："+ maxTemp + ",最小温度：" + minTemp);
	}

	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		// 统计温度和次数 用以算出平均温度
        float temp = temperature;
        tempSum += temp; 
        numReadings++;   

        // 设置最高温度
        if (temp > maxTemp) {
            maxTemp = temp;
        }
        // 设置最低温度
        if (temp < minTemp) {
            minTemp = temp;
        }

        display(); //更新完毕展示数据
	}

	@Override
	public void sysnc() {
		System.out.println("STATISTICSDISPLAY-开始数据同步.");
	}
}
