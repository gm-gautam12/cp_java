import java.util.*;
public class differencearray{

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();

        List<List<Integer>> v= new ArrayList<>();
        
        for(int i=1;i<=m;i++)
        {
             int l=sc.nextInt()-1;
             int r=sc.nextInt()-1;
             int d=sc.nextInt();
             v.add(List.of(l,r,d));
        }

        int []ps=new int[m+1];
        for(int i=1;i<=k;i++)
        {
            int l=sc.nextInt()-1;
            int r=sc.nextInt()-1;
            ps[l]++;
            ps[r+1]--;
        }
        long []t=new long[n+1];
        long sum=0;

        for(int i=0;i<m;i++)
        {
            sum+=ps[i];
            t[v.get(i).get(0)]+=v.get(i).get(2)*sum;
            t[v.get(i).get(1)+1]-=v.get(i).get(2)*sum; 
        }

        sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=t[i];
            t[i]=sum;
            System.out.print(t[i]+a[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}