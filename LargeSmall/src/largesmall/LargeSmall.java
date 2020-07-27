/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largesmall;

/**
 *
 * @author apple
 */

import java.util.Scanner;

public class LargeSmall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner userinput = new Scanner (System.in);
        
        int num1 = 0, num2 = 0, num3 = 0, large = 0, small = 0;
        
        System.out.print("Enter First Number: ");
        num1 = userinput.nextInt();
        
        System.out.print("Enter Seond Number: ");
        num2 = userinput.nextInt();
        
        System.out.print("Enter Third Number: ");
        num3 = userinput.nextInt();
        
        large = num1;
        small = num1;
        
        if(num2 > large){
            large = num2;
        }
        if(num3 > large){
            large = num3;
        }
        
        if(num2 < small){
            small = num2;
        }
        if(num3 < small){
            small = num3;
        }
        System.out.println(large + " is large than " + small);
    }
    
}
