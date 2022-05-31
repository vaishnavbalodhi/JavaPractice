import java.util.*;
public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            int s=0;
            while(t>0){
                int d=t%10;
                s=s+d;
                t=t/10;
            }
            System.out.println(s);
        }
        sc.close();
    }
}
