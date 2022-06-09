package com.liangzi.day04Q;

/*

 */
public class circle {
    double r;

    public void getarea(double r){
        double area = 3.14* r *r;
        System.out.println(area);
    }

    public void getPer(double r){
        double per = 2* 3.14 *r;
        System.out.println(per);
    }

    public static void main(String[] args) {
        circle aa = new circle();
        aa.getarea(1.0);
        aa.getPer(1.0);
    }
}
