import java.util.*;
class GoodPairs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int c=0;
            int n=sc.nextInt();
            int A[]=new int[n];
            int B[]=new int[n];
            for (int j = 0; j < B.length; j++) {
                A[j]=sc.nextInt();
            }
            for (int j = 0; j < B.length; j++) {
                B[j]=sc.nextInt();
            }
            for (int i2 = 0; i2 < n; i2++) {
                for (int j = 0; j < n; j++) {
                    if(i2<j){
                        if(A[i2]==B[j] && B[i2]==A[j]){
                            c++;
                        }
                    }
                }
            }
            System.out.println(c);
        }
        sc.close();
    }
}
