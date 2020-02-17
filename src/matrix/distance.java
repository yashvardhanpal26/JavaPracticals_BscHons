
package matrix;
import java.util.Scanner;


class dist
{
    int feet , inch ;
    dist()
    {
        feet=0;
        inch=0;
        
    }
     dist(int ft, int inc)
    {
        feet=ft;
        inch=inc;
        
    }
 
     void calculate( )
    {
        
        this.feet+=inch/12;
        this.inch= inch%12;
        output();
    }
    void setval(int ft, int inc)
    {
        this.feet=ft;       
        this.inch=inc;
    }
    void output()
    {
         System.out.println("   \n "+ "  standar form is = "+ this.feet + "   feets  "+ this.inch +"  inches ");
    }
    
          
          
}
public class distance 
{
      public static void main (String args[])
      {
           Scanner sc=new Scanner(System.in);
          
        
          int inch,feet;
          System.out.println("enter a number in inch");
          inch = sc.nextInt();
          System.out.println("enter a number in feet");
          feet = sc.nextInt();
          dist obj1= new dist(feet,inch);
          
         System.out.println("for 1st object  ");
         obj1.calculate();
          
          
          
      }
}
