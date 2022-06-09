package com.liangzi.day04Q;

import java.util.Scanner;

public class Yh {
    /*
    .定义一个用户类，信息有用户 ID、用户密码、 email 地址。
定义一个登录方法：接收参数：email和密码。返回成功失败

的信息
书写main方法：new一个对象，给id 密码 emial赋值，然后调用登录方法，在登录方法中比对传递的信息和当前对象是不是一样，如果一样返回成功，否则返回失败。在main方法中打印登录结果
     */
   public String name;
    public int id;
    public String pwd;
    public String email;

    public void login(String email, String pwd){
        //进行判断；属性中的name 是  this.name;
        if (email.equals(this.email) && pwd.equals(this.pwd)){
            System.out.println("success");
        }else {
            System.out.println("wrong");
        }
    }

    //调用；
    public static void main(String[] args) {
        Yh yh = new Yh();
        yh.email = "aaaa";//th.email;
        yh.pwd = "aaaa";//this.email;
        yh.login("aaaa","aaa");
    }
}
