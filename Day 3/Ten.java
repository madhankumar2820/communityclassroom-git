import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        
        for(int i=1;i<=a;i++){
            count=count+(i*i);
           
        }
        System.out.println(count);
    }
}
