
import java.util.Scanner;

public class Three{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<a;i++){
           if(a%i==0){
            System.out.println("regual");
            flag=false;
            break;
           }
           
           
        }if(flag)System.out.println("prime");
    }
}