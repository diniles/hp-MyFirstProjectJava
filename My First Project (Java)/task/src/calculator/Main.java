package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bubblegum = 202;
        int toffee = 118;
        int iceCream = 2250;
        int milkChocolate = 1680;
        int doughnut = 1075;
        int pancake = 80;
        double total = bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;
        System.out.println("Earned amount:");
        System.out.printf("Bubblegum: $%d\n", bubblegum);
        System.out.printf("Toffee: $%d\n", toffee);
        System.out.printf("Ice cream: $%d\n", iceCream);
        System.out.printf("Milk chocolate: $%d\n", milkChocolate);
        System.out.printf("Doughnut: $%d\n", doughnut);
        System.out.printf("Pancake: $%d\n", pancake);
        System.out.printf("\nIncome: $%f\n", total);

        Scanner sc = new Scanner(System.in);
        System.out.println("Staff expenses:");
        int expStuff = sc.nextInt();
        System.out.println("Other expenses:");
        int expOther = sc.nextInt();
        System.out.printf("Net income: $%d\n", (int)total - expStuff - expOther);
    }
}