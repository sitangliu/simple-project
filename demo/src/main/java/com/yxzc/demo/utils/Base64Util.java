package com.yxzc.demo.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.Logger;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2018/11/29/029.
 */
public class Base64Util {

    //解码编码集
    private static final String charset = "UTF-8";
    private static final int BASELENGTH  = 255;
    private static final int LOOKUPLENGTH = 64;
    private static final int TWENTYFOURBITGROUP  = 24;

    /**
     * 解密
     * @param data  解密数据
     * @return
     */
    public static String decode(String data){
        if(null == data){
            return null;
        }
        try {
            return new String(Base64.decodeBase64(data.getBytes(charset)),charset);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 加密
     * @param data  加密数据
     * @return
     */
    public static String encode(String data){

        try {
            if(null == data){
                return null;
            }
            return new String(Base64.encodeBase64(data.getBytes(charset)),charset);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
