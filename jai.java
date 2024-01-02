/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class jai
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    String str=sc.next();
		    
		    int []freq=new int[27];
		    for(int i=1;i<=26;i++){
		        freq[i]=i;
		    }
		    
		    
		    for(int i=0;i<n;i++){
		        int index=str.charAt(i)-'A';
		         freq[index+1]--;
		    }
		    
		    int count=0;
		    for(int i=0;i<freq.length;i++){
		        if(freq[i]==0)
		        count++;
		    }
		    
		    System.out.println(count-1);
		 
		}
	}
}
