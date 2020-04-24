import javax.swing.*;
import java.util.Scanner;

public class piramit {

    public static void main(String[] args) {
        Scanner scanIn= new Scanner(System.in);
        System.out.print("satır sayısıgiriniz: ");
        int a = scanIn.nextInt();
        islem(a);
    }
    public static void islem(int rews) {
        for(int i = 1; i <= rews ; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
