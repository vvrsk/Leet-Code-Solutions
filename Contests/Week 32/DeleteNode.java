/*

Leet Code - Week 32 
Delete a  node / kill process Java
credits- Leet Code Solutions - 

*/


import java.util.*;
import java.io.*;

 
 public class Solution {

 
   
  public static void main(String[] args){
  
    List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,3,10,5));
    
    List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(3,0,5,3));
    
    killProcess(l1,l2,3);
   
  
  }
   
  
   public static void killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        
      
     // Store process tree as an adjacency list
    Map<Integer, List<Integer>> adjacencyParentLists = new HashMap<>();
    for (int i=0;i<ppid.size();i++) {
        adjacencyParentLists.putIfAbsent(ppid.get(i), new LinkedList<>());
        adjacencyParentLists.get(ppid.get(i)).add(pid.get(i));
    }
    
    // Kill all processes in the subtree rooted at process "kill"
    List<Integer> res = new LinkedList<>();
    Stack<Integer> stack = new Stack<>();
    stack.add(kill);
    while (!stack.isEmpty()) {
        int cur = stack.pop();
        res.add(cur);
        List<Integer> adjacencyChildList = adjacencyParentLists.get(cur);
        if (adjacencyChildList == null) continue;
        stack.addAll(adjacencyChildList);
    }
    //return res; 
    System.out.println(res);
   
   
   } 
 }
