
    import java.util.Scanner;
      public class si{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle");
        int p = sc.nextInt();
        System.out.println("Enter the rate");
        int r= sc.nextInt();
        System.out.println("Enter the time");
        int t = sc.nextInt();
        int simpleinterest = p*r*t/100;
        System.out.println("The simple interest is : "+ simpleinterest);
        sc . close();

    }


    
      }
