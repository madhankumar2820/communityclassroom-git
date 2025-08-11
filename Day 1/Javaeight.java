
import java.util.Scanner;

public class Javaeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sideSquare = sc.nextInt();
        int lengthRec = sc.nextInt();
        int hightRec = sc.nextInt();
        float radius = sc.nextFloat();

        System.out.println("area of square:"+ sideSquare*sideSquare);
        System.out.println("area of rec:"+ lengthRec*hightRec);
        System.out.printf("area of circle: %.0f",(3.14*(radius*radius)));



    }
}
