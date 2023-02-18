import java.util.Scanner;
public class CarRental{
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your hours :");
        double  hours = sc.nextDouble();
        double CR;
        CR = 60 + (5 * (hours-24));
        if(hours <= 24)
            System.out.print("Car rental is RM 60");
        else
             System.out.print("Car Rental = RM " + CR );
        
    }
}