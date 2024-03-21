import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Mary";

        int age = 31;
        double x = 10.35784;
        double income = 4000.00;

        System.out.println(x);
        System.out.printf("%.2f%n", x); /*formatted form*/

        Locale.setDefault(Locale.US); /*Change the locale to US*/
        System.out.printf("%.2f%n", x);

        System.out.println("Result = " + x + " inches");
        System.out.printf("Result = %.4f inches%n", x);

        System.out.printf("%s is %d years old and has an income of %.2f dollars%n", name, age, income);

        /* -------------- Practice -------------- */

        String product1 = "Computer";
        String product2 = "Office desk";

        int _age  = 30;
        int code =  5290;
        String gender = "F";

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:%n%s, which price is $ %.2f%n%s, which price is $ %.2f%n%n", product1, price1, product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %s%n%n", _age, code, gender);

        System.out.printf("Measure with eight decimal places: %.8f%nRounded (three decimal places): %.3f", measure, measure);

        System.out.printf(Locale.US, "%nUS decimal point: %.3f%n", measure);

        /* -------------- Casting example -------------- */

        int b;
        int B;
        int h;
        double area;

        b = 3;
        B = 2;
        h = 5;

        area = (double) (b + B) / 2 * h;

        System.out.println(area);

        /* -------------- Input example -------------- */

        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        System.out.println("You wrote: " + word);

        int number;

        number = sc.nextInt();
        System.out.println("Number: " + number);

        double doubleNumber;

        doubleNumber = sc.nextDouble(); /*Locale is counted here, so, Locale.setDefault should be considered*/
        System.out.println("Double: " + doubleNumber);

        char character;

        character = sc.next().charAt(0); /*Takes the first position*/
        System.out.println("Character: " + character);

        String j = sc.next();
        int k = sc.nextInt();
        double l = sc.nextDouble();

        System.out.println("Data: ");
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);

        /* -------------- Read text up to the line break -------------- */

        /*If there is a reading of another type, it will leave a line break pending that will be absorbed by the first nextLine later on, so a trick to also read an integer would be to add another nextLine alone*/
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("String 3: " + s3);

        /* -------------- Mathematical functions -------------- */
        double n1 = 3.0;
        double n2 = 4.0;
        double n3 = -5.0;
        double N1, N2, N3;

        N1 = Math.sqrt(n1);
        N2 = Math.sqrt(n2);
        N3 = Math.sqrt(25.0);
        System.out.println("Square root of: " + n1 + " = " + N1);
        System.out.println("Square root of: " + n2 + " = " + N2);
        System.out.println("Square root of: 25 = " + N3);

        N1 = Math.pow(n1, n2);
        N2 = Math.pow(n1, 2.0);
        N3 = Math.pow(5.0, 2.0);
        System.out.println(n1 + " raised to the " + n2 + " = " + N1);
        System.out.println(n1 + " raised to square = " + N2);
        System.out.println("5 raised to square = " + N3);

        N1 = Math.abs(n2);
        N2 = Math.abs(n3);
        System.out.println("Absolute value of " + n2 + " = " + N1);
        System.out.println("Absolute value of " + n3 + " = " + N2);

        /* -------------- Simple Conditional Structure -------------- */

        int hour = 6;

        if (hour >= 6){
            System.out.println("Good Morning!");
        }

        /* -------------- Composed Conditional Structure -------------- */

        System.out.println("What time is it? ");
        hour = sc.nextInt();

        if(hour < 12) {
            System.out.println("Good Morning!");
        } else {
            System.out.println("Good afternoon!");
        }

        /* -------------- Chaining of conditional structures -------------- */

        System.out.println("What time is it? ");
        hour = sc.nextInt();

        if(hour < 12) {
            System.out.println("Good Morning!");
        } else if (hour < 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Goodnight!");
        }

        /* -------------- Switch Case -------------- */

        /*Exercise - make a program to read an integer value from 1 to 7 representing a day of the week (where 1 = Sunday and so on). Write the corresponding day of the week on the screen*/

        System.out.println("Enter the day: ");
        int weekDay = sc.nextInt();
        String day;

        switch (weekDay) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid value!";
                break;
        }

        System.out.println("Day of week: " + day);

        /* -------------- ternary expression -------------- */

        double price = 34.5;
        double discount = 0;
        discount = (price < 20) ? discount * 0.1 : discount * 0.5;

        System.out.println(discount);

        sc.close();
    }
}