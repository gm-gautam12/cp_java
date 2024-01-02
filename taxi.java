/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class taxi
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		
	        Arrays.sort(arr);
	        int taxi=1,k=0;
	        
	        int i=n-1;
	        while(k!=i)
	        {
	            if(arr[i]+arr[k]<=4)
	            {
	                arr[i]+=arr[k];
	                k++;
	            }
	            else{
	                i--;
	                taxi++;
	            }
	        }
	        System.out.println(taxi);
            sc.close();
	}
}
