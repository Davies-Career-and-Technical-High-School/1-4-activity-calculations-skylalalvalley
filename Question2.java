import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        int feet = 12;
        System.out.println("How many inches?");
        int inch = scan.nextInt();
        System.out.println(inch / feet);


    }
}