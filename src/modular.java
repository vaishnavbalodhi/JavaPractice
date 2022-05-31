import java.util.*;

class modular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int high = 0;
            for (int j = 0; j < n; j++) {
                int s=0;
                for (int k = 0; k < n; k++) {
                    s = a[j] + a[k] + (Math.floorMod((a[j] - a[k]) , Math.abs(m)));
                    if (high < s)
                        high = s;
                }
            }
            System.out.println(high);
        }
        sc.close();

    }
}
