import java.util.*;
public class trustnobody {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){

            int n=sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

            int ans=-1;

            for(int i=0;i<=n;i++)
            {
                int lying=0;
                for(int j=0;j<n;j++)
                {
                    if(i<arr[j])
                    lying++;
                }

                if(i==lying)
                   ans=i;
            }

            System.out.println(ans);

        }
        sc.close();

    }
}
