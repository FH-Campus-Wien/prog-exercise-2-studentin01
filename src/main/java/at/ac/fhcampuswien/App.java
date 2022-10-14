package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int i = 1;
        double num, largestNum;
        System.out.print("Number " + i + ": ");
        num = scan.nextDouble();
        largestNum = num;
        if (num <= 0)
            System.out.println("No number entered.");
        else {
            while(i > 0) {
                i++;
                System.out.print("Number " + i + ": ");
                num = scan.nextDouble();
                if (num > largestNum)
                    largestNum = num;
                if(num <= 0)
                    break;
            }
            System.out.printf("The largest number is %.2f\n", largestNum);
        }
    }

    //todo Task 2
    public void stairs() {
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int a = 1;
        int num = scan.nextInt();
        if (num <= 0)
            System.out.println("Invalid number!");

        else for (int i = 0; i < num; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here

        final int ROWS = 6;
        for (int row = 1; row <= ROWS; row++) {
            for (int col = ROWS; col > row; col--) {
                System.out.print(" ");
            }
            for (int col = 0; col < row * 2 - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here

    }

        //todo Task 5
        public void marks () {
            // input your solution here
            Scanner scan = new Scanner(System.in);

            int mark, i;
            int sum = 0, count = 0;

            for(i = 1;  i > 0; i++){
                System.out.print("Mark " + i + ": ");
                mark = scan.nextInt();

                if (mark < 0 || mark > 5) {
                    System.out.println("Invalid mark!");
                    i = i-1;
                    continue;
                }
                sum = sum + mark;
                if(mark == 5)
                    count = count + 1;
                if (mark == 0) {
                    break;
                }
            }
            if(sum == 0)
                System.out.printf("Average: %.2f\n", 0.00);
            else {
                double average = (double) sum / (i-1);
                System.out.printf("Average: %.2f\n", average);
            }
            System.out.println("Negative marks: " + count);
        }

    //todo Task 6
    public void happyNumbers() {
        // input your solution here
                Scanner scan = new Scanner(System.in);

                int n, r = 1, num, sum = 0;

                System.out.print("n: ");
                n = scan.nextInt();
                num = n;
                while (num > 9) {
                    while (num > 0) {
                        r = num % 10;
                        sum = sum + (r * r);
                        num = num / 10;
                    }
                    num = sum;
                    sum = 0;
                }
                if (num == 1) {
                    System.out.println("Happy number!");
                } else {
                    System.out.println("Sad number!");
                }
            }

        public static void main (String[]args){
            App exercise2 = new App();

            //System.out.println("Task 1: Largest Number");
            exercise2.largestNumber();

            //System.out.println("\nTask 2: Stairs");
            exercise2.stairs();

            //System.out.println("\nTask 3: Pyramide");
            exercise2.printPyramid();

            //System.out.println("\nTask 4: Raute");
            exercise2.printRhombus();

            //System.out.println("\nTask 5: Notendurchschnitt");
            exercise2.marks();

            //System.out.println("\nTask 6: Fröhliche Zahlen");
            exercise2.happyNumbers();
        }
    }
