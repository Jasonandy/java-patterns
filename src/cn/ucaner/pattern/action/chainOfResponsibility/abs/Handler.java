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
package cn.ucaner.pattern.action.chainOfResponsibility.abs;

/**
* @Package：cn.ucaner.pattern.action.chainOfResponsibility.abs   
* @ClassName：Handler   
* @Description：   <p> 责任链模式 </p>
* @Author： -  
* @CreatTime：2017年10月26日 下午1:39:52   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
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
