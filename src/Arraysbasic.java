import java.util.Scanner;

public class Arraysbasic {
    static void main() {

//        //declaration
//        int arr[];
//        //allocation
//        arr = new int[5];
        //initilisation
//         int brr[] = {1,2,3};

//         using loops

//         int n = brr.length;
//         for (int index=0;index<=n-1;index++) {
//             System.out.println(brr[index]);
//         }
//
////         System.out.println("Value at 0 index " +brr[0]);
////         System.out.println("Value at 0 index " +brr[1]);

// for each loop//

//        int n=brr.length;
//        for (int val: brr) {
//            System.out.println(val);
////        }
//         int []brr ={1,2,3};
//        int arr[]=new int[5];
//        Scanner sc=new Scanner(System.in);
//        int n= brr.length;
//        //input
//        for (int i=0;i<=n-1;i++) {
//            System.out.print("provide input for index:" +i);
//            brr[i] = sc.nextInt();
//        }
//        //print
//        for (int val: brr) {
//            System.out.println(val);
//        }

//        int arr[]={4,5,6};
//
//        int n= arr.length;
//        for (int i=0;i<=n-1;i++){
//            System.out.println(arr[i]);
//        }


        //question//
//        int arr[]={23,45,567};
//        int sum=0;
//        int n=arr.length;
//
//        for (int i=0;i<=n-1;i++){
//            int value = arr[i];
//            sum=sum+value;
//
//        }
//        System.out.println(sum);

//         int arr[]={10,20,30};
//         int ans = 1;
//         int n=arr.length;
//
//         for(int i=0;i<=n-1;i++){
//             int value=arr[i];
//             ans = ans*value;
//        }
//         System.out.print("answer multiply ke baad = "+ans);

//        int arr[]={2,3,21,456,234};
//        int n = arr.length;
//        int maxValue = arr[0];   ///compare  maxvalue ko array ke element ke saath
//
//        for (int i=0;i<=n-1;i++)   {
//            if (arr[i] > maxValue) {
//                maxValue = arr[i];
//            }
//        }
//        System.out.println("humara ans" + maxValue);

//        int arr[]={3,2,-5,21,10};
//        int n = arr.length;
//        int minValue = arr[0];   ///compare  maxvalue ko array ke element ke saath
//
//        for (int i=0;i<=n-1;i++)   {
//            if (arr[i] < minValue) {
//                minValue = arr[i];
//            }
//        }
//        System.out.println("humara ans" + minValue);


//      2D arrays//

        //declaration//
//        int[][]arr;
        //allocation
//        arr = new int[3][4];
        //initialisation//
//        int[][]brr={
//                {1,2},
//                {2,3},
//                {3,4},
//                {4,5}
//        };
//        System.out.println(brr[3][0]);
//        int rowlength= brr.length;
//        int collength=brr[0].length;
//
//        for (int row=0;row<=rowlength-1;row++){
//            for (int col=0;col<=collength-1;col++){
//                System.out.print(brr[row][col] +"" );
//            }
//            System.out.println();
//        }

        ////differrent case///// jacked array
//        int[][]crr={
//                {1,2},
//                {2,3,4,5},
//                {3,4,5,98,76,67},
//                {4,5}
//        };
//        int rowlength=crr.length;
//        for (int i=0;i<rowlength-1;i++){
//            int collength=crr[i].length;
//            for (int i1=0;i1<collength;i1++){
//                System.out.print(crr[i][i1]+ " ");
//            }
//            System.out.println();
//        }

        ///traversal 2-D array//
//        for (int rowIndex=0;rowIndex<=brr.length-1;rowIndex++){
//            for (int colIndex=0;colIndex<=brr[rowIndex].length-1;colIndex++) {
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }


        ///accessing element in 2d array
        ///input/output in 2darray

//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i=0; i<=arr.length-1;i++){
//            for (int j=0;j<=arr[i].length-1;j++) {
//                System.out.println("Provide value for row=" +i+ " and column="  +j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int rowIndex=0;rowIndex<=arr.length-1;rowIndex++){
//            for (int colIndex=0;colIndex<=arr[rowIndex].length-1;colIndex++) {
//                System.out.print(arr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }
//

        ///practice question///

//        int arr[][] = {{1,2,3},{1,2,3}};
//        int sum = 0;
//
//        for (int i=0;i<arr.length; i++){
//            for (int j=0;j<arr[i].length;j++) {
//                int value = arr[i][j];
//                sum = sum+ value;
//            }
//        }
//        System.out.println(sum);


    }
}
