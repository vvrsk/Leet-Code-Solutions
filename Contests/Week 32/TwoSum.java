/*
Leet Code Week 32

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

My Solution => O(n2)

*/
//My solution
import java.util.*;
import java.io.*;

 
public class Solution {
  
  public static void main(String[] args){
  
    //String s1 = "Hello!";
    //String s2 = "hello";
    int a[] = {1,2,3,4};
    int target = 5;
  	twoSum(a,target);
  }
   
  public static void twoSum(int[] nums, int target) {
        
        List<Integer> res= new ArrayList<Integer>();
        Map<Integer, List<Integer>> hm = new HashMap<>();
        
        for(int i =0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){ // i+1 to remove self adding -> to include self adding put i
                hm.putIfAbsent(nums[i]+nums[j],new ArrayList<Integer>());
				hm.get(nums[i]+nums[j]).add(i);
				hm.get(nums[i]+nums[j]).add(j);
            }
        }
        
        res = hm.get(target);
		System.out.println(res);
 } 
 
 /*
 //O(n) Solution - Beauty!!!
 
 public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(tracker.containsKey(nums[i])){
                int left = tracker.get(nums[i]);
                return new int[]{left+1, i+1};
            }else{
                tracker.put(target - nums[i], i);
            }
        }
        return new int[2];
    }
 
 */