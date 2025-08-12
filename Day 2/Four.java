
import java.util.*;

public class Four {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int f;
    f=(int)Math.ceil(d/60.);
    int g=f-b;
    int first=a*b;
    int h=g*c;
    int total=first+h;
    System.out.println("total:"+total);
   }
}
