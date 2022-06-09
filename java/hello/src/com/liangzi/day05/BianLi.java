package com.liangzi.day05;

import java.util.Scanner;

public class BianLi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] names = new String[5];
        for (int i = 0 ; i < names.length; i ++ ){
            names[i] = "zz" + i;
        }

        for (int i = 0 ; i < names.length; i ++){
            System.out.println(names[i] + i);
        }

        student [] st = new student[5];
        for (int i= 0; i<st.length;i++){
            st[i] = new student("z2" + i,i*10);
        }
        for (student sss :st){
            sss.instro();
        }

    }
}
