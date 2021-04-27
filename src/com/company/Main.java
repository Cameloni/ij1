package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        double a;
        double b;
        double c;
        while(choice != 5){
            System.out.println("menu");
            System.out.println("1 - pole kwadratu");
            System.out.println("2 - pole koła");
            System.out.println("3 - pole trapezu");
            System.out.println("4 - pole trójkąta");
            System.out.println("5 - wyjście");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("bok");
                    a = sc.nextDouble();
                    System.out.println(a * a);
                    break;
                case 2:
                    System.out.println("promień");
                    a = sc.nextDouble();
                    System.out.println(a * a * 3.14159265);
                    break;
                case 3:
                    System.out.println("podstawa 1");
                    a = sc.nextDouble();
                    System.out.println("podstawa 2");
                    b = sc.nextDouble();
                    System.out.println("wysokość");
                    c = sc.nextDouble();
                    System.out.println((a + b) * c / 2);
                    break;
                case 4:
                    System.out.println("podstawa");
                    a = sc.nextDouble();
                    System.out.println("wysokość");
                    b = sc.nextDouble();
                    System.out.println(a * b / 2);
                    break;
                case 5:
                    System.out.println("Auf Wiedersehen!");
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
                    break;
            }
        }

    }
}
