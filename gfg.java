public class gfg {
    
    static int maxIndexDiff(int arr[], int n) {
        // code here
        
        int i=0,j=n-1;
        int max=0;
        
        
        while(i<=j)
        {
            if(arr[j]>=arr[i])
            {
                max=Math.max(max, (j-i));
                i++;
                j=n-1;
            }
            else
            j--;
        }
        
        return max;
        
    }

    public static void main(String[] args) {
        int n=14;
        int []arr={47, 46, 14, 1, 29, 44, 19, 30, 48, 47, 17, 36, 41, 44};
        System.out.println(maxIndexDiff(arr,n));
    }
}
