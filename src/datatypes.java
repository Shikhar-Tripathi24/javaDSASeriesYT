public class datatypes {
    static void main(){

        //numeic DT - short,long,byte,int

//        byte num1=127;
//        System.out.println(num1);

//        byte num2=500;
//        System.out.println(num2);
//        range is from -127 to 127

        short num2 = 500;
        System.out.println(num2);

//        short num2 = 5000;
//        System.out.println(num2);
//        range is from -127 to 127

        int num3=2345;
        System.out.println(num3);

        long num4=12345678;
        System.out.println(num4);


        //floating DTs//

        float num5 = 3.14f;
        System.out.println(num5);

        double num6 = 3.14234567456789;
        System.out.println(num6);

        //other - char ,boolean
        boolean eligibletovote = true;
        System.out.println(eligibletovote);

        char firstcharacter = 'a';
        System.out.println(firstcharacter);
        System.out.println("My First character is: " + (firstcharacter+3));
        System.out.println("My First character is: " + (char)(firstcharacter+3));

        //typecasting//
        //implicit//

        byte num1=127;
        long NewNum = num1;
        System.out.println("new num =" + NewNum);
        System.out.println(num1);

        //explicit//
        long value1=123456789;
        int value2= (int)value1;
        System.out.println(value2);
















    }
}
