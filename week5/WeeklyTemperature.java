import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperature {
    public static void main(String[] args) {

        //Initialize ArrayLists to store days and temperatures
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        //populate days of the week
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        //Collect temperature data for each day
        for (String day : days) {
            System.out.print("Enter the temperature for " + day + ": ");
            double temperature = scanner.nextDouble();
            temperatures.add(temp);
        }

        for (int i = 0; i < days.size(); i++) {
            System.out.println(days.get(i) + ": " + temperatures.get(i) + "°F");



        }

        System.out.println("Enter 'week' to see weekly average temperature or 'day' to see a specific day's temperature:");
        scanner.nextLine(); // Consume newline
        String input = scanner.nextLine().trim();
        if (input.equalsIgnoreCase("week")) {
            double total = 0.0;
            for (double temp : temperatures) {
                total += temp;
            }
            double average = total / temperatures.size();
            System.out.printf("The average temperature for the week is: %.2f°F%n", average);
        } else { 
            int index = days.indexOf(input);
            if (index != -1) {
                System.out.println(input + ": " + temperatures.get(index) + "°F");
            } else {
                System.out.println("Invalid input. Please enter a valid day or 'week'.");
            }
        }

        scanner.close();
    }
}





        
    




    
