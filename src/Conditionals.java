import java.util.Scanner;

public class Conditionals {
    static void main() {
//        int dailyPractice = 13;
//
//        if (dailyPractice>12);{
//            System.out.println("consistency hai!");
//        }




//        int score = 23;
//
//        if (score >=40){
//            System.out.println("pass");
//        } else {
//            System.out.println("fail");
//        }

//        int age = 28;
//        if (age > 18) {
//            System.out.println("Can vote");
//        } else {
//            System.out.println("cannot vote");
//        }

//        int accuracy = 89;
//
//        if (accuracy >= 90) {
//            System.out.println("good");
//        }
//        else if (accuracy >=100) {
//            System.out.println("bahut badiyaa");
//        }
//        else if (accuracy >= 110) {
//            System.out.println("majja aagay");
//        }
//        else {
//            System.out.println("bahlkkk");
//        }

//        boolean hassubscription = true;
//        int solvedProblems =300;
//
//        if (hassubscription)  {
//            if (solvedProblems >=500) {
//                System.out.println("Unlock Advanced Sheet");
//            } else {
//                System.out.println("no");
//            }
//        } else {
//            System.out.println("Upgrade required");
//        }

//        int age= 12;
//        char gender= 'M';
//
//        if(gender == 'S') {
//            System.out.println("you are a male");
//            if (age > 18) {
//                System.out.println("you are male and age > 18");
//            }
//            else {
//                System.out.println("you are male <=18");
//            }
//        }
//        else {
//            System.out.println("you are not a male");
//            if (age > 18) {
//                System.out.println("you are not male and age < 18");
//            } else {
//                System.out.println("you are  not male < 18");
//            }
//        }

        /// ternary operator///
//        int streakdays = 35;
//
//        String status = (streakdays >= 45) ? "Consistent" : " Irregular";
//        System.out.println(status);

//        int age = 18;
//
//        int ans = (age>18) ? 22 : 12;
//        System.out.println("Ans:" +ans);

//**************************Switchstatement*********************************************

        System.out.println("Enter the value for day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");

        }








    }
}
