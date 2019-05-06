package com.lwm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1004 {
    public static void main(String[] args) {
//        1004 成绩排名 （20 分）
//        读入 n（>0）名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。
//
//        输入格式：
//        每个测试输入包含 1 个测试用例，格式为
//
//        第 1 行：正整数 n
//        第 2 行：第 1 个学生的姓名 学号 成绩
//        第 3 行：第 2 个学生的姓名 学号 成绩
//  ... ... ...
//        第 n+1 行：第 n 个学生的姓名 学号 成绩
//        其中姓名和学号均为不超过 10 个字符的字符串，成绩为 0 到 100 之间的一个整数，这里保证在一组测试用例中没有两个学生的成绩是相同的。
//
//        输出格式：对每个测试用例输出 2 行，第 1 行是成绩最高学生的姓名和学号，第 2 行是成绩最低学生的姓名和学号，字符串间有 1 空格。
//
//        输入样例：
//        3
//        Joe Math990112 89
//        Mike CS991301 100
//        Mary EE990830 95
//        输出样例：
//        Mike CS991301
//        Joe Math990112

//        定义一个集合，存放学生信息
        ArrayList<Student> arr=new ArrayList<Student>();

//        定义一个变量，记录几个学生
//        键盘录入
        Scanner sc=new Scanner(System.in);

//        System.out.println("请输入你要查询的学生个数：");
        int num=sc.nextInt();

//        System.out.println("请输入学生信息");
//        遍历存入学生信息
        for (int i = 0; i <num ; i++) {

            String name=sc.next();
            String no=sc.next();
            int grade=sc.nextInt();
            Student student=new Student(name,no,grade);
            arr.add(student);
        }
//        定义最高成绩和最低成绩
        Student st=(Student)arr.get(0);
        int big=st.getGrade();
        int small=st.getGrade();;

//        记录最高学生字符串
        String bigStudent=st.getName()+" "+st.getNo();
        String smallStudent=st.getName()+" "+st.getNo();

//        遍历学生信息
        for (int i = 0; i <arr.size() ; i++) {
            Student student=(Student)arr.get(i);
            if (big<student.getGrade()){
                big=student.getGrade();
                bigStudent=student.getName()+" "+student.getNo();
            }
            if(small>student.getGrade()){
                small=student.getGrade();
                smallStudent=student.getName()+" "+student.getNo();
            }
        }

        System.out.println(bigStudent);
        System.out.println(smallStudent);

    }
}


class Student{
    private String name;

    private String no;

    private int grade;

    public Student(String name, String no, int grade) {
        this.name = name;
        this.no = no;
        this.grade = grade;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}