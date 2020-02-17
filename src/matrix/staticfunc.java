/*
 * to show the use use of static function
 */
package matrix;

class count
{
    static int sum=0;
    static void showsum(int...s)
    {
        for (int i : s)
        {
            sum+=i;
        }
        System.out.println("sum of numbers = "+sum);
    }
}
/**
 *
 * @yashvardhan 
 */

public class staticfunc 
{
    public static void main(String args[])
    {
        count ob=new count();
        count.showsum(9,6,4,8,2,3);
        ob.showsum(2,5,6,6);
        
        
    }
    
    
    
}
