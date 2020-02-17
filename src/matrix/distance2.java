      
package matrix;
import java.util.Scanner;


class distt
{
    int feet , inch ;
    distt()
    {
        feet=0;
        inch=0;
        
    }
     distt(int ft, int inc)
    {
        feet=ft;
        inch=inc;
        
    }
     distt(distt d)
    {
       this.feet=d.feet;
        this.inch=d.inch;
        
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
public class distance2 
{
      public static void main (String args[])
      {
          Scanner sc=new Scanner(System.in);
          
        
          int inch,feet;
          System.out.println("enter a number in inch");
          inch = sc.nextInt();
          System.out.println("enter a number in feet");
          feet = sc.nextInt();
          distt obj1= new distt(feet,inch);
          distt obj2=obj1;
          distt obj3= new distt(obj1);
         System.out.println("for 1st object  ");
         obj1.calculate();
          System.out.println("for 2nd object  ");
          obj2.calculate();
          System.out.println("for 3rd object");
          obj3.calculate();
          
          
         
         
      }
}
