
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class ChefFD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            Integer a[]=new Integer[n];
            int s=0;
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            Arrays.sort(a, Collections.reverseOrder());
            for(int j=0;j<n;j++){
                s=s+a[j];
                if(s>=x){
                    System.out.println(j+1);
                    break;
                }
            }
            if(s<x) System.out.println(-1);
        }
        sc.close();
    }
}
