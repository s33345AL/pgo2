import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cenapodstawowa = 40;
        System.out.println("Podaj wiek: ");
        int wiek = sc.nextInt();
        System.out.println("Czy mieszkasz w Warszawie: ");
        String miejsce = sc.next();
        System.out.println("Podaj dzień tygodnia: ");
        String dzien = sc.next();
        double znizka = 0;
        double nowacena = cenapodstawowa - ((cenapodstawowa * znizka)/100);


        if (dzien == "czwartek" || dzien == "Czwartek") {
            znizka = 100;


            if (miejsce.equals("tak")) {
                znizka = znizka + 10;

                if (wiek < 10) {
                    znizka = 100;
                } else if (wiek >= 10 && wiek <= 18) {
                    znizka = znizka + 50;

                    if (znizka > 100) {
                        znizka = 100;
                    }

                }
            }
        }
        System.out.println(nowacena);
    }
}