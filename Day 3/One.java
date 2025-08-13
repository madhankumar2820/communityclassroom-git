
import java.util.Scanner;

public class One{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=0;
        int b=1;
        int c = sc.nextInt();
        System.out.print(a+" ");
        for(;c>0;c--){
          int temp= b;
          b +=a;
          a=temp;
          System.out.print(a+" ");
        }
    }
}