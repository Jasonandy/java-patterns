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
package cn.ucaner.pattern.create.prototype.prototypeAbs;

import java.util.ArrayList;

/**
* @Package：cn.ucaner.pattern.create.prototype.prototypeAbs   
* @ClassName：BaseMessage   
* @Description：   <p>BaseMessage </p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:43:48   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public abstract class BaseMessage {
    //发件人
    private String send;
    //收件人
    private String receiver;
    //消息
    private String message;

    private ArrayList<String> imgList=new ArrayList<>();

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

    /**
    *发送消息
    *作者:Mirsfang
    *日期:2017/3/8/下午12:33
    *描述:
    **/
    public void sendMessage(){
        System.out.println(getReceiver()+getMessage()+"     充气娃娃图片数量"+getImgList().size()+"     发件人"+getSend());
    }
}
