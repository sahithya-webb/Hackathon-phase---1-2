import java.util.Scanner;

public class WaterConsumption {

    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int morningUsage, eveningUsage, total;

        System.out.print("Enter morning water usage: ");
        morningUsage = sc.nextInt();

        System.out.print("Enter evening water usage: ");
        eveningUsage = sc.nextInt();

        total = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total Water Consumption: " + total + " litres");

        sc.close();
    }
}
     