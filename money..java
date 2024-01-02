import java.util.*;
class money {
    public static long maxStrength(int[] nums) {
        
        Arrays.sort(nums);
        long pro1=1;
        int neg=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
                neg++;
        }
        
        if(neg%2!=0)
        {
            for(int i=0;i<=neg-2;i++)
                pro1*=nums[i];
        }
        else
        {
            for(int i=0;i<=neg-1;i++)
                pro1*=nums[i];
        }
        
        long pro2=1;
        for(int i=neg;i<nums.length;i++)
            pro2*=nums[i];
        
        return pro1*pro2;
        
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
         
        System.out.println(maxStrength(arr));

       sc.close();

    }
}