package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Kérem adja meg a téglalap 'a' oldalát(cm) : ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Kérem adja meg a téglalap 'b' oldalát(cm) : ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Adja meg mit akar kiszámolni (K: kerület, T: terület)");
        String muvelet = sc.nextLine();
        if (muvelet.equals("K")){
            double kerulet = 2* (a + b);
            System.out.printf("A téglalap kerülete %.2f cm", kerulet);
        }else if (muvelet.equals(("T"))){
            double terulet = a * b;
            System.out.printf("A téglalap területe %.2f cm^2\n", terulet);
        }else{
            System.out.println("Hibás műveletet adott meg! ");
        }
        if (a == b){
            System.out.println("A megadott téglalap egy négyzet ");
        }
    }
}
