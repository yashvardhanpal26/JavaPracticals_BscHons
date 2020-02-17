package matrix;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user1
 */
import java.util.Scanner;
public class prime 
{
    
        static void isprime(int n)
     {     
         int temp=0;
         boolean result = true ;
         for (int i=2; i<=n/2;i++)
         {
           temp=n%i;
           if(temp==0)
           {
               result= false;
               break;
           }
         }
         if (result== true)
         {
             System.out.println("entered  number is a prime number ");
         }
         else 
         {
             System.out.println("entered  number is not a prime number");
         }
     
         
            
     }
        
        
        
        
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
        int  number;
        System.out.println("enter  a  number");
        number=sc.nextInt();
        if (number!=0&&number!=1 )
        {
              isprime(number);
        }
        else 
        {
            System.out.println("entered  number is not a prime number");
        }
      
    }   
    
     
}
