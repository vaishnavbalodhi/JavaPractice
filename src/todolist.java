import java.util.*;
class todolist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int c=0;
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int j = 0; j < a.length; j++) {
                a[j]=sc.nextInt();
                if(a[j]>=1000) c++;
            }
            System.out.println(c);
        }
        sc.close();
    }
}
