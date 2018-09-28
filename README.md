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
*
*

# 建造者模式
*
*

# 原型模式
*
*

# 适配器模式
*
*

# 代理模式
*
*

# 外观模式
*
*

# 桥接模式
*
*

# 组合模式
*
*

# 享元模式
*
*


# 责任链模式
* 抽象处理者(Handler)角色：定义出一个处理请求的接口。如果需要，接口可以定义 出一个方法以设定和返回对下家的引用。这个角色通常由一个Java抽象类或者Java接口实现。上图中Handler类的聚合关系给出了具体子类对下家的引用，抽象方法handleRequest()规范了子类处理请求的操作。
* 具体处理者(BossHandler)角色：具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家。由于具体处理者持有对下家的引用，因此，如果需要，具体处理者可以访问下家。


# 命令模式
* 将一个请求封装为一个对象，从而让我们可用不同的请求对客户进行参数化；对请求排队或者记录请求日志，以及支持可撤销的操作。命令模式是一种对象行为型模式，其别名为动作(Action)模式或事务(Transaction)模式。
*  命令模式的定义比较复杂，提到了很多术语，例如“用不同的请求对客户进行参数化”、“对请求排队”，“记录请求日志”、“支持可撤销操作”等，在后面我们将对这些术语进行一一讲解

# 观察者模式
* 在对象之间定义了一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象会收到通知并自动更新
* 其实就是发布订阅模式，发布者发布信息，订阅者获取信息，订阅了就能收到信息，没订阅就收不到信息

# 状态模式
* 定义对象间的一种一对多的依赖关系,当一个对象的状态发生改变时,所有依赖于它的对象都得到通知并被自动更新。允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类
* 1.一个对象的行为取决于它的状态,并且它必须在运行时刻根据状态改变它的行为。
* 2.一个操作中含有庞大的多分支的条件语句，且这些分支依赖于该对象的状态。


# 访问者模式
* 访问者模式是对象的行为模式。访问者模式的目的是封装一些施加于某种数据结构元素之上的操作。一旦这些操作需要修改的话，接受这个操作的数据结构则可以保持不变
* 变量被声明时的类型叫做变量的静态类型(Static Type)，有些人又把静态类型叫做明显类型(Apparent Type)；而变量所引用的对象的真实类型又叫做变量的实际类型(Actual Type)。

# 享元模式  :dog:
* “享”就是分享之意，指一物被众人共享，而这也正是该模式的终旨所在
* 享元模式有点类似于单例模式，都是只生成一个对象来被共享使用。这里有个问题，那就是对共享对象的修改，为了避免出现这种情况，我们将这些对象的公共部分，或者说是不变化的部分抽取出来形成一个对象。这个对象就可以避免到修改的问题。
* 享元的目的是为了减少不会要额内存消耗，将多个对同一对象的访问集中起来，不必为每个访问者创建一个单独的对象，以此来降低内存的消耗。



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