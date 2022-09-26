//import java.util.Scanner;
//
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println();
//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        while (count < 100) {
//            System.out.println("welcome to java");
//            count++;
//        }
//    }
//}

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=20; i++){
            int product = 5 *i;
            System.out.println("5x"+i+"="+ product);
        }
    }
}