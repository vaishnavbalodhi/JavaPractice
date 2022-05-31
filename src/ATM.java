import java.util.*;
import java.text.DecimalFormat;

class ATM {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat(".00");
            int X = sc.nextInt();
            double Y = sc.nextDouble();
            if (X % 5 == 0 && X+0.50 < Y)
                Y=Y-(double)X-0.50d;
            System.out.printf(df.format(Y));
            sc.close();
    }
        
}
