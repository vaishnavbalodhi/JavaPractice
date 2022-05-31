import java.util.Scanner;

class Add 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the times to add different 2 numbers: ");
        int n=sc.nextInt();
        int A, B;
        for(int i=0;i<n;i++)
        {
            A=sc.nextInt();
            B=sc.nextInt();
            System.out.println(A+B);
        }
        sc.close();
    }    
}
