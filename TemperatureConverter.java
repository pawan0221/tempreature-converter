import java.util.Scanner;

public class TemperatureConverter {

    /** Converts Celsius to Fahrenheit. */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    /** Converts Fahrenheit to Celsius. */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputTemp;
        char unit;

        System.out.print("Enter temperature (e.g., 36.6 C or 97.9 F): ");
        // Read numeric value
        try {
            inputTemp = Double.parseDouble(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature value. Please enter a valid number.");
            scanner.close();
            return;
        }

        // Read unit and validate
        unit = Character.toUpperCase(scanner.next().charAt(0));
        scanner.close();

        switch (unit) {
            case 'C':
                double fahrenheit = celsiusToFahrenheit(inputTemp);
                System.out.printf("%.2f °C is %.2f °F%n", inputTemp, fahrenheit);
                break;
            case 'F':
                double celsius = fahrenheitToCelsius(inputTemp);
                System.out.printf("%.2f °F is %.2f °C%n", inputTemp, celsius);
                break;
            default:
                System.out.println("Invalid unit. Please specify 'C' for Celsius or 'F' for Fahrenheit.");
        }
    }
}
