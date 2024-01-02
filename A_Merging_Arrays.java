import java.util.*;
public class A_Merging_Arrays{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []arr1=new int[n];
        int []arr2=new int[m];
        for(int i=0;i<n;i++)
        arr1[i]=sc.nextInt();
        for(int i=0;i<m;i++)
        arr2[i]=sc.nextInt();

        ArrayList<Integer>al=new ArrayList<>();
        int i=0,j=0;
        int count=0;
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
            {
               count++;
            }
            i++;
            if(i==n-1)
            {
                j++;
                i=0;
            }
            System.out.print(count+" ");
        }

    }
}