import java.util.Scanner;
public class swaptwonumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
         System.out.println("Enter the second number");
        int num2 = sc.nextInt();
       //using third varible;
        // int temp =num1;
    //num1 = num2;
      // num2 = temp;
      // without using third variable
      num1 = num2 + num1;
      num2= num1 - num2;
      num1 = num1 - num2;

       System.out.println("The number swapping numbers is "+ num1 + ",,,"+num2);
       sc.close();
    }
}
