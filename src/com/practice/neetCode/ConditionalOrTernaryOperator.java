package com.practice.neetCode;

public class ConditionalOrTernaryOperator {

    public static void main(String[] args){
        int[] nums = new int[]{-1,-2,-3,-4,-5};
        int target = -8;
        int index1;
        int indexVal;
        int[] solution = new int[2];

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if (nums[i] + nums [j] == target){
                    solution[0] = i;
                    solution[1] = j;
                }
            }
        }

        System.out.println(solution[0] + "," +solution[1]);
    }
}
