import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a price: ");
        double price = scan.nextDouble();
        double total = (20 - price) * 1.0;
        System.out.println("You change from $20 is: $" + total);
        

    }
}