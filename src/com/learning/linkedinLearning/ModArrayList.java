package com.learning.linkedinLearning;

import java.util.ArrayList;

public class ModArrayList<E> extends ArrayList<E> {

   public E getUsingMod(int index){

        int newIndex = Math.abs(index);

        if(newIndex > super.size()){
            newIndex = newIndex % super.size();
            return super.get(newIndex);
        }else{
            return super.get(newIndex);
        }
    }
}
