package com.lwm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1011 {
    public static void main(String[] args) {
//        1011 A+B 和 C （15 分）
//        给定区间 [−2
//​31
//​​ ,2
//​31
//​​ ] 内的 3 个整数 A、B 和 C，请判断 A+B 是否大于 C。
//
//        输入格式：
//        输入第 1 行给出正整数 T (≤10)，是测试用例的个数。随后给出 T 组测试用例，每组占一行，顺序给出 A、B 和 C。整数间以空格分隔。
//
//        输出格式：
//        对每组测试用例，在一行中输出 Case #X: true 如果 A+B>C，否则输出 Case #X: false，其中 X 是测试用例的编号（从 1 开始）。
//
//        输入样例：
//        4
//        1 2 3
//        2 3 4
//        2147483647 0 2147483646
//        0 -2147483648 -2147483647
//        输出样例：
//        Case #1: false
//        Case #2: true
//        Case #3: true
//        Case #4: false
//        定义你要输入的数组个数
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

//        定义存放数组的集合
        ArrayList<String> arr=new ArrayList<String>();

//        定义三个数字
        long A,B,C;
//        定义返回的结果
        String s;
//        遍历存放集合
        for (int i = 0; i <x ; i++) {
            A=sc.nextInt();
            B=sc.nextInt();
            C=sc.nextInt();
            if(A+B>C){
                s="Case #"+(i+1)+": true";
                arr.add(s);
            }else{
                s="Case #"+(i+1)+": false";
                arr.add(s);
            }
        }

//        遍历输出结果
        for (int i = 0; i <arr.size() ; i++) {
            System.out.println(arr.get(i));
        }
    }
}
