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

        /* -------------- Practice ---------------- */

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

        /* -------- Casting example -------- */

        int b;
        int B;
        int h;
        double area;

        b = 3;
        B = 2;
        h = 5;

        area = (double) (b + B) / 2 * h;

        System.out.println(area);

        /* ------- Input example --------- */

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

        /* ------ Read text up to the line break ------- */

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("String 3: " + s3);

        sc.close();

    }
}