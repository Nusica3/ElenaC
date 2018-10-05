/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equation;
import java.util.Scanner;
/**
 *
 * @author nusica33
 */
public class Equation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     double a = 1, b =5, c = 1;
        
                  double result = b * b - 4.0 * a * c;
        if(result > 0.0) {
            double root1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double root2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        

        
        
            
        }
    }
    
}
