import java.math.BigInteger;
import java.util.Scanner;

public class takinginput {
    static void main() {
//        int b = 2;
//        int c = 3;
//        System.out.println(b+c);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for firstNum:");
        int firstnum = sc.nextInt();
        System.out.println("Enter the value for secondNum:");
        int Secondnum = sc.nextInt();
        int ans = firstnum + Secondnum;
        System.out.println("Answer is: " +ans);


         BigInteger bg = sc.nextBigInteger();
         System.out.println("Bigninteger:"  +ans);

         System.out.println("Enter the value for flag");
         boolean flag =sc.nextBoolean();
         System.out.println("Enter the value for shortVal");
         short shortVal  =  sc.nextShort();
         System.out.println("Enter the value for floatValue");
         float floatValue = sc.nextFloat();

         System.out.println("Flag is:"+flag);
         System.out.println("shortVal is:" + shortVal);
         System.out.println("floatValue is:"+floatValue);

         sc.close();



    }
}
