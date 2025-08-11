import java.util.Scanner;

public class Javanine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
         int b= sc.nextInt();
        System.out.printf("the number of students in each team is %d and left out is %d ",a/b,a%b);
        sc.close();
    }
}
