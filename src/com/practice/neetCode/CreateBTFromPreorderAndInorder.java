package com.practice.neetCode;

import java.util.ArrayList;
import java.util.List;

public class CreateBTFromPreorderAndInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildHelper(preorder, 0, inorder, 0, inorder.length-1);
    }

    private TreeNode buildHelper(int[] preorder, int pStart, int[] inorder, int iStart, int iEnd){

        List<Integer> eachList = new ArrayList<Integer>();

        if(pStart > preorder.length-1 || iStart > iEnd)
            return null;

        TreeNode root = new TreeNode(preorder[pStart]);

        int mid = getIndexOfValueInArray(inorder, root.val);

        root.left = buildHelper(preorder, pStart+1, inorder, iStart, mid-1);
        root.right = buildHelper(preorder, pStart+mid-iStart+1, inorder, mid+1, iEnd);



        return root;

    }

    private int getIndexOfValueInArray(int[] nums, int value){
        int i = 0;
        for(int k : nums){
            if(k == value)
                break;
            else
                i++;
        }
        return i;
    }

    public static void main(String[] args){
        CreateBTFromPreorderAndInorder obj = new CreateBTFromPreorderAndInorder();
        obj.inorder(obj.buildTree(new int[]{1,2,3}, new int[]{3,2,1}));
    }

    private void inorder(TreeNode root) {
            if (root == null) {
                System.out.println("null");
                return;
            }
            System.out.println(root.val);
            inorder(root.left);
            inorder(root.right);
        }
    }

