/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcode;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dash
 */
public class Search_Insert_Position {
    
 static int r;

    public static void main(String[] args) {
      int [] nums;
      int target = 0;
      nums = new int[5];
      nums[0]=1;
      nums[1]=3;
      nums[2]=5;
      nums[3]=6;
 
      
      Scanner s = new Scanner(System.in);
      target = s.nextInt();
      
     
        for (int i = 0; i < nums.length; i++) {
            if (target==nums[i]) {
                r = i;
                 System.out.println("pos: " + r);
            }
             if(target<nums[i]){
                r=r+1;
                 System.out.println("menor: " + r);
            }
             if (target>nums[i]) {
                 r=r-1;
                  System.out.println("mayor: " + r);
            }
           
          
        }
      
    }
    
}
