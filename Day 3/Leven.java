import java.util.Scanner;

public class Leven {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String s=Integer.toString(a);
        System.out.println(s.charAt(b-1));
    }
}
