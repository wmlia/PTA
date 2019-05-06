package com.lwm;

import java.util.Scanner;

public class Test1006 {
    //    1006 换个格式输出整数 （15 分）
//    让我们用字母 B 来表示“百”、字母 S 表示“十”，用 12...n 来表示不为零的个位数字 n（<10），
//    换个格式来输出任一个不超过 3 位的正整数。例如 234 应该被输出为 BBSSS1234，因为它有 2 个“百”、3 个“十”、以及个位的 4。
    public static void main(String[] args) {
//        请输入不超过三位的正整数
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while (n<1||n>999){
            n=sc.nextInt();
        }

        int B=n/100;
        int S=n/10%10;
        int G=n%10;

//        输出百
        if(B>0){
            for (int i = 0; i <B ; i++) {
                System.out.print("B");

            }
        }

//        输出十
        if(S>0){
            for (int i = 0; i <S ; i++) {
                System.out.print("S");
            }
        }

//        输出个
        if(G>0){
            for (int i = 0; i <G ; i++) {
                System.out.print(i+1);
            }
        }
    }
}
