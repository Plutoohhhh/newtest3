package com.company;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator411 implements Iterator {
    List<Department411> department411s;
    int position = -1;
    public InfoCollegeIterator411(List<Department411> department411s){
        this.department411s = department411s;
    }
    @Override
    public boolean hasNext() {
        if(position >= department411s.size()-1){
            return false;
        }else {
            position++;
            return true;
        }
    }

    @Override
    public Object next() {
        Department411 department411 = department411s.get(position);
        return department411;
    }

    @Override
    public void remove() {

    }
}
