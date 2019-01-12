package Warsztaty_1;

import java.util.Scanner;

import static java.lang.Math.random;

public class Main1 {
    public static void main(String[] args) {
        game();
    }
    static void game(){
        int goal = randomInt();

        System.out.println("Komputer wylosował liczbę od 1 do 100, zgadanij jaką");

        boolean status = false;
        int result=0;

        while(!status) {

            System.out.print("Podaj liczbę: ");
            result++;

            Scanner scan = new Scanner(System.in);
            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("podaj liczbę");
            }
            int choice = scan.nextInt();

            if (choice == goal) {
                status = true;
                System.out.println("Tak to liczba " + choice + " . Twój wynki to " + result + " podejść.");
            } else if (choice > goal) {
                System.out.println("liczba jest za duża");
            } else {
                System.out.println("liczba jest za mała");
            }
        }


    }
    static int randomInt(){
        return (int) (Math.random()*100+1);
    }
}
