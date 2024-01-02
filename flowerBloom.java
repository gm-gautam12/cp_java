import java.util.*;
class flowerBloom {

    public static int binarySearch(int []arr,int target){
        int low=0,high=arr.length;
        while(low<high){
            int mid = low+(high-low)/2;

            if(arr[mid]>target)
            high=mid;
            else
            low=mid+1;
        }

        return low;   // basically using lowerbound
    }
    public static int[] fullBloomFlowers(int[][] flowers, int[] people) {

        int n = flowers.length;
        int []start = new int[n];
        int []end = new int[n];

        for(int i=0;i<flowers.length;i++){
            start[i]=flowers[i][0];
             end[i]=flowers[i][1]+1;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int []arr = new int[people.length];
        int index=0;
        for(int time : people){
            int i=binarySearch(start,time);
            int j=binarySearch(end,time);

            arr[index++] = i-j; // how much flower person see
        }

        return arr;
         
    }

    public static void main(String[] args) {
        int [][]flowers  = {{1,6},{3,7},{9,12},{4,13}};

        int []people = {2,3,7,11};

        for(int i:fullBloomFlowers(flowers,people)){
            System.out.print(i+" ");
        }
    }
}