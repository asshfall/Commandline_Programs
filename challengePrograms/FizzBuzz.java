package Commandline_Programs.challengePrograms;

import java.util.Scanner;


public class FizzBuzz{

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: " );
        int inputNum = scanner.nextInt();
        
        if(inputNum % 3 == 0 & inputNum % 5 == 0){

            System.out.println("FizzBuzz");
        }
         else if (inputNum % 3 == 0 ){

             System.out.println("Buzz");

         }else if(inputNum % 5 == 0){
   
             System.out.println("Fizz");

         }else {

             System.out.println(inputNum);
         }


         scanner.close();

    }

}