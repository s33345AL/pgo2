import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cenapodstawowa = 40;

        System.out.println("Podaj wiek: ");
        int wiek = sc.nextInt();
        System.out.println("Czy mieszkasz w Warszawie: ");
        String miejsce = sc.next();
        System.out.println("Podaj dzień tygodnia: ");
        String dzien = sc.next();
        int znizka = 0;
        int cenakoncowa = cenapodstawowa;

        if (wiek < 10) {
            znizka = 100;
            cenakoncowa = 0;
        } else {
            if (wiek >= 10 && wiek <= 18) {
                znizka = 50;
                cenakoncowa = 20;
            }
            if (miejsce.equals("tak")){
                znizka = 10;
                cenakoncowa = cenakoncowa - (cenapodstawowa * znizka)/100;
                if (wiek >= 10 && wiek <= 18 && miejsce.equals("tak")) {
                    znizka = znizka + 50;
                }
            }
            if (dzien.equals("czwartek")  || dzien.equals("Czwartek")) {
                znizka = 100;
                cenakoncowa = 0;
            }
        }
        System.out.println(cenakoncowa + " " + znizka);
    }
}