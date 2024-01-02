import java.util.*;
public class suminmatrix {
    public static  int matrixSum(int[][] nums) {
        int count=0,sum=0;
        
        int max=nums[count][0];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums[i].length;j++)
            {
                if(nums[i][j]>=max)
                {
                    max=nums[i][j];
                }
            }
            sum+=max;
            count++;
        }
        return sum;
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]nums=new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            nums[i][j]=sc.nextInt();
        }
        
        System.out.println(matrixSum(nums));
        sc.close();
    }
}
