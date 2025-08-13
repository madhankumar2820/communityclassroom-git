
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        for(int i=1;i<=n;i++){
          for(int c=1;c<=n-i+1;c++){
            System.out.print("* ");
          }
          System.out.println("");
        }
    }
}
