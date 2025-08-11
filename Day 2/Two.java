import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.nextLine();
        
        A=A.toLowerCase();
        if(A.equals("scissor")){
            System.out.println("rock");
        
        }
        else if(A.equals("rock")){
            System.out.println("paper");
        }
        else if(A.equals("paper")){
            System.out.println("scissor");
        }
        else{
            System.out.println("invalid input");
        }
    }
}
