package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = new String[] {"Bubblegum", "Toffee", "Ice cream", "Milk chocolate", "Doughnut", "Pancake"};
        double[] prices = new double[] {2, 0.2, 5, 4, 2.5, 3.2};

//        System.out.println("Prices:");
//        for(int i = 0; i < items.length; i++) {
//            System.out.println(String.format("%s: $%f", items[i], prices[i]));
//        }

        double[] earnings = new double[] {202, 118, 2250, 1680, 1075, 80};
        double income = 0;

        System.out.println("Earned amount:");
        for(int i = 0; i < items.length; i++) {
            System.out.printf("%s: $%f\n", items[i], earnings[i]);
            income += earnings[i];
        }
        System.out.printf("\nIncome: $%.1f", income);

        int staffExpenses ;
        while(true) {
            System.out.println("Staff expenses: ");
            if(sc.hasNextInt()) {
                staffExpenses = sc.nextInt();
                if(staffExpenses >= 0) {
                    break;
                }
            }
            sc.nextLine();
            System.out.println("Please provide a valid number!");
        }

        int otherExpenses;
        while(true) {
            System.out.println("Other expenses: ");
            if(sc.hasNextInt()) {
                otherExpenses = sc.nextInt();
                if(otherExpenses >= 0) {
                    break;
                }
            }
            sc.nextLine();
            System.out.println("Please provide a valid number!");
        }

        double netIncome = income - (staffExpenses + otherExpenses);

        System.out.printf("\nNet Income: $%.1f", netIncome);
    }
}