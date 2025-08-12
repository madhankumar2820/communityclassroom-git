import java.util.*;

public class Six{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char day=sc.next().charAt(0);

        switch(day){
        case 'a':
          System.out.println("one");
          break;
        
        case 'b':
         System.out.println("two");
         break;
        case 'c':
         System.out.println("three");
         break;
         default:
         System.out.println("invalid input");
        }
    }
}