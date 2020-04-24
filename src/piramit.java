import javax.swing.*;
import java.util.Scanner;

public class piramit {

    public static void main(String[] args) {
        Scanner scanIn= new Scanner(System.in);
        System.out.print("Satır sayısı giriniz: ");
        int a = scanIn.nextInt();
        islem(a);
        alt(a);
    }

    public static void islem(int rews) {
        for(int i = 1; i <= rews ; i++) {
            bosluk(rews-i);
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void bosluk(int count) {
        for(int i=1; i <= count ; i++)
            System.out.print(" ");
    }
    public static void alt(int count) {
        for(int i=count-1; i >= 1 ; i--) {
            bosluk(count-i);
            for (int j= i; j >= 1 ; j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
