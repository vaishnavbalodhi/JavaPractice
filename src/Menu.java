import java.util.Scanner;

class Menu{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String colour=sc.next();
        switch(colour){
            case "red" -> System.out.println("this is red colour");
            case "green" -> System.out.println("this is green colour");
            case "blue" -> System.out.println("this is blue colour");
            case "yellow", "purple", "black" -> System.out.println("some colour");
            default -> System.out.println("invalid choice");
        }
        sc.close();
    }
}