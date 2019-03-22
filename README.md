<p align=center>
  <a href="https://github.com/Jasonandy/Java-Core-Advanced">
    <img src="http://upload-images.jianshu.io/upload_images/7802425-9eb1bcd006e34aa6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240" alt="Java-Core-Advanced" >
  </a>
</p>

<p align=center>
  You are what you want to be.
</p>

<p align="center">
	<a href="#"><img src="https://img.shields.io/badge/Java-Patterns-blue.svg?style=for-the-badge" alt=""></a>
	<a href="#"><img src="https://img.shields.io/badge/Author-Jason-orange.svg?style=for-the-badge" alt=""></a>
</p>


# Ucaner
> You are what you want to be. - w.b


# patterns
* Project：Java-Patterns 
* OfficialWebsite：http://patterns.ucaner.cn
* describe：设计模式学习笔记

### 逻辑结构图
![逻辑结构](http://upload-images.jianshu.io/upload_images/7802425-5d6b679ecdac9f47.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 代码结构图
![结构图](http://upload-images.jianshu.io/upload_images/7802425-677a863b9d4690d0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 设计模式简述

创建型模式,共五种:工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式.

结构型模式,共七种:适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式.

行为型模式,共十一种:策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式.

![](http://upload-images.jianshu.io/upload_images/7802425-a9ff358ab460d0f9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 设计模式的六大原则
* 开闭原则（Open Close Principle）
	开闭原则就是说对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。所以一句话概括就是：为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。

* 里氏代换原则（Liskov Substitution Principle）
	里氏代换原则(Liskov Substitution Principle LSP)面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。 LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。里氏代换原则是对“开-闭”原则的补充。实现“开-闭”原则的关键步骤就是抽象化。而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。—— From Baidu 百科

* 依赖倒转原则（Dependence Inversion Principle）
	这个是开闭原则的基础，具体内容：真对接口编程，依赖于抽象而不依赖于具体。

* 接口隔离原则（Interface Segregation Principle）
	这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。还是一个降低类之间的耦合度的意思，从这儿我们看出，其实设计模式就是一个软件的设计思想，从大型软件架构出发，为了升级和维护方便。所以上文中多次出现：降低依赖，降低耦合。

* 迪米特法则（最少知道原则）（Demeter Principle）
	为什么叫最少知道原则，就是说：一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立。

* 合成复用原则（Composite Reuse Principle）
	原则是尽量使用合成/聚合的方式，而不是使用继承。

# 工厂方法模式
* 工厂模式，属于类创建型模式，工厂父类（接口）负责定义产品对象的公共接口，而子类工厂则负责创建具体的产品对象。
* 目的：是为了把产品的实例化操作延迟到子类工厂中完成，通过工厂子类来决定究竟应该实例化哪一个产品具体对象。
+ 工厂方法模式包含**四个**部分：
    - 1.抽象产品：产品对象同一的基类，或者是同一的接口
    - 2.具体的产品：各个不同的实例对象类
    - 3.抽象工厂：所有的子类工厂类的基类，或是同一的接口
    - 4.具体的工厂子类：负责每个不同的产品对象的实际创建

```java
package cn.ucaner.pattern.create.factory.factory;

import cn.ucaner.pattern.create.factory.AbsHumanFactory;
import cn.ucaner.pattern.create.factory.Human;

/**
* @Package：cn.ucaner.pattern.create.factory.factory   
* @ClassName：HumanFactory   
* @Description：   <p> 工厂模式   --- 具体工厂 - human 工厂  extends abs humanFactory </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:46:37   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class HumanFactory extends AbsHumanFactory {
    
    @SuppressWarnings("unchecked")
	@Override
    public <T extends Human> T createHumen(Class<T> tClass) {
        Human humen=null;
        try {
            humen= (T) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)humen;
    }
}

```
`具体的实现类`
```java
//黑种人
public class BlackHuman implements Human {
	
    @Override
    public void getColor() {
        System.out.println("黑色人种");
    }
}

//白种人
public class WhiteHuman implements Human {
	
    @Override
    public void getColor() {
        System.out.println("白色人种");
    }
}

//黄种人
public class YellowHuman implements Human {
	
    @Override
    public void getColor() {
        System.out.println("黄色人种");
    }
}

```
`抽象工厂`
```java
package cn.ucaner.pattern.create.factory;

/**
* @Package：cn.ucaner.pattern.create.factory   
* @ClassName：AbsHumanFactory   
* @Description：   <p> 工厂模式 --- 抽象出来的工厂</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:50:00   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public abstract class AbsHumanFactory {
	
    public abstract <T extends Human> T createHumen(Class<T> tClass);
    
}

```
```java
/**
* 工厂类测试 传入对应的实体 创建对应的对象
*/
public class FactoryMain {
	
    public static void main(String[] args) {
        //初始化一个工厂
        AbsHumanFactory humanFactory = new HumanFactory();

        //建造一个黄种人
        Human yellowHuman = humanFactory.createHumen(YellowHuman.class);
        yellowHuman.getColor();

        //建造一个黑人
        Human blackHuman = humanFactory.createHumen(BlackHuman.class);
        blackHuman.getColor();

        //建造一个白人
        Human whiteHuman = humanFactory.createHumen(WhiteHuman.class);
        whiteHuman.getColor();

    }
}

```

# 单例模式
* Singleton的静态属性instance中，只有instance为null的时候才创建一个实例，构造函数私有，确保每次都只创建一个，避免重复创建

```java
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
package cn.ucaner.pattern.create.singleton;

/**
* @Package：cn.ucaner.pattern.create.singleton   
* @ClassName：Singleton   
* @Description：   <p> 双重锁的单例   单例模式</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:38:56   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class Singleton {
	
	/**
	 * 防止外部创建实例 私有 
	 * Singleton.
	 */
    private Singleton() {

    }
    
    /**
     * 唯一实例 
     * 内存可见性：通俗来说就是，线程A对一个volatile变量的修改，对于其它线程来说是可见的，即线程每次获取volatile变量的值都是最新的。
     * https://www.cnblogs.com/chengxiao/p/6528109.html
     */
    private static volatile Singleton mInstance;

    public static Singleton getInstance() {
        
        if (mInstance == null) {//第一个锁，如果没有实例
        	
        	/**
        	 * 第二个锁，如果没有任何线程创建Singleton实例  对象锁 - 若多个线程拥有同一个MyObject类的对象，则这些方法只能以同步的方式执行
        	 * https://www.cnblogs.com/hapjin/p/5452663.html
        	 */
            synchronized (Singleton.class) { 
                if (mInstance == null) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }
    
    public static void main(String[] args) {
		System.out.println(mInstance);
	}
}

```

# 建造者模式
* 建造者模式，顾名思义的就是类似建房子，有一个固定的流程。在大话设计模式中，作者举了一个例子大概意思是同一道菜在中国的每一个地方都有不同的味道（LZ印象最深的是鱼香肉丝，来北方最之后印象最深的是宫保鸡丁。哈哈），而肯德基的鸡腿、汉堡在每一个城市都是一样的味道。我觉的这一个例子可以清楚的认识到建造者模式有一个固定的建造过程。建造者模式实现了依赖倒转原则，抽象不应该依赖细节，细节应该依赖与抽象。建造者模式的定义是：将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式。
+ 建造者模式的角色定义，在建造者模式中存在以下4个角色：
    - builder:为创建一个产品对象的各个部件指定抽象接口
    - ConcreteBuilder:实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创建的表示，并提供一个检索产品的接口
    - Director:构造一个使用Builder接口的对象
    -  Product:表示被构造的复杂对象。ConcreteBuilder创建该产品的内部表示并定义它的装配过程，包含定义组成部件的类，包括将这些部件装配成最终产品的接口 

```java
public class XMan {
	
	private String name;
	 
	private Integer age;
	
    private String xFactor;
    
    private String lover;

	public String getName() {
		return name;
	}

	public XMan setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getAge() {
		return age;
	}

	public XMan setAge(Integer age) {
		this.age = age;
		return this;
	}

	public String getxFactor() {
        return xFactor;
    }

    public XMan setxFactor(String xFactor) {
        this.xFactor = xFactor;
        return this;
    }

    public String getLover() {
        return lover;
    }

    public XMan setLover(String lover) {
        this.lover = lover;
        return this;
    }
}


```

```java

public class WolverineDirector {
	
    public XMan constructWolverine(WolverineBuilder wolverineBuilder) {
        return wolverineBuilder
                .buildXFactor()
                .buildLover()
                .buildName()
                .buildAge()
                .buildXman();
    }
}


public class WolverineBuilder implements XManBuilder {
	
    XMan mXMan;
    
    WolverineBuilder() {
        mXMan = new XMan();
    }
    
    // need to consider 

   /* @Override
    public WolverineBuilder buildXFactor() {
        mXMan.setxFactor("claw");
        System.out.println(mXMan.getxFactor());
        return this;
    }*/
    
    @Override
	public XManBuilder buildXFactor() {
    	 mXMan.setxFactor("claw");
         System.out.println(mXMan.getxFactor());
         return this;
	}

    @Override
    public WolverineBuilder buildLover() {
        mXMan.setLover("Jane");
        System.out.println(mXMan.getLover());
        return this;
    }

    @Override
	public WolverineBuilder buildName() {
		mXMan.setName("Wali");
		System.out.println(mXMan.getName());
		return this;
	}
	
	@Override
	public WolverineBuilder buildAge() {
		mXMan.setAge(18);
		System.out.println(mXMan.getAge());
		return this;
	}
	
	@Override
	public XMan buildXman() {
        System.out.println("Wolverine is successfully built");
        return mXMan;
    }

}


public interface XManBuilder {
	
    XManBuilder buildXFactor();
    
    XManBuilder buildLover();
    
    XManBuilder buildName();
    
    XManBuilder buildAge();
    
    XMan buildXman();
}


```
# 原型模式
[博客参考](https://www.cnblogs.com/lfxiao/p/6812835.html)
* 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式

```java
public class ShallowCopy  extends BaseMessage implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ShallowCopy shallowCopy=null;
        try {
            shallowCopy= (ShallowCopy) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return shallowCopy;
    }

}


public class DeepCopy extends BaseMessage implements Cloneable {

    @SuppressWarnings("unchecked")
	@Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCopy deepCopy=null;
        try {
            deepCopy= (DeepCopy) super.clone();
            this.setImgList((ArrayList<String>) this.getImgList().clone());
        }catch (Exception e){
            e.printStackTrace();
        }
        return deepCopy;
    }
}



public abstract class BaseMessage {

    /**
     * 发件人
     */
    private String send;

    /**
     * 收件人
     */
    private String receiver;

    /**
     * 消息
     */
    private String message;

    private ArrayList<String> imgList = new ArrayList<>();

    public ArrayList<String> getImgList() {
        return imgList;
    }

    public void setImgList(ArrayList<String> imgList) {
        this.imgList = imgList;
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addImage(String image){
        getImgList().add(image);
    }

   /*
    * 发送消息
 
    public void sendMessage(){
        System.out.println(getReceiver()+getMessage()+"     娃娃图片数量"+getImgList().size()+"     发件人"+getSend());
    }
} 

```

# 适配器模式
* 适配器就是一种适配中间件，它存在于不匹配的二者之间，用于连接二者，将不匹配变得匹配，简单点理解就是平常所见的转接头，转换器之类的存在
* 适配器模式有两种
    + 对象适配器
    + 接口适配器
   
[博客参考](http://www.cnblogs.com/V1haoge/p/6479118.html)

``接口适配器``

```java
/**     
* @Package：cn.ucaner.pattern.structure.adapter.charge.inf   
* @ClassName：ThreeInterface   
* @Description：   <p> 三口插头 </p>
* <pre>创建一个能够根据所传递对象的不同而具有不同行为的方法被称为[策略设计模式]</pre>
* @Author： - Jason   
* @CreatTime：2018年6月5日 下午8:51:29   
* @Modify By：   
* @ModifyTime：  2018年6月5日
* @Modify marker：   
* @version    V1.0
*/
public interface ThreeInterface {
	
	/**
	 * @Description:三个口的插头有 一 个 功能，能够为三个触角的插头提供电源
	 * @CreatTime: 2018年9月23日
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
	public void OfferPowerForThree();
}
```

```java
public interface TwoInterface {
	
	/**
	* @Description: 两口的插座
	* @CreatTime: 2018年9月23日
	* @Autor: Jason - jasonandy@hotmail.com
	 */
	 public void OfferPowerForTwo();

}

```

```java
public class Three2TwoAdapter implements ThreeInterface{

	/**
	 * 2口充电头 - 适配器
	 */
	TwoInterface twoInterface;
	
	/**
	 * 3口 转两口的插座 - 适配
	 * @param twoInterface
	 */
	public Three2TwoAdapter(TwoInterface twoInterface) {
		super();
		this.twoInterface = twoInterface;
	}


	/**
	 * 三口的适配器 适用的是俩孔的插座
	 */
	@Override
	public void OfferPowerForThree() {
		 twoInterface.OfferPowerForTwo();
	}

}

```
```java
public class Three3TwoAdapter implements TwoInterface{

	ThreeInterface threeInterface;
	
	/**
	 * 2口 转3口的插座 - 适配
	 * @param twoInterface
	 */
	public Three3TwoAdapter(ThreeInterface threeInterface) {
		super();
		this.threeInterface = threeInterface;
	}

	
	@Override
	public void OfferPowerForTwo() {
		threeInterface.OfferPowerForThree();
	}

}
```
```java
/**
* 转换器
*/
public class ChinaCharge implements TwoInterface{

	/**
	 * OfferPowerForTwo 标准的两口插座
	 */
	@Override
	public void OfferPowerForTwo() {
		System.out.println("I'm China Charge. 220V.  - 中国的标准的220V 50HZ 电源.");
	}

}

```
```java
public class HongKongCharge implements  ThreeInterface{

	/**
	 * 	大家好这里是标准的3口插头
	 */
	@Override
	public void OfferPowerForThree() {
		System.out.println("I'm Three Charge - HK Standard");
	}

}

```

``对象适配``
```java
/**
* @Package：cn.ucaner.pattern.structure.adapter.adapterAbs   
* @ClassName：IUserInfo   
* @Description：   <p> 适配器模式 - -抽象用户类 </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午6:03:19   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public interface IUserInfo { 
    //user信息
    String getUserName();
    String getHomeAddress();
    String getMobileNumber();
    String getSex();
    
    //job信息
    String getJobPosition();

}
```
```java
public interface IOtherInfo {
	
	/**
	 * @Description:获取用户的User信息
	 * @return: HashMap<String,String>
	 * @CreatTime: 2018年9月23日
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
    HashMap<String,String> getUserInfo();
    
    /**
     * @Description: 获取的是用户的job信息
     * @return: HashMap<String,String>
     * @CreatTime: 2018年9月23日
     * @Autor: Jason - jasonandy@hotmail.com
     */
    HashMap<String,String> getUserJobInfo();
}

```
``类适配``
```java
public class MeUserInfo implements IUserInfo {

    @Override
    public String getUserName() {
        System.out.print("员工姓名");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.print("员工住址");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.print("员工号码");
        return null;
    }

    @Override
    public String getSex() {
        System.out.print("员工性别");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.print("员工公司地址");
        return null;
    }

	@Override
	public String toString() {
		return "MeUserInfo [getUserName()=" + getUserName() + ", getHomeAddress()=" + getHomeAddress()
				+ ", getMobileNumber()=" + getMobileNumber() + ", getSex()=" + getSex() + ", getJobPosition()="
				+ getJobPosition() + "]";
	}
    
    
}

```
```java
public class OtherUserInfo implements IOtherInfo {
	
    @Override
    public HashMap<String, String> getUserInfo() {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("username","员工名称");
        hashMap.put("address","员工住址");
        hashMap.put("number","员工号码");
        hashMap.put("sex","员工性别");
        return hashMap;
    }

    @Override
    public HashMap<String, String> getUserJobInfo() {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("jobaddress","员工公司地址");
        return hashMap;
    }

	@Override
	public String toString() {
		return "OtherUserInfo [getUserInfo()=" + getUserInfo() + ", getUserJobInfo()=" + getUserJobInfo() + "]";
	}
	
}

```
``对象适配``
```java
public class UserAdapter extends OtherUserInfo implements IUserInfo{
	
    @Override
    public String getUserName() {
        System.out.println(getUserInfo().get("username"));
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println(getUserInfo().get("address"));
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println(getUserInfo().get("number"));
        return null;
    }

    @Override
    public String getSex() {
        System.out.println(getUserInfo().get("sex"));
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println(getUserJobInfo().get("jobaddress"));
        return null;
    }

	@Override
	public String toString() {
		return "UserAdapter [getUserName()=" + getUserName() + ", getHomeAddress()=" + getHomeAddress()
				+ ", getMobileNumber()=" + getMobileNumber() + ", getSex()=" + getSex() + ", getJobPosition()="
				+ getJobPosition() + "]";
	}
    
}

```
``Test-Main``
```java

public class AdapterMain {
	
    public static void main(String[] args) {
       
    	/**
    	 * 接口是iuserInfo  实例拿的是 OtherUserInfo
    	 */
        IUserInfo iUserInfo=new UserAdapter();
        iUserInfo.getHomeAddress();
        System.out.println(iUserInfo.toString());
        
        /**
         * iuserInfo  实例也是 UserInfo 
         */
        IUserInfo iUserInfoMe=new MeUserInfo();
        iUserInfoMe.getHomeAddress();
        System.out.println(iUserInfoMe.toString());
        
        
    }
}
```

# 代理模式
* 代理模式是Java常见的设计模式之一。所谓代理模式是指客户端并不直接调用实际的对象，而是通过调用代理，来间接的调用实际的对象
* 静态代理
* 动态代理
* CGlib代理

[代理模式参考](https://www.cnblogs.com/cenyu/p/6289209.html)
``静态代理``
```java
/**
* @Package：cn.ucaner.pattern.structure.proxy.staticProxy   
* @ClassName：Subject   
* @Description：   <p> static Proxy 代理模式接口类 </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午1:46:44   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public interface Subject {
	
	/**
	 * static Proxy
	 */
    void request();
    
}

/**
* @Package：cn.ucaner.pattern.structure.proxy.staticProxy   
* @ClassName：RealSuject   
* @Description：   <p> 代理模式真实类</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午1:47:02   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class RealSuject implements Subject {
	
    @Override
    public void request() {
        System.out.println("*** static proxy do request ！By Jason ***");
    }
}

/**
* @Package：cn.ucaner.pattern.structure.proxy.staticProxy   
* @ClassName：Proxy   
* @Description：   <p> 代理模式 代理模式代理类,他和装饰器模式的实现有点相近{@link Decorator}</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午1:47:45   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class Proxy implements Subject {
	
    private Subject realSuject;

    public Proxy(Subject realSuject) {
        this.realSuject = realSuject;
    }

    @Override
    public void request() {
        if(realSuject!=null){
            realSuject.request();
        }
    }
}

```
``动态代理``
```java
public interface Subject {

	/**
	 * dynamicProxy
	 */
    public abstract void request();

}

public class RealSujectImpl implements Subject {

    @Override
    public void request() {
        System.out.println("*** dynamicProxy  do request ***");
    }

}

/**
* @Package：cn.ucaner.pattern.structure.proxy.dynamicProxy   
* @ClassName：SubjectInvocationHandler   
* @Description：   <p> 动态代理模式 --
*  利用java.lang.reflect.Proxy类和java.lang.reflect.InvocationHandler接口定义代理类的实现
* </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:04:37   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class SubjectInvocationHandler implements InvocationHandler {

	/**
	 * 目标对象 
	 */
    private Object target;

    
    public SubjectInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 描述: 实现调用  
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----Dynamic Proxy invoke method Start  ----");
        Object result = method.invoke(target, args);//方法调用 
        System.out.println("----Dynamic Proxy invoke method End by Jason----");
        return result;
    }

    public Object getProxy() {
        
    	//获取当前线程的 classloder 
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        
        //获取所有的interface 
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, this);
    }
}

```
``TEST``
```java
/**
* @Package：cn.ucaner.pattern.structure.proxy   
* @ClassName：ProxyMain   
* @Description：   <p> 代理模式运行类</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午1:45:08   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class ProxyMain {

    public static void main(String[] args) {
    	//静态代理
    	staticProxy();
    	//动态代理
        dynamicProxy();
    }

    /**
     * 静态代理
     */
    private static void staticProxy() {
        RealSuject realSuject = new RealSuject();
        Proxy proxy = new Proxy(realSuject);
        proxy.request();
    }

   /**
    * 动态代理
    */
    private static void dynamicProxy(){
        RealSujectImpl realSubject=new RealSujectImpl();
        SubjectInvocationHandler handler=new SubjectInvocationHandler(realSubject);
        Subject subject= (Subject) handler.getProxy();
        subject.request();
    }
}

```

``cglib``
```text
Cglib代理

上面的静态代理和动态代理模式都是要求目标对象是实现一个接口的目标对象,但是有时候目标对象只是一个单独的对象,并没有实现任何的接口,这个时候就可以使用以目标对象子类的方式类实现代理,这种方法就叫做:Cglib代理

Cglib代理,也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功能的扩展.

JDK的动态代理有一个限制,就是使用动态代理的对象必须实现一个或多个接口,如果想代理没有实现接口的类,就可以使用Cglib实现.
Cglib是一个强大的高性能的代码生成包,它可以在运行期扩展java类与实现java接口.它广泛的被许多AOP的框架使用,例如Spring AOP和synaop,为他们提供方法的interception(拦截)
Cglib包的底层是通过使用一个小而块的字节码处理框架ASM来转换字节码并生成新的类.不鼓励直接使用ASM,因为它要求你必须对JVM内部结构包括class文件的格式和指令集都很熟悉.

Cglib子类代理实现方法:
1.需要引入cglib的jar文件,但是Spring的核心包中已经包括了Cglib功能,所以直接引入pring-core-3.2.5.jar即可.
2.引入功能包后,就可以在内存中动态构建子类
3.代理的类不能为final,否则报错
4.目标对象的方法如果为final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法.
```


# 外观模式
* 外观模式（Facade）,他隐藏了系统的复杂性，并向客户端提供了一个可以访问系统的接口。这种类型的设计模式属于结构性模式。
* 为子系统中的一组接口提供了一个统一的访问接口，这个接口使得子系统更容易被访问或者使用.
```java
package cn.ucaner.pattern.structure.decorator.decoratorAbs;

/**
* @Package：cn.ucaner.pattern.structure.decorator.decoratorAbs   
* @ClassName：Decorator   
* @Description：   <p> 装饰器模式  - 
* 抽象装饰器 这种方式看起来和静态代理模式很像 {@link cn.ucaner.pattern.structure.proxy.staticProxy.Proxy }</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:16:35   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public abstract class Decorator extends SchoolReport {
	
	/**
	 * 成绩单的抽象类
	 */
    private SchoolReport  schoolReport;

    /**
    * Decorator.  将成绩单的属性包装到 Decorator里面去
    * @param schoolReport
     */
    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    /**
     * 展示自己的成绩
     */
    public void report(){
        schoolReport.report();
    }

    @Override
    public void sign(String name) {
        schoolReport.sign(name);
    }
}

package cn.ucaner.pattern.structure.decorator.decoratorAbs;

/**
* @Package：cn.ucaner.pattern.structure.decorator.decoratorAbs   
* @ClassName：SchoolReport   
* @Description：   <p> 装饰器模式  -  成绩单抽象类</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:17:14   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public abstract class SchoolReport {

    /**
     * 展示自己的成绩
     */
    public abstract void report();

   /**
    * 家长签名
    */
    public abstract void sign(String name);
    
    /**
     * 建议-给出建议
     */
     public abstract void discuss(String discuss);

}



public class FouthGradeSchoolReport extends SchoolReport {


    @Override
    public void report() {
        System.out.print(" 数学60,语文:80,英语:90 ");
    }

    @Override
    public void sign(String name) {
        System.out.println(" 家长签名:" + name);
    }

	@Override
	public void discuss(String discuss) {
		 System.out.println(" 建议: " + discuss);
	}

}

public class GoodBoyDecortaor extends Decorator {
	
    public GoodBoyDecortaor(SchoolReport schoolReport) {
        super(schoolReport);
    }

    /**
     * @Description:报告之前 先包装一下数据 
     * @Autor: Jason
     */
    private void goodBoyDecorator(){
        System.out.println("我在学校表现很好,没毛病!");
    }

    /**
     * 1.goodBoyDecorator 
     * 2.成绩报告.
     */
    @Override
    public void report() {
        goodBoyDecorator();
        super.report();

    }

    /**
     * 给出建议
     */
	@Override
	public void discuss(String discuss) {
		System.out.println("表现好就可以骄傲了？我骄傲过吗？");
	}
}

public class RankDecortaor extends Decorator {

    public RankDecortaor(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void rankDecortaor(){
        System.out.println("在学校排名也很靠前");
    }

    @Override
    public void report() {
        rankDecortaor();
        super.report();
    }

	@Override
	public void discuss(String discuss) {
		System.out.println("学校的排名这么靠前，还需要啥建议？建议低调一点，继续保持!");
	}
}

public class SuagrFouthGradeSchoolReport extends FouthGradeSchoolReport {

    /**
     * 先把最高成绩说出去
     */
    private void reportHighSorce(){
        System.out.print("我英语得了90分,语文得了80分. ");
    }

    @Override
    public void report() {
        reportHighSorce();
        super.report();
    }
}

package cn.ucaner.pattern.structure.decorator;

import cn.ucaner.pattern.structure.decorator.decoratorAbs.SchoolReport;
import cn.ucaner.pattern.structure.decorator.decoratorIml.FouthGradeSchoolReport;
import cn.ucaner.pattern.structure.decorator.decoratorIml.GoodBoyDecortaor;
import cn.ucaner.pattern.structure.decorator.decoratorIml.RankDecortaor;
import cn.ucaner.pattern.structure.decorator.decoratorIml.SuagrFouthGradeSchoolReport;

/**
* @Package：cn.ucaner.pattern.structure.decorator   
* @ClassName：DecoratorMain   
* @Description：   <p> 装饰器模式  -  装饰器模式运行类 
*  {@link https://www.cnblogs.com/octobershiner/archive/2011/11/04/2236730.html}
*  </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:15:16   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class DecoratorMain   {

    public static void main(String[] args) {
        absDecorator();
        extendsDecorator();
        normol();
    }

    /**
     * @Description: 一般情况下   -- 没有包装的情况下
     * @Autor: Jason 
     */
    private static void normol(){
    	
    	System.out.println("****************没有包装成绩的情况下*********************");
        //把成绩单领回家
        SchoolReport schoolReport=new FouthGradeSchoolReport();
        //家长看成绩单
        schoolReport.report();
        schoolReport.sign(" 大家好我是校长");
        //schoolReport.discuss("我建议你别浪费钱!");
        //准备挨打
        System.out.println("********************************************************");
    }

    /**
     * @Description:如果用继承装饰
     * @Autor: Jason
     */
    private static void extendsDecorator(){
    	/**
    	 * 这里是被包装了的成绩单  家长看到的只是比较好的成绩
    	 */
        SchoolReport schoolReport = new SuagrFouthGradeSchoolReport();

        /**
         * 看成绩单
         */
        schoolReport.report();
        
        /**
         * 签字确认
         */
        schoolReport.sign("马化腾");

        /**
        * 继承方式的弊端,如果以后要有五年级 六年级 七年级的成绩单,
         * 那么需要你分别对这几个年级的成绩单进行装饰,
         * 如果需要装饰的条件一旦很多,比如说平时表现啊什么的,就得一一去装饰,带来类的爆炸性增长,
        **/
    }


    /**
     * @Description: 利用抽象装饰
     * @Autor: Jason
     */
    private static void absDecorator(){
        // ******************************** CallMethod Start *****************************************
    	
    	/**
    	 * 原始的成绩  -- 没有经过包装的成绩
    	 */
        SchoolReport schoolReport=new FouthGradeSchoolReport();
        /**
         * 装饰表现
         */
        schoolReport=new GoodBoyDecortaor(schoolReport);
        
        /**
         * 装饰排名
         */
        schoolReport=new RankDecortaor(schoolReport);
        
        /**
         * 装饰了几次后  - 开始报告成绩!
         */
        schoolReport.report();
        
        /**
         * 查阅者签名确认
         */
        schoolReport.sign("马云");
        
        schoolReport.discuss("建议好好读书！"); //这里没有打印出来
        
        // ******************************** CallMethod End *****************************************
    }

}


```

# 桥接模式
* 桥接模式即将抽象部分与它的实现部分分离开来，使他们都可以独立变化
* 桥接模式将继承关系转化成关联关系，它降低了类与类之间的耦合度，减少了系统中类的数量，也减少了代码量

```java
package cn.ucaner.pattern.structure.bridge.abs;

/**
* @Package：cn.ucaner.pattern.structure.bridge.abs   
* @ClassName：Abstraction   
* @Description：   <p> 桥接模式 --- 抽象化角色</p>
* <pre> 桥接Bridge是用于把 [抽象化与实现化]解耦，使得二者可以独立变化 </pre>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:58:30   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public abstract class Abstraction{
	
	/**
	 * Implementor  实现器   - 其实就是 抽象化  和 实现化  解耦 
	 */
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void doSomethings(){
    	System.out.println("Abs 开始搞事情!");
        implementor.doSomethingA();
        implementor.doSomethingB();
        System.out.println("Abs 搞事情完毕!");
    }

    public Implementor getImplementor(){
        return implementor;
    }
}


package cn.ucaner.pattern.structure.bridge.abs;

/**
* @Package：cn.ucaner.pattern.structure.bridge.abs   
* @ClassName：Implementor   
* @Description：   <p> 桥接模式 --- 实现化角色 </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:58:48   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public interface Implementor {
	
	/**
	 * @Description: doSomethingA
	 * @Autor: Jason
	 */
    public void doSomethingA();
    
    /**
     * @Description: doSomethingB
     * @Autor: Jason
     */
    public void doSomethingB();
}


package cn.ucaner.pattern.structure.bridge;

import cn.ucaner.pattern.structure.bridge.abs.Implementor;

/**
* @Package：cn.ucaner.pattern.structure.bridge   
* @ClassName：ConcreteImplementor   
* @Description：   <p> 桥接模式  --  具体实现类</p>
* @Author： -  
* @CreatTime：2017年10月26日 下午5:59:37   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class ConcreteImplementor implements Implementor {
	
    @Override
    public void doSomethingA() {
        System.out.println("bridge do something A");
    }

    @Override
    public void doSomethingB() {
        System.out.println("bridge do something B");
    }
}

package cn.ucaner.pattern.structure.bridge;

import cn.ucaner.pattern.structure.bridge.abs.Implementor;

/**
*    
* @Package：cn.ucaner.pattern.structure.bridge   
* @ClassName：BridgeMain   
* @Description：   <p> 桥接模式  -- 执行类</p>
* @Author： - 
* @CreatTime：2017年10月26日 下午5:59:16   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class BridgeMain {


    public static void main(String[] args) {
    	/**
    	 * 实现化角色
    	 */
        Implementor implementor = new ConcreteImplementor();
        
        /**
         * 抽象化角色
         */
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(implementor);
        
        /**
         * 抽象化角色搞事情
         */
        refinedAbstraction.doSomethings();
        
        implementor.doSomethingA();
        implementor.doSomethingB();
    }
}




```

# 组合模式
*
*

# 享元模式
* String常量池、数据库连接池、缓冲池等等都是享元模式的应用，所以说享元模式是池技术的重要实现方式.
```java
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



public class Circle extends Shape{
	
	private String color;
	
    public Circle(String color){
        this.color = color;
    }

	@Override
	public void draw() {
		System.out.println("Draw a Circle Which Color is " + color +".");
	}

}

public class DrawFactory {

	/**
	 * 定义一个池容器 - 享元池
	 */
    private static HashMap<String,Shape> colorsPool = new HashMap<String,Shape>();

    /**
     * @Description: 获取对象
     * @param color
     * @return Shape
     * @Autor: Jason
     */
    public static Shape getShape(String color){
    	
    	/**
    	 * 需要返回的对象
    	 */
    	Shape  shape  = null;
        
        if(colorsPool.containsKey(color)){
        	shape = colorsPool.get(color); //外部状态
        }else {
        	shape = new Circle(color); //如果不存在的话创建  放入池子中
        	colorsPool.put(color,shape);
        }
        return shape;
    }

    /**
     * @Description: 获取池的大小
     * @return int   池子大小
     * @Autor: Jason
     */
    public static  int getPoolSize(){
        return colorsPool.size();
    }
    
}


package cn.ucaner.pattern.structure.flyweight;

import cn.ucaner.pattern.structure.flyweight.flyweightAbs.Shape;

/**     
* @Package：cn.ucaner.pattern.structure.flyweight   
* @ClassName：DrawMain   
* @Description：   <p> DrawMain </p>
* @Author： - Jason   
* @CreatTime：2018年10月18日 下午2:28:01   
* @Modify By：   
* @ModifyTime：  2018年10月18日
* @Modify marker：   
* @version    V1.0
*/
public class DrawMain {
	
	public static void main(String[] args) {
		
		Shape shape1 = DrawFactory.getShape("RED");
        Shape shape2 = DrawFactory.getShape("GREY");
        Shape shape3 = DrawFactory.getShape("GREEN");
        Shape shape4 = DrawFactory.getShape("RED");
        Shape shape5 = DrawFactory.getShape("GREY");
        Shape shape6 = DrawFactory.getShape("GREY");
        
        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();
        shape5.draw();
        shape6.draw();
        
        System.out.println("一共绘制了" + DrawFactory.getPoolSize() + "种颜色的圆形.");
	}

}

```



# 责任链模式
* 抽象处理者(Handler)角色：定义出一个处理请求的接口。如果需要，接口可以定义 出一个方法以设定和返回对下家的引用。这个角色通常由一个Java抽象类或者Java接口实现。上图中Handler类的聚合关系给出了具体子类对下家的引用，抽象方法handleRequest()规范了子类处理请求的操作。
* 具体处理者(BossHandler)角色：具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家。由于具体处理者持有对下家的引用，因此，如果需要，具体处理者可以访问下家。
```java
public abstract class Handler {
	
	/**
	 * 下一个执行者
	 */
    private Handler nextHandler;

    /**
     * @Description: 当前执行者对请求做处理   需要处理的Biz对象
     * @param handLeve
     * @return boolean
     * @Autor: Jason - jasonandy@hotmail.com
     */
    public final boolean handlerRequst(int  handLeve){
    	
        boolean bReq=false;
        /**
         * 判断自己是否可以审核  - 可以审核的话  直接审核完毕
         */
        if(getLevel()>=handLeve){
            System.out.println(getnName()+" :可以审批");
            return true;
        }else {
            if(this.nextHandler!=null){
            	/**
            	 * 超过阈值 向上一级提交申请
            	 */
            	//System.out.println(String.format("金额%s超过%s的审核级别 向上一级%s提交申请 ",handLeve,getnName(), nextHandler.getnName()));
                System.out.println(getnName()+"向"+nextHandler.getnName()+"递交请求");
                /**
                 * 向上一级请求
                 */
                bReq=nextHandler.handlerRequst(handLeve);
                /**
                 * 根据上级的答复做出回应
                 */
                if(bReq){
                    System.out.println(getnName()+" :"+nextHandler.getnName()+"说可以审批");
                }else {
                    System.out.println(getnName()+" :"+nextHandler.getnName()+"说不可以审批");
                }
            }else {
            	/**
            	 * 到这边已经没有下一个处理者了 
            	 */
                System.out.println(getnName()+" :金额太大了");
            }
        }
        return bReq;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    
    /**
     * @Description: 可以审批的金额
     * @return int
     * @Autor: Jason - jasonandy@hotmail.com
     */
    public abstract int getLevel();



    /**
     * @Description: 处理者名字
     * @return String
     * @Autor: Jason - jasonandy@hotmail.com
     */
    public abstract String getnName();

}



public class BossHandler extends Handler {

	private int moneny;
	
    @Override
    public int getLevel() {
        return this.moneny;
    }

    @Override
    public String getnName() {
        return "BOSS";
    }

	public int getMoneny() {
		return moneny;
	}

	public void setMoneny(int moneny) {
		this.moneny = moneny;
	}

	/**  
	* BossHandler. 
	* @param moneny  
	*/  
	public BossHandler(int moneny) {
		super();
		this.moneny = moneny;
	}
    
}

public class ChainOfReponsibilityMain {

    public static void main(String[] args) {
    	/**
    	 * 我要报销的钱数
    	 */
        int money=10000;
        
        /**
         * 初始化各个处理者
         */
        Handler manager = new ManagerHandler(200); 
        Handler finance = new FinanceHandler(500);
        Handler boss = new BossHandler(1000);
        
        //manager -> finace -> boss
        
        /**
         * 设置链中的顺序
         */
        manager.setNextHandler(finance);
        
        finance.setNextHandler(boss);
        
        //do 
        System.out.println("I want 报销 "+money+" yuan.");
        if (manager.handlerRequst(money)) {
            System.out.println("报销Success!");
        } else {
            System.out.println("报销Fail!");
        }
    }

}

```



# 命令模式
* 将一个请求封装为一个对象，从而让我们可用不同的请求对客户进行参数化；对请求排队或者记录请求日志，以及支持可撤销的操作。命令模式是一种对象行为型模式，其别名为动作(Action)模式或事务(Transaction)模式。
*  命令模式的定义比较复杂，提到了很多术语，例如“用不同的请求对客户进行参数化”、“对请求排队”，“记录请求日志”、“支持可撤销操作”等，在后面我们将对这些术语进行一一讲解

```java
public abstract class Command {
	
	/**
	 * 项目经理
	 */
	protected Projecter pm = new Projecter();
	
	/**
	 * 产品经理
	 */
    protected Product product = new Product();
    
    /**
     * UI
     */
    protected UI ui = new UI();
    
    /**
     * 码农实现
     */
    protected Code code =new Code();
    
    
/*    private List<Group> gps;
    
	public List<Group> getGps() {
		return gps;
	}

	public void setGps(List<Group> gps) {
		this.gps = gps;
	}*/


	/**
     * @Description: execute
     * @Autor: Jason - jasonandy@hotmail.com
     */
    public abstract void execute();
}

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

public class Code extends Group {


    @Override
    public void getCommand() {
        System.out.println("开发收到命令");
    }

    @Override
    public void doAdd() {
        System.out.println("开发新写了一个页面");
    }

    @Override
    public void doDel() {
        System.out.println("开发注释了一个页面");
    }

    @Override
    public void plan() {
        System.out.println("开发变更完毕");
    }
}

public class CommandMain {

	/**
	 * @Description: Just for test
	 * @Autor: Jason- jasonandy@hotmail.com
	 */
    public static void main(String[] args) {
        Invoker invoker=new Invoker();
        invoker.setCommand(new AddPageCommand());
        invoker.Call();
    }

}

public class Invoker   {
	
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public  void Call() {
        this.command.execute();
    }
}


```


# 观察者模式
* 在对象之间定义了一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象会收到通知并自动更新
* 其实就是发布订阅模式，发布者发布信息，订阅者获取信息，订阅了就能收到信息，没订阅就收不到信息
```java
public interface  ObserverInf {
	
	/**
	 * @Description: 更新数据 - 数据发生改变的时候通知到其他地方.
	 * @param temp  温度
	 * @param humidity 湿度
	 * @param pressure 气压
	 * @Autor: Jason
	 */
	public void update(float temperature, float humidity, float pressure);

}
```
```java
public interface  DisplayElement {

	/**
	 * @Description: 外观显示方法  - 展示 被观察者 的具体的信息的方法.
	 * @Autor: Jason
	 */
    public void display();
    
    /**
     * @Description:开始同步数据.
     * @Autor: Jason
     */
    public void sysnc();
}


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

public interface Subject {
	
	/**
	 * @Description: 添加一个观察者
	 * @param observer observer 
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
    public void Attach(Observer observer);
    
    /**
	 * @Description: 删除一个观察者
	 * @param observer  observer
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
    public void Detach(Observer observer);
    
    /**
	 * @Description: 通知所有的观察者
	 * @Autor: Jason - jasonandy@hotmail.com
	 */
    public void Notify();
    
}

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

public interface Subject {

	/**
	 * @Description: 用以注册观察者   - 也就是都有谁来关注这个 可以理解为订阅这个消息
	 * @param o 具体的观察者
	 * @Autor: Jason
	 */
    public void registerObserver(ObserverInf o);

    /**
     * @Description: 用以删除观察者  - 也就会谁会来退订这个所观察的对象  - 可以通俗的理解为退订
     * @param o 具体的观察者
     * @Autor: Jason
     */
    public void removeObserver(ObserverInf o);

    /**
     * @Description: 来通知这个观察者 
     * @Autor: Jason
     */
    public void notifyObservers();
}

```

# 状态模式
* 定义对象间的一种一对多的依赖关系,当一个对象的状态发生改变时,所有依赖于它的对象都得到通知并被自动更新。允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类
* 1.一个对象的行为取决于它的状态,并且它必须在运行时刻根据状态改变它的行为。
* 2.一个操作中含有庞大的多分支的条件语句，且这些分支依赖于该对象的状态。
```java
public class Context {

	/**
	 * 定义出所有的电梯状态  用在setState() 枚举状态.
	 */
    public static final Open open = new Open(); //打开状态
    public static final Close close = new Close();//关闭状态
    public static final Run run = new Run();//运行状态
    public static final Stop stop = new Stop();//停止状态

    /**
     * 当前的状态
     */
    private State nowState;

    public void setNowState(State nowState) {
        this.nowState = nowState;
        /**
         * this --> context   [其实就是nowContext]
         */
        this.nowState.setContext(this);
    }

    public State getNowState() {
        return nowState;
    }

    public void open(){
        nowState.open();
    }

    public void close(){
        nowState.close();
    }

    public void run(){
        nowState.run();
    }

    public void stop(){
        nowState.stop();
    }
}


public abstract class State {
	
	/**
	 * Context - 状态模式的上下文.
	 */
    protected Context context;

    /**
     * @Description: 设置状态
     * @param context 
     * @Autor: Jason
     */
    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * @Description: 电梯门开启的动作
     * @Autor: Jason
     */
    public abstract void open();
    
    /**
     * @Description: 电梯门关闭的动作
     * @Autor: Jason
     */
    public abstract void close();
    
    /**
     * @Description:电梯运行起来
     * @Autor: Jason
     */
    public abstract void run();
    
    /**
     * @Description:电梯停下来
     * @Autor: Jason
     */
    public abstract void stop();
}



public class Close extends State {


	/**
	 * context - state的context 
	 */
    @Override
    public void open() {
        //状态修改
        context.setNowState(Context.open); //设置为open状态
        //委托执行 
        context.getNowState().open();
    }

    @Override
    public void close() {
       System.out.print("电梯门关闭");
    }

    //运行
    @Override
    public void run() {
        //状态修改
        context.setNowState(Context.run);
        //委托执行
        context.getNowState().run();
    }

    //停止
    @Override
    public void stop() {
        //状态修改
        context.setNowState(Context.stop);
        //委托执行
        context.getNowState().stop();

    }
}


public class Open extends State {


	/**
	 * 开启
	 */
    @Override
    public void open() {
        System.out.println("OPEN-电梯门Open.");
    }

    /**
     * 关闭 
     */
    @Override
    public void close() {
        //状态修改
        context.setNowState(Context.close);
        //委托执行
        context.getNowState().close();
    }

    /**
     * 开着门不能跑
     */
    @Override
    public void run() {
    	// by Jason
    	System.out.println("RUN-开着门不能Run.!");
    }

    /**
     * 开着门就是停止的
     */
    @Override
    public void stop() {
    	//by Jason
    	System.out.println("STOP-开着门就是Stop.!");
    }
}


public class Run extends State {


	/**
	 * 运行状态不能开门
	 */
    @Override
    public void open() {
        //状态修改 by Json
    	System.out.println("OPEN-Run状态不能开门!");
    }

    /**
     * 运行状态门就是关着的
     */
    @Override
    public void close() {
    	//by Jason
    	System.out.println("CLOSE-Run状态门就是关着的!");
    }

    @Override
    public void run() {
        System.out.println("RUN-电梯正在Run.");
    }

    /**
     * 停止运行
     */
    @Override
    public void stop() {
        context.setNowState(Context.stop); //Run -->Stop 
        context.getNowState().stop();
    }
}


public class Stop extends State {

	/**
	 * 停下来 然后开启电梯.
	 */
    @Override
    public void open() {
        context.setNowState(Context.open);
        context.getNowState().open();
    }


    @Override
    public void close() {
    	System.out.println("Closed. - 电梯Close.");
    }

    @Override
    public void run() {
        context.setNowState(Context.run);
        context.getNowState().run();
    }

    @Override
    public void stop() {
        System.out.println("Stop-电梯停止了");
    }
}


```

# 访问者模式
* 访问者模式是对象的行为模式。访问者模式的目的是封装一些施加于某种数据结构元素之上的操作。一旦这些操作需要修改的话，接受这个操作的数据结构则可以保持不变
* 变量被声明时的类型叫做变量的静态类型(Static Type)，有些人又把静态类型叫做明显类型(Apparent Type)；而变量所引用的对象的真实类型又叫做变量的实际类型(Actual Type)。

```java

//被观察的主体
public interface Subject {

	/**
	 * @Description: 用以注册观察者   - 也就是都有谁来关注这个 可以理解为订阅这个消息
	 * @param o 具体的观察者
	 * @Autor: Jason
	 */
    public void registerObserver(ObserverInf o);

    /**
     * @Description: 用以删除观察者  - 也就会谁会来退订这个所观察的对象  - 可以通俗的理解为退订
     * @param o 具体的观察者
     * @Autor: Jason
     */
    public void removeObserver(ObserverInf o);

    /**
     * @Description: 来通知这个观察者 
     * @Autor: Jason
     */
    public void notifyObservers();
}

//观察者接口 - 可以理解为 订阅者接口 
public interface  ObserverInf {
	
	/**
	 * @Description: 更新数据 - 数据发生改变的时候通知到其他地方.
	 * @param temp  温度
	 * @param humidity 湿度
	 * @param pressure 气压
	 * @Autor: Jason
	 */
	public void update(float temperature, float humidity, float pressure);

}

//消息的发布方式
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
            System.out.println("3,天气预报：温度正在持续上升！");
        } else {
            System.out.println("3,天气预报：注意气温下降了，可能有雨！");
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

//发布模式的接口 - 订阅的方式
public interface  DisplayElement {

	/**
	 * @Description: 外观显示方法  - 展示 被观察者 的具体的信息的方法.
	 * @Autor: Jason
	 */
    public void display();
    
    /**
     * @Description:开始同步数据.
     * @Autor: Jason
     */
    public void sysnc();
}


```


# 享元模式  :dog:
* “享”就是分享之意，指一物被众人共享，而这也正是该模式的终旨所在
* 享元模式有点类似于单例模式，都是只生成一个对象来被共享使用。这里有个问题，那就是对共享对象的修改，为了避免出现这种情况，我们将这些对象的公共部分，或者说是不变化的部分抽取出来形成一个对象。这个对象就可以避免到修改的问题。
* 享元的目的是为了减少不会要额内存消耗，将多个对同一对象的访问集中起来，不必为每个访问者创建一个单独的对象，以此来降低内存的消耗。

```java
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


/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月18日 下午2:23:26</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.structure.flyweight;

import cn.ucaner.pattern.structure.flyweight.flyweightAbs.Shape;

/**
* @Package：cn.ucaner.pattern.structure.flyweight
* @ClassName：Circle
* @Description：   <p> Circle </p>
* @Author： - Jason
* @CreatTime：2018年10月18日 下午2:23:26
* @Modify By：
* @ModifyTime：  2018年10月18日
* @Modify marker：
* @version    V1.0
*/
public class Circle extends Shape{

	private String color;

    public Circle(String color){
        this.color = color;
    }

	@Override
	public void draw() {
		System.out.println("Draw a Circle Which Color is " + color +".");
	}

}


/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月18日 下午2:24:40</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.structure.flyweight;

import java.util.HashMap;

import cn.ucaner.pattern.structure.flyweight.flyweightAbs.Shape;

/**
* @Package：cn.ucaner.pattern.structure.flyweight
* @ClassName：DrawFactory
* @Description：   <p> DrawFactory </p>
* @Author： - Jason
* @CreatTime：2018年10月18日 下午2:24:40
* @Modify By：
* @ModifyTime：  2018年10月18日
* @Modify marker：
* @version    V1.0
*/
public class DrawFactory {

	/**
	 * 定义一个池容器 - 享元池
	 */
    private static HashMap<String,Shape> colorsPool = new HashMap<String,Shape>();

    /**
     * @Description: 获取对象
     * @param color
     * @return Shape
     * @Autor: Jason
     */
    public static Shape getShape(String color){

    	/**
    	 * 需要返回的对象
    	 */
    	Shape  shape  = null;

        if(colorsPool.containsKey(color)){
        	shape = colorsPool.get(color); //外部状态
        }else {
        	shape = new Circle(color); //如果不存在的话创建  放入池子中
        	colorsPool.put(color,shape);
        }
        return shape;
    }

    /**
     * @Description: 获取池的大小
     * @return int   池子大小
     * @Autor: Jason
     */
    public static  int getPoolSize(){
        return colorsPool.size();
    }

}


/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年10月18日 下午2:28:01</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.structure.flyweight;

import cn.ucaner.pattern.structure.flyweight.flyweightAbs.Shape;

/**
* @Package：cn.ucaner.pattern.structure.flyweight
* @ClassName：DrawMain
* @Description：   <p> DrawMain </p>
* @Author： - Jason
* @CreatTime：2018年10月18日 下午2:28:01
* @Modify By：
* @ModifyTime：  2018年10月18日
* @Modify marker：
* @version    V1.0
*/
public class DrawMain {

	public static void main(String[] args) {

		Shape shape1 = DrawFactory.getShape("RED");
        Shape shape2 = DrawFactory.getShape("GREY");
        Shape shape3 = DrawFactory.getShape("GREEN");
        Shape shape4 = DrawFactory.getShape("RED");
        Shape shape5 = DrawFactory.getShape("GREY");
        Shape shape6 = DrawFactory.getShape("GREY");

        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();
        shape5.draw();
        shape6.draw();

        System.out.println("一共绘制了" + DrawFactory.getPoolSize() + "种颜色的圆形.");
	}

}

```


### FAQ

- 设计模式学习

### ENV
- JDK 1.8
- Intellij IDEA 14
- Git
- gitHub
- gitee

## Contact
- QQ:603043194
- E-Mail: jasonandy@hotmail.com

## License
开源协议 [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

#
![](http://upload-images.jianshu.io/upload_images/7802425-bb910b4ae954107a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)