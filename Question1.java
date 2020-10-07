import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in); 
      String num = "Your number is now ";
      System.out.println("Enter a number (Must be an integer): ");
      int c = scan.nextInt();
      System.out.println(num + c);
      c++ ;
      System.out.println(num + c);
      c++;
      System.out.println(num + c);
      c++ ;
      System.out.println(num + c);
      c-- ; 
      System.out.println(num + c);
      c-- ; 
      System.out.println(num + c);
      c-- ;
      System.out.println(num + c);
      


    }
}