import java.util.*;
class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int r=0;
            while(n>0){
                r=(r*10)+n%10;
                n=n/10;
            }
            System.out.println(r);
        }
        sc.close();
    }
}
