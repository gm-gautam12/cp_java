class Solution {
    public static int minimumMoves(String s) {
        int n=s.length();
        char []ch=s.toCharArray();
        boolean flag=false;
        for(int i=1;i<n;i++){
        if(ch[i-1]=='0' && ch[i]=='0')
        flag=true;
        else
        flag=false;
        }

        if(flag==true)
        return 0;
        else 
        return n/2;
    }
    public static void main(String[] args) {
        String str="0000";
        System.out.println(minimumMoves(str));
    }
}