import java.io.*;
import java.util.*;
class He
{
    public static void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int h[]=new int[n];
        int n1=ob.nextInt();
        for(int i=0;i<=n;i++)
        {
            h[i]=ob.nextInt();
        }
       /* for(i=0;i<=n;i++)
        {
            Array.short(h[i]); 
            
        }*/
        Arrays.sort(h);
        System.out.println(h[n-4]);
        System.out.println(h[n1]);
    }
}
