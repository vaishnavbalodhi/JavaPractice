import java.util.*;
class Fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int f=1;
            while(n>0){
                f=f*n;
                n--;
            }
            System.out.println(f);
        }
        sc.close();
    }
}
