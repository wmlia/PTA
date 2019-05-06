package com.lwm;

import java.util.Scanner;

public class Test1002 {
    public static void main(String[] args) {
//        1002 写出这个数 （20 分）
//        读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。

        //要输入的正整数n
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

//        计算各位数之和
        int sum = 0;
        int[] arr = getInts(n);


//        计算整数数组各位和
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

//        System.out.println(sum);

        int[] du = getInts(sum);

//        输出du
//        System.out.println("----------");
//        for (int i = 0; i <du.length ; i++) {
//            System.out.print(du[i]);
//        }
//        System.out.println();
//        System.out.println("----------");

//        调用方法去读数字
        for (int i = 0; i < du.length; i++) {
           if(i!=du.length-1){
               duShuZi(du[i]);
               System.out.print(" ");
           }else{
               duShuZi(du[i]);
           }
        }



    }

//    读数字的方法
    private static void duShuZi(int m) {
        switch (m) {
            case 0:
                System.out.print("ling");
                break;
            case 1:
                System.out.print("yi");
                break;
            case 2:
                System.out.print("er");
                break;
            case 3:
                System.out.print("san");
                break;
            case 4:
                System.out.print("si");
                break;
            case 5:
                System.out.print("wu");
                break;
            case 6:
                System.out.print("liu");
                break;
            case 7:
                System.out.print("qi");
                break;
            case 8:
                System.out.print("ba");
                break;
            case 9:
                System.out.print("jiu");
                break;
            default:
                System.out.println("你输错误了");
                break;
        }
    }

//    将整数转化为数组
    private static int[] getInts(long n) {
        //        将正整数转化为字符串
        String s = String.valueOf(n);

        char[] ss = new char[s.length()];

//        将字符串转化为char数组
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ss[i] = s.charAt(i);
        }

//        将char数组转化为整数数组
        for (int i = 0; i < ss.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(ss[i]));
        }
        return arr;
    }
}
