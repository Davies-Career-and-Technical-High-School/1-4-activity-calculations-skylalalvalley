import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("What is your radius?");
        int r = scan.nextInt();
        double cir = (2.0 * pi * (r * 1.0));
        double area = (pi * (r * r) * 1.0);
        System.out.println("Circumfernces: " + cir);
        System.out.println("Area: " + area);


    }
}