import java.util.Scanner;
class Elections {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a>50 || b>50 || c>50){
                if(a>b && a>c){
                    System.out.println(a);
                }
                else if(b>a && b>c){
                    System.out.println(b);
                }
                else if(c>b && a<c){
                    System.out.println(c);
                }
                else
                    System.out.println("NOTA");
            }
            else
                System.out.println("NOTA");
        }
        sc.close();
    }
}