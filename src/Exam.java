import java.util.*;

class Exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int dragon[]=new int[3];
            int sloth[]=new int[3];
            int sd=0;
            int ss=0;
            for(int j=0;j<3;j++){
                dragon[j]=sc.nextInt();
                sd=sd+dragon[j];
            }
            for(int k=0;k<3;k++){
                sloth[k]=sc.nextInt();
                ss=ss+sloth[k];
            }
            if(sd>ss)
                System.out.println("DRAGON");
            else if(ss==sd){
                if(dragon[0]>sloth[0])
                    System.out.println("DRAGON");
                else if(dragon[0]==sloth[0]){
                    if(dragon[1]>sloth[1])
                    System.out.println("DRAGON");
                    else if(dragon[1]==sloth[1]){
                        if(dragon[2]>sloth[2])
                        System.out.println("DRAGON");
                        else if(dragon[2]==sloth[2]){
                            System.out.println("TIE");
                        }
                        else 
                        System.out.println("SLOTH");
                    }
                    else 
                    System.out.println("SLOTH");
                }
                else 
                System.out.println("SLOTH");
            }
            else
                System.out.println("SLOTH");
        }   
        System.out.println();
        sc.close();
    }
}

