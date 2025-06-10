import java.util.Scanner;

public class BasicPrograms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        welcomeMessage();
        addTwoNumbers(scanner);
        celsiusToFahrenheit(scanner);
        areaOfCircle(scanner);
        volumeOfCylinder(scanner);
        calculateSimpleInterest(scanner);
        perimeterOfRectangle(scanner);
        powerCalculation(scanner);
        averageOfThreeNumbers(scanner);
        kilometersToMiles(scanner);

        scanner.close();
    }

    public static void welcomeMessage() {
        System.out.println("Welcome to Bridgelabz!");
    }

    public static void addTwoNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Sum = " + (a + b));
    }

    public static void celsiusToFahrenheit(Scanner scanner) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    public static void areaOfCircle(Scanner scanner) {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void volumeOfCylinder(Scanner scanner) {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
    }

    public static void calculateSimpleInterest(Scanner scanner) {
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time: ");
        double time = scanner.nextDouble();
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }

    public static void perimeterOfRectangle(Scanner scanner) {
        System.out.print("Enter Length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter Width: ");
        double width = scanner.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }

    public static void powerCalculation(Scanner scanner) {
        System.out.print("Enter Base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter Exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }

    public static void averageOfThreeNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + average);
    }

    public static void kilometersToMiles(Scanner scanner) {
        System.out.print("Enter distance in kilometers: ");
        double km = scanner.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Distance in miles: " + miles);
    }
}
