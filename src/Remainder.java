import java.util.*;
public class Remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a%b);
        }
        sc.close();
    }
    
}
