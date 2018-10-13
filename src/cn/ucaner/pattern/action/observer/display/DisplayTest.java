/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月13日 下午3:28:54</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.action.observer.display;

import cn.ucaner.pattern.action.observer.subimpl.WeatherData;

/**     
* @Package：cn.ucaner.pattern.action.observer.display   
* @ClassName：DisplayTest   
* @Description：   <p> DisplayTest </p>
* @Author： - Jason   
* @CreatTime：2018年10月13日 下午3:28:54   
* @Modify By：   
* @ModifyTime：  2018年10月13日
* @Modify marker：   
* @version    V1.0
*/
public class DisplayTest {
	
	public static void main(String[] args) {
		
		/**
		 * step1. 被观察的对象 - 天气对象.
		 */
        WeatherData weatherData = new WeatherData();

        // 2. 新建显示1-当前状态，显示2-气象统计，显示3-天气预报
        
        /**
         * CurrentConditionsDisplay 观察者 - 相当于一个订阅者 No.1
         */
        CurrentConditionsDisplay currentDisplay =  new CurrentConditionsDisplay(weatherData);
        currentDisplay.sysnc();
        
        /**
         * StatisticsDisplay 观察者 - 相当于一个订阅者 No.2
         */
        StatisticsDisplay statisticsDisplay =  new StatisticsDisplay(weatherData);
        statisticsDisplay.sysnc();
        
        /**
         * ForecastDisplay 观察者 - 相当于一个订阅者 No.3
         */
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        forecastDisplay.sysnc();
        
        /**
         * 被订阅的对象  数据发生了改变 
         * 通知到订阅了 该对象的人
         * 消息推送过去.
         */
        System.out.println("----------------------");
        weatherData.setMeasurements(20, 65, 30.4f);
        System.out.println("**********************");
        weatherData.setMeasurements(30, 70, 29.7f);
        System.out.println("---------------------");
        weatherData.setMeasurements(25, 90, 29.6f);
        System.out.println("**********************");
        weatherData.setMeasurements(32, 85, 26.5f);
        System.out.println("---------------------");
        weatherData.setMeasurements(32, 85, 26.5f);
        System.out.println("**********************");
	}

}
