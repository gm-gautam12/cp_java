public class alternateArray {
    
     public static void rearrange(long arr[], int n){
        
        // Your code here
        long max=arr[n-1]+1;
        
        int i=0,j=n-1;
       while(i<=j)
       {
           long p=0;
         //  long q=arr[j];
         if(i%2==0){
            p=(max*arr[j]+arr[i])%max;
           arr[i]=(max*arr[j]+arr[i])/max;
           
         }
         else
           arr[i+1]=(max*p+arr[i])/max;
           i++;
           j--;
       }
        
    }

    public static void main(String[] args) {
        long []arr={1,2,3,4,5,6};
        int n=6;
        rearrange(arr,n);
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}
