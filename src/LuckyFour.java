//program to calculate frequency of number 4 in an integer
import java.util.Scanner;
class LuckyFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int c=0;
            while(n>0){
                if(n%10==4){
                    c++;
                }
                n=n/10;
            }
            System.out.println(c);
        }
        sc.close();
    }
}
