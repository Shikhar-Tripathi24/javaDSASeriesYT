public class operators {
    static void main() {

        int a = 25;
        int b = 23;

        int total  = a+b;
        int difference = a=b;
        int projected = a*4;
        int average = a/7;
        int remainder =  b%5;

//        System.out.println(total);
//        System.out.println(difference);
//        System.out.println(projected);
//        System.out.println(average);
//        System.out.println(remainder);
//

//*************************relational operators***********************************8//

        int c =45;
        int d =50;

//        System.out.println(c==d);
//        System.out.println(c!=d);
//        System.out.println(c>d);
//        System.out.println(c<d);
//        System.out.println(c>=d);
//        System.out.println(c<=d);


//*************************logical operaators**************************************//

        boolean completedDSA= true;
        boolean completedCore = false;

        System.out.println(completedDSA && completedCore);
        System.out.println(completedDSA || completedCore);
        System.out.println(!completedDSA);

//*********************************Assignment operators**************************//

        int e =100;

        e+=20;
        System.out.println(e);
        e-=30;
        System.out.println(e);
        e*=30;
        System.out.println(e);
        e/=40;
        System.out.println(e);
        e %=30;
        System.out.println(e);

//************** unary inc/dec operators*********************//

        int f=100;

        int prefix = ++f;
        //phele increment  karo then utilize karo//
        int postfix= f++;
        //phele utilize  karo then increment karo//

        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(f);


    }
}
