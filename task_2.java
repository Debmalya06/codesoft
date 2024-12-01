package codesoft;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Grade Generate Calculator");
        System.out.println("Please enter total 4 subjects marks");
        System.out.print("Enter Bengali Marks out of 100: ");
        int Bengali= sc.nextInt();
        System.out.print("Enter Math Marks out of 100: ");
        int Math= sc.nextInt(); 
         System.out.print("Enter Physics Marks out of 100: ");
        int Physics= sc.nextInt(); 
         System.out.print("Enter Chemistry Marks out of 100: ");
        int Chemistry= sc.nextInt();

        int obtained_marks = Bengali+ Math+ Physics+Chemistry;
        int percentage = obtained_marks/4;
        if (percentage<40) {
            System.out.println("Obtained Marks Out of 400 is : "+obtained_marks+" "+"Grade: F  " + "obtained percentage is: "+percentage);
        }
        else if (percentage>40 && percentage<50) {
            System.out.println("Obtained Marks Out of 400 is : "+obtained_marks+" "+"Grade: P  " + "obtained percentage is: "+percentage);
        }
        else if (percentage>=50 && percentage<60) {
            System.out.println("Obtained Marks Out of 400 is : "+obtained_marks+" "+"Grade: B  " + "obtained percentage is: "+percentage);
        }
        else if (percentage>=60 && percentage<70) {
            System.out.println("Obtained Marks Out of 400 is : "+obtained_marks+" "+"Grade: B+  " + "obtained percentage is: "+percentage);
        }
        else if (percentage>=70 && percentage<80) {
            System.out.println("Obtained Marks Out of 400 is : "+obtained_marks+" "+"Grade: A  " + "obtained percentage is: "+percentage);
        }
        else if (percentage>=80 && percentage<90) {
                System.out.println("Obtained Marks Out of 400 is : "+obtained_marks+" "+"Grade: A+ " + "obtined percentage is: "+percentage);
            } 
        else{
            System.out.println("Obtained Marks Out of 400 is : "+obtained_marks+" "+"Grade: O  " + "obtained percentage is: "+percentage);
            }
        }
    }

