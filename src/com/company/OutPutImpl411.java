package com.company;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl411 {
    private List<College411> college411List;
    public OutPutImpl411(List<College411> college411List){
        this.college411List = college411List;
    }
    public void printCollege(){
        Iterator<College411> iterator = college411List.iterator();
        while (iterator.hasNext()){
            College411 college411 =iterator.next();
            System.out.println("==-=="+ college411.getName()+"==-==");
            printDepartment(college411.createIterator());
        }
    }

    private void printDepartment(Iterator iterator) {
        while (iterator.hasNext()){
            Department411 next = (Department411) iterator.next();
            System.out.println(next.getName());
        }
    }
}
