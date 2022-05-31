import java.util.*;
class max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int m=Math.max(a,b);
            int m1=Math.max(m, c);
            int m2=Math.max(m1, d);
            System.out.println(m2);
        }
        sc.close();
    }
}
