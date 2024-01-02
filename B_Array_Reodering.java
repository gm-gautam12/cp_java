/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class B_Array_Reodering{
    
    public static int gcd(int a,int b)
    {
        if(b==0)
        return a;
        return gcd(b,a%b);
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
          ArrayList<Integer>al=new ArrayList<>();
          for(int i=0;i<n;i++)
          {
              if(arr[i]%2==0)
              al.add(arr[i]);
          }
          
          for(int i=0;i<n;i++)
          {
              if(arr[i]%2!=0)
              al.add(arr[i]);
          }
            
            int count=0;
            
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++)
                {
                    if(gcd(al.get(i),2*al.get(j))>1)
                    count++;
                }
            }
             System.out.println(count);
        }
        sc.close();
    }
}
