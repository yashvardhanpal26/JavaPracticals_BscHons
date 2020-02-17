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

public class bin_to_deci
{
        static int dec_bin(int dec)
     {     
     int bin,a=1;
     bin =dec;
    
      while(bin>0)
    {
      if(bin%2==0)
      {
          a=(a*10)+0;
      }
      else
      {
          a= (a*10)+1;
      }
      bin=bin/2;
    }
      while(a>=10)
     {
      bin=(bin*10) +(a%10);
      a=a/10;
     }
    return bin;
     }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
        int bin , deci;
        System.out.println("enter  a DECIMAL number");
        deci=sc.nextInt();
        bin=dec_bin(deci);
        System.out.println(" "+ "binary number = "+ bin );
        
        
    }

    
}