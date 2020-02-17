/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author user1
 */
import java.util.Scanner;
class Matrix
{
    int row ,column;
    int a[][];
     

    Matrix()
    {
        row=1;
        column=1;
        a=new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                a[i][j]=0;
            }
        }
        
    }       
    Matrix(int r,int c)
    {
        row=r;
        column=c;
        a=new int[row][column];
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                a[i][j]=0;
            }
        }
        
    }
    void values()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
          System.out.println("enter elements of a "+ row + "*"+column +" array \n");

          for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
      void addition(Matrix b)
    {
        int i,j;
        if(row==b.row&&column==b.column)
        {
            int c[][]= new  int[row][column];
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                c[i][j]=a[i][j]+b.a[i][j];
            }
        }  
         for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
               System.out.print(c[i][j]);
               System.out.print("   ");
            }
            System.out.println("");
        }  
        }
        else
        {
             System.out.println("not possible");
        }
       

    }
        void multiplication(Matrix b)
     {
             int i,j,k;
        if(b.row==column)
        {
            int c[][]= new  int[row][b.column];
        for(i=0;i<row;i++)
        {
            for(j=0;j<b.column;j++)
            {
               for(k=0;k<column;k++)
               {
                    c[i][j]+=a[i][k]*b.a[k][j];
               }
            }
        }  
         for(i=0;i<row;i++)
        {
            for(j=0;j<b.column;j++)
            {
               System.out.print(c[i][j]);
               System.out.print("   ");
            }
            System.out.println("");
        }  
        }
        else
        {
            System.out.println(" not possible");
        }
         
     }
        void rotation()
        {
            int i,j,k;
            
            Matrix m =new Matrix(column,row);
            System.out.println(" Clockwise : ");
            for(i=0;i<column;i++ )
           {
            for( j=0, k =column-1;j<row;j++,k--)
            {
                m.a[i][j]=a[k][i];
                
               System.out.print(m.a[i][j]);
               System.out.print("   ");
            }
            System.out.println("");
           } 
            System.out.println("Anti-Clockwise : ");
            for( i=0, k =column-1;i<column;i++,k--)
           {
            for( j=0;j<row;j++)
            {
                m.a[i][j]=a[j][k];
               System.out.print(m.a[i][j]);
               System.out.print("   ");
            }
            System.out.println("");
           } 

        }
        
    
       
}



 public class Matrixdemo 
{
     /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        
        Matrix ob1 = new Matrix(3,3);
         Scanner sc=new Scanner(System.in);

        System.out.println("enter rows and columns  \n");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int i,j;
        Matrix ob2 = new Matrix(row,column);
        ob1.values();
        ob2.values();
        
        System.out.println("...........MENU......... \n");  
        System.out.println("enter 1. FOR addition \n");
        System.out.println("enter 2.FOR multiplication \n");
         System.out.println("enter 3.FOR ROTATION\n");
        int choice=sc.nextInt();
        if(choice==1)
        {
            ob1.addition(ob2);
        }
        else if(choice==2)
        {
              ob1.multiplication(ob2);
        }
        else if(choice==3)
        {
              ob1.rotation();
              ob2.rotation();
        }
        else
        {
            System.out.println("\ninvalid choice \n");
        }
    
        ob1.rotation();
        ob2.rotation();
       
        
         

    }


   
   
}