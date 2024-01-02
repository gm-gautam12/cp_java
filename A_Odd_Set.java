import java.util.*;
public class A_Odd_Set{

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        int []arr=new int[2*n];
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        int even=0,odd=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            even++;
            else
            odd++;
        }

        if(even==odd)
        System.out.println("YES");
        else
        System.out.println("NO");
     }
        sc.close();
    }
}