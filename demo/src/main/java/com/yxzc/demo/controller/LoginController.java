package com.yxzc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/11/29/029.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String index(){
        return "login";
    }

    @RequestMapping(value = "/relolve")
    public String resolve(MultipartFile file){

        try {
            InputStream inputStream = file.getInputStream();


        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @RequestMapping(value = "/encode")
    public String encode(MultipartFile file){

        try {
            InputStream inputStream = file.getInputStream();
            //方法：定义数组，循环读取
            //定义一个保存数据的数组
            byte[] bytes = new byte[64];//把所有的数据读取到这个字节当中
            //声明一个int ，用来存储每次读取到的数据
            int i = 0 ;
            //定义一个记录索引的变量
            int index = 0;
            //循环读取每个数据
            while ((i=inputStream.read())!=-1){

            }

            new BufferedReader(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
