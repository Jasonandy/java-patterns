/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月13日 下午3:26:45</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.action.observer.display;

import cn.ucaner.pattern.action.observer.observerAbs.ObserverInf;
import cn.ucaner.pattern.action.observer.subject.Subject;

/**     
* @Package：cn.ucaner.pattern.action.observer.display   
* @ClassName：ForecastDisplay   
* @Description：   <p> ForecastDisplay </p>
* @Author： - Jason   
* @CreatTime：2018年10月13日 下午3:26:45   
* @Modify By：   
* @ModifyTime：  2018年10月13日
* @Modify marker：   
* @version    V1.0
*/
public class ForecastDisplay implements ObserverInf, DisplayElement{

	private float currentPressure = 28.82f; // 当前气压
    private float lastPressure;             // 上一次的气压
    private Subject weatherData;            // 主题

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

	@Override
	public void display() {
		if (currentPressure > lastPressure) {
            System.out.println("NO.3: 天气预报：温度正在持续上升！");
        } else {
            System.out.println("NO.3: 天气预报：注意气温下降了，可能有雨！");
        }
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		lastPressure = currentPressure;
        currentPressure = pressure;
        display();
	}

	@Override
	public void sysnc() {
		System.out.println("FORECASTDISPLAY - 开始数据同步.");
	}

}
