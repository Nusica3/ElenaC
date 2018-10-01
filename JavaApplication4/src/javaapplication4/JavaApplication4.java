/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author nusica33
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String greet = "Elena";
        String greet2 = "Ciumacova";
        String message = "My name is " + greet + "" + greet2 + "!";
        System.out.println (message);
        
    double price = 23;
    double tax = 56;
    int quantity = 89;
    double total;
    String message1 = "I want to buy " + quantity + " shirt";
    total = price * quantity * tax;
    System.out.println  ("Total cost with tax is " + total);
    
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter a string");
    String str = sc.nextLine();
    System.out.println ("String has been entered");
    
    int abc = sc.nextInt();
    
            System.out.println ("int has been entered.\n");
            System.out.println ("String you entered: " + str);
            System.out.println ("int you entered:" + abc);
    
    
            
        
    }
    
}
