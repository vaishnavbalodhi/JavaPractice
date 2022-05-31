//Program to print sum of first and last digits
import java.util.*;
public class Sumofdig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int last=n%10;
            int temp=n;
            int c=0;
            while(temp>0){
                c++;
                temp=temp/10;
            }
            int first=n/((int)Math.pow(10, c-1));
            System.out.println(first+last);
        }
        sc.close();
    }
}
