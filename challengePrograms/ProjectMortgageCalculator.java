package Commandline_Programs.challengePrograms;

import java.text.NumberFormat;
import java.util.Scanner;

public class ProjectMortgageCalculator {
    
    public static void main(String []args){
   
         Scanner scanner = new Scanner(System.in);

         int oneThousand =  1000;    // minimum amount of Principal
         int oneMillion = 1000000;   // maximum amount of Principal
         int principal;            // Initialization of Principal scanner Variable

         float one = 1f;            // minimum input of interest rate
         float thirty = 30f;        // maximum input of interest rate 
         float annualInterestRate;  // Initialization of annualInterestRate scanner variable
         
         byte one1 = 1;            // minimum input of period of number of Payments
         byte thirty1 = 30;        // maximum input of period of number of Payments
         byte numberOfPayments;         // Initialization of period scanner variable

         byte month = 12;
         byte percent = 100;

        
           do{

            System.out.print("Principal: ");
            principal = scanner.nextInt();
            
            if(principal < oneThousand | principal > oneMillion){
              System.out.println("Enter a value between $1,000 and $1,000,000");
            }
  
           } while(principal < oneThousand | principal > oneMillion );

             do{

                System.out.print("Annual Interest Rate: ");
                annualInterestRate = scanner.nextFloat();

                if(annualInterestRate < one | annualInterestRate > thirty){
                    System.out.println("Enter a value greater than 0 and less than or equal to 30 ");
                }

              }while(annualInterestRate < one | annualInterestRate > thirty);

                  do{

                    System.out.print("Period (Years): ");
                    numberOfPayments = scanner.nextByte();

                     if(numberOfPayments < one1 | numberOfPayments < thirty1 ){

                        System.out.println("Enter a value greater than 0 and less than or equal to 30");
                     }

                     }while(numberOfPayments < one1 | numberOfPayments < thirty1);

                     // Formula Section 

                      double monthlyInterestRate = annualInterestRate / month / percent;   // formula for month Rate
                      double totalNumberOfPayments = numberOfPayments * month;  // formula of total number of payments
                      
                  double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalNumberOfPayments )) / (Math.pow(1+ monthlyInterestRate,totalNumberOfPayments) -1); // Formula of mortgage

                  String formattedMortgage = NumberFormat.getInstance().format(mortgage);

                  System.out.println("Mortgage: $"+ formattedMortgage);

         scanner.close();

    }
}
