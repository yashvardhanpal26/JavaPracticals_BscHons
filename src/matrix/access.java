package matrix;

 
class specify
{
    
             public int x;      //can be called anywhere in the program
            private    final int y;   //can be called only inside the class in which it has been declared also its value cannot be changed throughout the program due to final keyword
            
            specify(int x,int y)
            {
                this.x =x;
                this.y =y;
            }
            void changeob(specify ob)
            {
                ob.x+=ob.y;
                System.out.println("inside change function value is  "+ ob.x);
                
            }
            void changevar(int a,final int b)
            {
               // b+=this.x;                     "error because final keyword is used with variable b";
                a+=b;
                System.out.println("inside function value of x= "+ a);
            }
                    
}
public class access 
{
    
  
    public static void main(String args[])
    {
        specify sp=new specify(10,20);
         specify sp2=new specify(2,2);
        int c=9,d=4;
        System.out.println("values of varible before passing "+c +" and  "+d);
        sp.changevar(c, d);
        System.out.println("values of variaables after passing = " +c +" and  "+d); //it remains same as varibles are passed by values(only there copy is passed )
        
        
        System.out.println("values of object before passing  " + sp.x + " and "/* sp.y */ );    //variable y cannot be called outside the class specify, as it is a private member but x can be ,as it is a public member 
        sp2.changeob(sp);
        System.out.println("values after change " + sp.x );  // it changes because object is passed as reference 
        
    }
            
    
}
