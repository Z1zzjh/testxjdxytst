package com.zjh.testxjdxytst.callback;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Coding {
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class TreeNode2 {

    int val;
    List<TreeNode2> sonNode = new ArrayList<>();

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    //    TreeNode left;
//    TreeNode right;

//    public int getVal() {
//        return val;
//    }
//
//    public void setVal(int val) {
//        this.val = val;
//    }
//
//    public TreeNode getLeft() {
//        return left;
//    }
//
//    public void setLeft(TreeNode left) {
//        this.left = left;
//    }
//
//    public TreeNode getRight() {
//        return right;
//    }
//
//    public void setRight(TreeNode right) {
//        this.right = right;
//    }
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
}
class Solution1 {
//    List<int[]> nodeList = new ArrayList<>();
//    public List<List<Integer>> verticalTraversal(TreeNode root) {
//        dfs(root,0,0);
//        Collections.sort(nodeList, new Comparator<int[]>() {
//            public int compare(int[] tuple1, int[] tuple2) {
//                if (tuple1[0] != tuple2[0]) {
//                    return tuple1[0] - tuple2[0];
//                } else if (tuple1[1] != tuple2[1]) {
//                    return tuple1[1] - tuple2[1];
//                } else {
//                    return tuple1[2] - tuple2[2];
//                }
//            }
//        });
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//        int size = 0;
//        int lastcol = Integer.MIN_VALUE;
//        for (int[] tuple : nodeList) {
//            int col = tuple[0], row = tuple[1], value = tuple[2];
//            if (col != lastcol) {
//                lastcol = col;
//                ans.add(new ArrayList<Integer>());
//                size++;
//            }
//            ans.get(size - 1).add(value);
//        }
//        return ans;

//        for (int i = 0;i< nodeList.size();i++){
//            nodeList.get(i);
//        }
//        return nodeList;
//}




    public void dfs(TreeNode2 treeNode){
        if(treeNode==null){
            return;
        }
        System.out.println(treeNode.val);
        TreeNode2 treeNode3= new TreeNode2();

        for(int i = 0;i<treeNode.sonNode.size();i++){

            dfs(treeNode.sonNode.get(i));
        }
    }
}


class Runnnnn2{
    public static void main(String[] args) {
        TreeNode2 treeNode2 = new TreeNode2();
        TreeNode2 treeNode21 = new TreeNode2();
        TreeNode2 treeNode211 = new TreeNode2();
        treeNode211.setVal(5);
        TreeNode2 treeNode212 = new TreeNode2();
        treeNode212.setVal(6);
        treeNode21.setVal(2);
        TreeNode2 treeNode22 = new TreeNode2();
        treeNode22.setVal(3);
        TreeNode2 treeNode23 = new TreeNode2();
        treeNode23.setVal(4);
        treeNode2.setVal(1);
        treeNode2.sonNode.add(treeNode21);
        treeNode2.sonNode.add(treeNode22);
        treeNode2.sonNode.add(treeNode23);
        treeNode21.sonNode.add(treeNode211);
        treeNode21.sonNode.add(treeNode212);

        Solution1 solution1 = new Solution1();
        solution1.dfs(treeNode2);
    }
}


class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min = 0;
        int max = 0;


        int num = 0;
       for(int i = 0;i<nums.length-2;i++){
           if(nums[i]==nums[i+1]){
               num++;
           }else break;
       }

       if(nums.length>3){
           for(int i = 0;i<nums.length-1;i++){
               if(nums[i]>nums[i+1]){
                   if(nums[i+1]<nums[0]){
                       min = 0;
                   } else if(nums[i+1]==nums[0]){
                       min = num+1;
                   }else {
                       min = i;
                       break;
                   }
               }
               continue;
           }
       }else if (nums.length==3){
           if(nums[1]>nums[2]){
               min=1;
           }
       }else if(nums.length==2){
           if(nums[0]>nums[1]){
               min=0;
           }
       } else if(nums.length == 1)return 0;

        for(int j = nums.length-1;j>=1;j--){
            if(nums[j]<nums[j-1]){
                if(nums[j-1]>nums[nums.length-1]){
                    max = nums.length-1;
                }else {
                    max = j;
                    break;
                }

            }
        }
        if(max!=min){
            return max-min+1;
        }else return 0;

    }
}
class Runnnnn{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,3,4,5,2};
        int x = solution.findUnsortedSubarray(nums);

        System.out.println(x);
//        for(int i=0;i<3;i++){System.out.println("mua");}
    }
}