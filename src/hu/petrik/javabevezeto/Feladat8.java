package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        System.out.println("Kérem adja meg a tippjét (0 - fej || 1 - írás): ");
        Scanner sc= new Scanner(System.in);
        int tipp = sc.nextInt();


        int feldobas =(int) (Math.random()  * 2);
        String Feldob= (feldobas == 0) ? "fej" : "írás" ;
        System.out.printf("A dobás eredménye %s. ", Feldob);
        if (tipp== feldobas){
            System.out.println("Gratulálok! ");
        }else{
            System.out.println("Nem nyert :( ! ");
        }
    }
}
