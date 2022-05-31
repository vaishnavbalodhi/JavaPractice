import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z') System.out.println("Upper case character");
        else System.out.println("Lower case character");
        sc.close();
    }
}
