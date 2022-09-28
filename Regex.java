/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dash
 */
public class Regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       
       String entrada = "2 + 2";
       
       String patron = "\\d+\\.\\d";
       Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(entrada);
        
        while (matcher.find()) {            
            System.out.println("hay un decimal");
        }
    }
    
}
