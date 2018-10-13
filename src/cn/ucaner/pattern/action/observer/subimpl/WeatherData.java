/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月13日 下午3:09:55</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.action.observer.subimpl;

import java.util.LinkedList;

import cn.ucaner.pattern.action.observer.observerAbs.ObserverInf;
import cn.ucaner.pattern.action.observer.subject.Subject;

/**     
* @Package：cn.ucaner.pattern.action.observer.subimpl   
* @ClassName：WeatherData   
* @Description：   <p> WeatherData </p>
* @Author： - Jason   
* @CreatTime：2018年10月13日 下午3:09:55   
* @Modify By：   
* @ModifyTime：  2018年10月13日
* @Modify marker：   
* @version    V1.0
*/
public class WeatherData implements Subject{

	/**
	 * 所有的订阅者 都存放到一起. - 维护所有注册的观察者 - 注册到这里  
	 * 链表方便Obj的添加删除操作.
	 */
    private LinkedList<ObserverInf> observers;

    /**
     *温度 
     */
    private float temperature; 
    
    /**
     * 湿度
     */
    private float humidity; 
    
    /**
     * 气压
     */
    private float pressure; 

    /**
     * 构造时 - new出列表对象
     * WeatherData.
     */
    public WeatherData(){
        observers = new LinkedList<ObserverInf>();
    }

    /**
     * @Description: 将观察者注册到列表中 
     * @param o 观察者
     * @Autor: Jason
     */
    @Override
    public void registerObserver(ObserverInf o) {
        observers.add(o);
    }

    /**
     * @Description: 移除
     * @param o  取消订阅的观察者
     * @Autor: Jason
     */
    @Override
    public void removeObserver(ObserverInf o) {
        int i = observers.indexOf(o); //判断对象是不是在订阅者之中 要是存在的话就移除
        if (i >= 0){
            observers.remove(i);
        }else {
        	System.out.println(o.toString()+"没有订阅过，无法进行退订操作!");
        }
    }

    
    /**
     * @Description: 通知订阅列表里的所有的订阅者
     * @Autor: Jason
     */
    @Override
    public void notifyObservers() {
    	for (ObserverInf observerInf : observers) {
    		observerInf.update(temperature, humidity, pressure);
		}
       /* for (int i = 0; i < observers.size(); ++i){
        	ObserverInf observerInf = (ObserverInf)observers.get(i);
        	observerInf.update(temperature, humidity, pressure);
        }*/
    }

    /**
     * @Description: 当数据发生改变的时候 推送给订阅的人
     * @Autor: Jason
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged(); //发生改变 通知所有的订阅者
    }
}
