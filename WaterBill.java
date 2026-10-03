import java.util.Scanner;
public class WaterBill{
    public static void main(String[]args){
        Scanner sc = new scanner(System.in);

        double consumption;
        int bill;

        System.out.print("Enter water consumption in litres: ");
        consumption = sc.nextDouble();

        if (consumption <= 500) {
            bill = 100;
        }else{
            bill = 200;
        }
        System.out.println("Water Bill: Rs." + bill);
        sc.close();

        }
    }
