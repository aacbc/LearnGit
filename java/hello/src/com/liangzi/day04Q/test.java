package com.liangzi.day04Q;

public class test {
    String name;
    int id;
    String email;
    String pwd;

    public void login(String emal,String pwd){
        if (email.equals(this.email) && pwd.equals(this.pwd)){
            System.out.println("success");
        }else{
            System.out.println("wrong");
        }
    }

    public static void main(String[] args) {
        test aa = new test();
        aa.email = "aaaa";
        aa.pwd = "aaaa";
        aa.login("aaaa","aaaa");
    }
}
