/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class sum 
{
    
    public static void main(String args[])
    {
        int c;
        int i,sum=0;
        Scanner sc=new Scanner(System.in);
        c=Integer.parseInt(args[0]);
        System.out.println("number of number to be entered is "+ args[0]);
        System.out.println("enter numbers ");
        int number[]= new int[c];
        for( i=0;i<c;i++)
        {
           number[i] = sc.nextInt();
           sum+=number[i];
        }
        System.out.println("\n "+ sum);
        
    }
    
    
}
