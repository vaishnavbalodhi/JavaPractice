import java.util.*;
class waterflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int w=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(w+(y*z)<x) System.out.println("Unfilled");
            else if(w+(y*z)>x) System.out.println("Overflow");
            else System.out.println("Filled");
            }
            sc.close();
        }
    }
