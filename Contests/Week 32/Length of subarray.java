/*
Leet Code Week 32 Contest 

Longest Sub array
*/

import java.util.*;
import java.io.*;

public class Solution {
   
  public static void main(String[] args){
  
    int[] a = {2,4765,5,8098,990,150};
  
  findUnsortedSubarray(a);
  
  
  }
  
  
 public static void findUnsortedSubarray(int[] nums) {
        
        int[] dummy = new int[nums.length];
        int len = nums.length;
        
   		System.arraycopy( nums, 0, dummy, 0, nums.length );
   		
   		Arrays.sort(dummy);
   
   for(int i=0;i<len;i++){
   
   System.out.println(dummy[i]+" -> "+nums[i] );
   }
   
   		
        int idxLow=0;
        int idxHigh =0;
        int count=0;            
   if(Arrays.equals(dummy,nums)){
     		count =0;
        } else {
     		 System.out.println("Here"+Arrays.equals(dummy,nums));

          for(int i=0;i<len;i++){
            if(nums[i]!=dummy[i]){
            	
            count++;
            }
              }
            
            }
   System.out.println(count);          
 }
       
        }