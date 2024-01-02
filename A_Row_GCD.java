// intution: there is a property in array gcd that gcd(arr[0],arr[1],arr[2])== gcd(arr[0],arr[1]-arr[0],arr[2-arr[1]]);
// the same logic will work here and in that case we only need to add m integers one by one to all array
// so we will sort the array first so that gcd should not get negative elements.
// the we will precalculate the gcd of all elements except the first one and then by
// using it we will calculate our answer


import java.util.*;
public class A_Row_GCD{

    public static long gcd(long a,long b)
    {
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        long []arr=new long[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextLong();

        Arrays.sort(arr);
        long ans=0;
        for(int i=1;i<n;i++)
           ans=gcd(ans, arr[i]-arr[0]);

           for(int i=0;i<m;i++)
           {
              long k=sc.nextLong();
              System.out.print(gcd(arr[0]+k,ans)+" ");

           }


        sc.close();
    }
}