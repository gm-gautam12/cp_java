/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class evenodd
{
    public static long number(long initial,long end,long location){
        
        long count=0;
        long value=0;
        for(long i=initial;i<=end;i++)
        {
            if(count==location){
             value=i;
             break;
            }
            count++;
        }
        return value;
    }
    
    public static long bs(long low,long high,long k)
    {
        long ans=0;
        while(low<=high)
        {
            long mid=(low+high)/2;
            if(mid==k-1){
            ans=mid;
             break;
            }
            else if(mid<k-1)
            low=mid+1;
            else
            high=mid-1;
        }
        return ans;
    }
    
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	Scanner sc=new Scanner(System.in);
	    long n=sc.nextLong();
	     long k=sc.nextLong();
	     long location=0,ans=0;
	     if(n%2==0)
	     {
	         if(k<n/2)
	         {
	             location = bs(0,n/2-1,k);
	              ans=number(0,n/2-1,location);
	             System.out.println(ans);
	         }
	         else{
	             location=bs(n/2,n,k);
	             ans=number(n/2,n,location);
	             System.out.println(ans);
	         }
	     }
	     else{
	         if(k<n/2)
	         {
	             location=bs(0,n/2,k);
	             ans=number(0,n/2,location);
	             System.out.println(ans);
	         }
	         else
	         {
	             location=bs(n/2+1,n,k);
	             ans=number(n/2+1,n,location);
	             System.out.println(ans);
	         }
	     }
         sc.close();
	}
}
