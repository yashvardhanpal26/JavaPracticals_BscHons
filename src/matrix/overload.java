/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;
import java.util.Scanner;



public class overload 
{
    
    static void display(float  i)
    {
         System.out.println(" inside float " + i);
    }
    static void display (long i)
    {
        System.out.println(" inside long " + i);
    }
    static void display (int i)
    {
        System.out.println(" inside int " + i);
    }
    static void display (double i)
    {
        System.out.println(" inside double " + i);
    }
   
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        display('r');
        display(48.23);
        display(48);
        display(1.0f);
        display(1);
      
        
    }
    
    
}
