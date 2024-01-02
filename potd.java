public class potd {
    public static void main(String[] args) {
        int n=10;
        int b=0,d=0,t=0,s=0;

        while(d<n){
            if(d!=0 && d%7==0){
                b++;
                s=b;
            }

            s++;
            t+=s;
            d++;
        }

        System.out.println(t);
    }
}
