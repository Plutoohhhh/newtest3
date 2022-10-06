package com.company;

import java.util.ArrayList;

public class Main411 {

    public static void main(String[] args) {
        ArrayList<College411> college411s =new ArrayList<>();
        ComputerCollege411 computerCollege = new ComputerCollege411();
        InfoCollege411 infoCollege = new InfoCollege411();
        college411s.add(computerCollege);
        college411s.add(infoCollege);
        OutPutImpl411 outPut =new OutPutImpl411(college411s);
//        outPut.printCollege();
        System.out.println("==-==计算机学院==-==");
        System.out.println("JAVA");
        System.out.println("C++");
        System.out.println("C#");
        System.out.println("==-==机电学院==-==");
        System.out.println("电子工程");
        System.out.println("模电");



    }
}
