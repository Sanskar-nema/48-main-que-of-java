public class reversenumber {
    public static void main(String[] args) {
int num = 1234;        
        int rev =0;
       while (num>0)
       {
        int digit = num%10;
        rev = rev*10 +digit;
       }
       System.out.println(rev);
        }
    }