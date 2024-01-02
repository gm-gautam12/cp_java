/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class greeting
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  while(t-->0){
	      int n=sc.nextInt();
	      int [][]arr=new int[n][2];
	      ArrayList<Integer>al=new ArrayList<>();
	      for(int i=0;i<n;i++){
	          arr[i][0]=sc.nextInt();
	          arr[i][1]=sc.nextInt();
	          al.add(arr[i][1]);
	      }
	      
	      Arrays.sort(arr,(a,b)->a[0]-b[0]);
	      Collections.sort(al);
	      long ans=0;
	      
	      for(int i=0;i<n;i++){
	          int idx = Collections.binarySearch(al,arr[i][1]);
	          al.remove(idx);
	          ans+=idx;
	      }
	      
	      System.out.println(ans);
	  }

	  sc.close();
	}
}
