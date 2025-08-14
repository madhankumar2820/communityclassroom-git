import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0){
            int temp = a%10;
            int result=0;
            int h=result+temp;
            System.out.println(h);
        }
    }
}
