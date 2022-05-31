import java.util.Scanner;

public class para {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String n=sc.nextLine();
        System.out.println(greet(n));

        sc.close();
    }
    public static String greet(String name){
        String s="hello "+name;
        return s;
    }
}
