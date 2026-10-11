import java.util.Scanner;
public class cicalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle");
    
        int p = sc.nextInt();
        System.out.println("Enter the rate");
    
        int r = sc.nextInt();
        
        System.out.println("Enter the time");
    
        int t = sc.nextInt();
        
        System.out.println("Enter the n");
    
        int n = sc.nextInt();

        double ci = p * Math.pow (1+(r/100), n*t);
        System.out.println(ci);
    
          sc . close();


    }

    
}
