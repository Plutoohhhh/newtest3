package com.company;

import java.util.Iterator;

public class ComputerCollege411 implements College411 {
    Department411[] department411s;
    int count = 0;
    public ComputerCollege411(){
        department411s = new Department411[5];
        addDepartment("JAVA","JAVA");
        addDepartment("C++","C++");
        addDepartment("C#","C#");

    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department411 department411 =new Department411(name,desc);
        department411s[count] = department411;
        count++;

    }

    @Override
    public Iterator createIterator() {
        return (Iterator) new ComputerCollegeIterator411(department411s);
    }
}
