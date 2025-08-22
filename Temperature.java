import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp="";
        double ans=0;
        System.out.println("Choice 1: Celsius to  Fahrenheit");
        System.out.println("Choice 2: Celsius to  Kelvin");
        System.out.println("Choice 3: Fahrenheit to Kelvin");
        System.out.println("Choice 4: Fahrenheit to Celsius");
        System.out.println("Choice 5:Kelvin to Celsius");
        System.out.println("Choice 6:Kelvin to Fahrenheit");
        System.out.println("Choice 7:Exit !");
        System.out.print("Enter the choice : ");
        int choice = sc.nextInt();
        while (choice!=7){
            switch (choice) {
                case 1:
                    System.out.println("Enter the temperature in Celsius:");
                    double far = sc.nextDouble();
                    ans= (9.0 / 5.0 * far) + 32;
                     temp="Fahrenheit";
                    break;
                case 2:
                    System.out.println("Enter the temperature in Celsius:");
                    double kel = sc.nextDouble();
                     ans = kel + 273.15f;
                    temp="Kelvin";
                    break;
                case 3:
                    System.out.println("Enter the temperature in Fahrenheit:");
                    double farh = sc.nextDouble();
                    ans = (5.0 / 9.0 * (farh - 32)) + 273.15f;
                    temp="Kelvin";
                    break;
                case 4:
                    System.out.println("Enter the temperature in Fahrenheit:");
                    double a = sc.nextDouble();
                    ans = 5.0 / 9.0 * (a - 32);
                    temp="Celsius";
                    break;
                case 5:
                    System.out.println("Enter the temperature in Kelvin:");
                    double b = sc.nextDouble();
                    ans = b - 273.15f;
                    temp="Celsius";
                    break;
                case 6:
                    System.out.println("Enter the temperature in Kelvin:");
                    double c = sc.nextDouble();
                    ans = (9.0 / 5.0 * (c - 273.15f)) + 32;
                    temp="Fahrenheit";
                    break;
                default:
                    System.out.println("You have entered a wrong choice , kindly re-enter your choice");


            }
            if(choice <7) {
                System.out.printf("The temperature in %s is %.2f\n", temp, ans);
            }
            System.out.print("Enter your choice : ");
            choice= sc.nextInt();
        }

    }
}
