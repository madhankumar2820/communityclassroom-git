import java.util.Scanner;

public class One{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if(a>0){
            System.out.println("safe to play");
         } 
         else{
            System.out.println("too cold");
         }
        sc.close();
    }
}
