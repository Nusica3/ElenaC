/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutes;
import java.util.Scanner;

public class Minutes {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
       
        System.out.println("Enter nr of minutes: ");
        int Min = sc.nextInt();
        int Years = Min/252600;
        int Days = (Min % 252600)/1440;
        System.out.println((int) Min + " minutes is aproximatelly " + Years + " Year and " + Days + " days ");
        
     
        
    }
    
}
