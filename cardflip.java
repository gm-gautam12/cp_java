/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class cardflip
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int []arr=new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int m=sc.nextInt();
		    int []arr2=new int[m];
		    for(int i=0;i<m;i++)
		    arr2[i]=sc.nextInt();
		    
		    int ans=0;
		    for(int i=0;i<m;i++)
		    {
		     ans=((ans+arr2[i])%n);   
		    }
		    
		    System.out.println(arr[ans]);
		}
        sc.close();
	}
}
