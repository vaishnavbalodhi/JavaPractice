import java.util.*;
class polynomial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int a[]=new int[n];
            
            for (int j = 0; j < a.length; j++) {
                a[j]=sc.nextInt();
                
            }
            int temp=n;
            while(temp>0){
                if(a[temp]!=0){ 
                    System.out.println(temp-1);
                    break;
                }
                temp--;
            }
            
        }
        sc.close();
    }
}
