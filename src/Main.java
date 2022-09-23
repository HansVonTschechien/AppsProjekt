import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your application:");

        int price = 0;

        boolean shopEnd = false;
        boolean calcEnd = false;
        boolean numEnd = false;
        boolean yearEnd = false;
        boolean appEnd = false; //all end


        while (!appEnd) {


            System.out.println("1:Shop");
            System.out.println("2:Calculator");
            System.out.println("3:Number Sort");
            System.out.println("4:Year is Leap");
            System.out.println("5:End");
            int appCase = sc.nextInt();


            System.out.println("  ");
            switch (appCase) {
                case 1:
                    shopEnd = false;
                    while (!shopEnd) {
                        System.out.println("Welcome to our store: ");
                        System.out.println("1:Drinks");
                        System.out.println("2:Food");
                        System.out.println("3:Payment");

                        int appCaseShop = sc.nextInt();


                        switch (appCaseShop) {

                            case 1:
                                System.out.println("What would you like to drink?: ");
                                System.out.println("1:Cola (35kc)");
                                System.out.println("2:Magnesia (25kc)");
                                System.out.println("3:Pilsen 12  (45kc)");
                                System.out.println("4:Radegast 12  (40kc)");
                                int sD = sc.nextInt();

                                if (sD == 1) {
                                    price += 35;
                                } else if (sD == 2) {
                                    price += 25;
                                } else if (sD == 3) {
                                    price += 45;
                                } else {
                                    price += 40;
                                }
                                break;

                            case 2:

                                System.out.println("What would you like to eat?: ");
                                System.out.println("1:Candle sauce (200kc)");
                                System.out.println("2:Steak with fries (190kc)");
                                System.out.println("3:Fried Camembert with fries (140kc) ");
                                System.out.println("4:Garlic soup (85kc)");
                                int sF = sc.nextInt();

                                if (sF == 1) {
                                    price += 200;
                                } else if (sF == 2) {
                                    price += 190;
                                } else if (sF == 3) {
                                    price += 140;
                                } else {
                                    price += 85;
                                }
                                break;

                            case 3:
                                System.out.println(price);
                                shopEnd = true;
                                break;

                        }
                    }

                    break;
                case 2:
                    //Calculator
                    calcEnd = false;
                    while (!calcEnd) {
                        System.out.println("Enter the first number: ");
                        double numF = sc.nextDouble();

                        System.out.println("Enter the second number: ");
                        double numS = sc.nextDouble();

                        System.out.println("Enter the operation");
                        System.out.println("For addition + ");
                        System.out.println("For subtraction - ");
                        System.out.println("For multiplication * ");
                        System.out.println("For division / : ");

                        char op = sc.next().charAt(0);

                        if (op == '+') {
                            System.out.println("The summation of " + numF + " and " + numS + " = " + (numF + numS));
                        } else if (op == '-') {
                            System.out.println("The subtraction of " + numF + " and " + numS + " = " + (numF - numS));
                        } else if (op == '*') {
                            System.out.println("The multiplication of " + numF + " and " + numS + " = " + (numF * numS));
                        } else if (op == '/') {
                            System.out.println("The division of " + numF + " and " + numS + " = " + (numF / numS));
                        } else {
                            System.out.println("Invalid Input");
                        }

                        System.out.println("You want to continue?");
                        String again = sc.next().trim().toLowerCase();


                        if (again.startsWith("a")) {
                            continue;
                        } else {
                            calcEnd = true;
                        }
                    }
                    break;


                case 3:
                    //Number Sort
                    numEnd = false;
                    while (!numEnd) {
                        System.out.println("Enter how many numbers you want to sort: ");
                        int arrL = sc.nextInt();
                        int[] array = new int[arrL];
                        System.out.println("Enter the numbers you want to sort: ");
                        for (int i = 0; i < arrL; i++) {
                            array[i] = sc.nextInt();
                        }
                        System.out.println(" ");
                        Arrays.sort(array);
                        System.out.print("Sorted numbers: ");
                        for (int i = 0; i < arrL; i++) {
                            System.out.print(array[i] + " ");
                        }
                        System.out.println("  ");

                        System.out.println("You want to continue?");
                        String againN = sc.next().trim().toLowerCase();

                        if (againN.startsWith("a")) {
                            continue;
                        } else {
                            numEnd = true;
                        }
                    }

                    break;
                case 4:
                    //Leap Year
                    yearEnd = false;
                    while (!yearEnd) {
                        System.out.println("Enter a year to find a leap year: ");

                        int year;


                        year = sc.nextInt();


                        if ((year % 400 == 0)
                                || ((year % 4 == 0) && (year % 100 != 0))) {


                            System.out.println(year + " : Leap Year");
                        } else {

                            System.out.println(year + " : Non - Leap Year");
                        }
                        System.out.println("  ");

                        System.out.println("You want to continue?");
                        String againY = sc.next().trim().toLowerCase();

                        if (againY.startsWith("a")) {
                            continue;
                        } else {
                            yearEnd = true;
                        }
                    }
                    break;

                case 5:
                    appEnd = true;
                    break;


            }

        }


    }
}
