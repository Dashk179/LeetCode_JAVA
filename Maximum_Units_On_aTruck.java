/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcode;


import java.util.Scanner;


/**
 *https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-
 * @author Dash
 */
public class Maximum_Units_On_aTruck {
    static int[][] boxTypes;
    static int numberOfBoxes;
    static int numberOfUnitsPerBox;
    static int truckSize;
  


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
       
        System.out.println(S.substring(start,end));
        }
    }
    
