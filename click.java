/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class click{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		
		int diff=-1;
		for(int i=1;i<n;i++)
		{
			int ans=(arr[i]-arr[i-1]);
		    if(ans<=d)
		    {
		        diff=arr[i];
		        break;
		    }
		  
		}
		
		System.out.println(diff);
		sc.close();
	}
}
