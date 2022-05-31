
import java.util.Scanner;
class Colours {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int a[]=new int[3];
            int b[]=new int[3];
            int c[]=new int[3];
            for(int j=0;j<3;j++){
                a[j]=sc.nextInt();
            }
            for(int j=0;j<3;j++){
                b[j]=sc.nextInt();
            }
            for(int j=0;j<3;j++){
                c[j]=sc.nextInt();
            }
            int count=0;
            while(a[0]<n || b[1]<n || c[2]<n){
                if(b[0]>0){
                    if(a[1]>0){
                        a[0]++;
                        a[1]--;
                        b[0]--;
                        b[1]++;
                        count++;
                    }
                    else {
                        a[0]++;
                        a[2]--;
                        b[0]--;
                        b[2]++;
                        count++;
                    }
                }
                if(c[0]>0){
                    if(a[2]>0){
                        a[0]++;
                        a[2]--;
                        c[0]--;
                        c[2]++;
                        count++;
                    }
                    else {
                        a[0]++;
                        a[1]--;
                        c[0]--;
                        c[1]++;
                        count++;
                    }
                }
                if(a[1]>0){
                    if(b[0]>0){
                        a[0]++;
                        a[1]--;
                        b[0]--;
                        b[1]++;
                        count++;
                    }
                    else {
                        a[2]++;
                        a[1]--;
                        b[2]--;
                        b[1]++;
                        count++;
                    }
                }
                if(c[1]>0){
                    if(b[2]>0){
                        b[1]++;
                        b[2]--;
                        c[1]--;
                        c[2]++;
                        count++;
                    }
                    else {
                        c[0]++;
                        c[1]--;
                        b[0]--;
                        b[1]++;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
