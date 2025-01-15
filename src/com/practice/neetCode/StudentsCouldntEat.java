package com.practice.neetCode;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int studentsWanting0 = 0;
        int studentsWanting1 = 0;

        for(int i:students){
            if(i==0)
                studentsWanting0++;
            else
                studentsWanting1++;
        }

        for(int j:sandwiches){
            if(j == 0){
                if(studentsWanting0 > 0)
                    studentsWanting0--;
                else{
                    break;
                }
            }else{
                if(studentsWanting1 > 0)
                    studentsWanting1--;
                else{
                    break;
                }
            }
        }

        return studentsWanting0+studentsWanting1;

    }
}

public class StudentsCouldntEat {

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.countStudents(new int[]{1,1,0,0}, new int[]{0,1,0,1}));
    }
}
