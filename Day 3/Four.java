import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char ch=sc.next().charAt(0);
        if( ch>='a' && ch<='z'){
        System.out.println("lower case");
        }
        else{
            System.out.println("upper case");
        }
    }
}
