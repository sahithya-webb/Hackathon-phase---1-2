import java.util.Scanner;

public class HouseholdDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int familyMembers;
        double waterConsumed;
        int houseNumber;
        char waterUsageStatus;

        System.out.print("Enter number of family members: ");
        familyMembers = sc.nextInt();

        System.out.print("Enter water consumed in litres: ");
        waterConsumed = sc.nextDouble();

        System.out.print("Enter house number: ");
        houseNumber = sc.nextInt();

        System.out.print("Enter water usage status (A/N): ");
        waterUsageStatus = sc.next().charAt(0);

        System.out.println("\nHousehold Details");
        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + waterUsageStatus);

        sc.close();
    }
}