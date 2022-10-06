package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege411 implements College411 {
    List<Department411> department411s;
    public InfoCollege411(){
        department411s = new ArrayList<>();
        addDepartment("信息安全","信息安全");
        addDepartment("网络安全","网络安全");
    }
    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department411 department411 =new Department411(name,desc);
        department411.add(department411);

    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator411(department411s);
    }
}
