package com.company;

import java.util.Iterator;

public class ComputerCollegeIterator411 implements Iterator {
    Department411[] department411s;
    int position = 0;
    public ComputerCollegeIterator411(Department411[] department411s){
        this.department411s = department411s;
    }
    public boolean hasNext(){
        if(position >= department411s.length || department411s[position] == null){
            return false;
        }
        return true;
    }
    public Object next(){
        Department411 department411 = department411s[position];
        position++;
        return department411;
    }
    public void remove(){

    }
}
