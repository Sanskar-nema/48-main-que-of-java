public class reversenumber {
    public static void main(String[] args) {
int num = 12321;        
        int rev =0;
        int originalnum = num;
       while (num!=0)
       {
        int digit = num%10;
        rev = rev*10 +digit;
        num = num / 10;
       }
       if(rev ==  originalnum) {
        System.out.println("the number is palidrome");

       }
       else {
        System.out.println("The number is not palidrome ") ;
       }
   
        }
    }

