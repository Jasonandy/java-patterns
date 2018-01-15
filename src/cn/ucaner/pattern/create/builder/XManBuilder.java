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
package cn.ucaner.pattern.create.builder;


/**
 * x战警builder
 * @author Chayne_Shen 2017/3/9 0009.
 */

public interface XManBuilder {
    XManBuilder buildXFactor();
    XManBuilder buildLover();
    XMan buildXman();
}
