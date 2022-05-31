import java.util.*;

class zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a[] = new int[n];

            for (int j = 0; j < a.length; j++) {
                a[j] = sc.nextInt();

            }
            Arrays.sort(a);
            int high = a[n - 1];
            int x = 0;
            while (Math.pow(2, x) < high) {
                x++;
            }
            int c=0;
            
            while(x+1>0){
            int f=0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] >= Math.pow(2, x)){
                    a[j] -= ((int) Math.pow(2, x));
                    f=1;
                }
            }
            if(f==1) c++;
            x--;
        }
            System.out.println(c);
        }
        sc.close();
    }
}