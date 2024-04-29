import java.util.Scanner;    // Import Scanner 

public class employeeLogIn {
    
   private static String name = "Asshley";    // Employee Name
   private static int id = 123456;           // Employee ID Number

   private static String employeeName;      // Employee Input 
   private static int employeeID;          // ERmployee Identification Number
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);    // Scanner

        logIn(scanner);   // calling the Log in Method

    }

   static void logIn(Scanner scanner){

    System.out.print("Enter your Employee Name: ");
    employeeName = scanner.nextLine();

   // try catch block to avoid error
      try {

           System.out.print("Enter your Employee ID: ");
           employeeID = scanner.nextInt();
    
            } catch ( java.util.InputMismatchException e) {
   
                  System.out.println("Integers Number only");
       
                    }
   
                    // Condition for checking Employee Identity
                    
                    if(!employeeName.equals(name) & employeeID != id){

                          System.out.println("Invalid Employee Name & Employee ID");
                          logIn(scanner);
                      }
                         else if(!employeeName.equals(name)){

                              System.out.println("Invalid Employee Name");
                              logIn(scanner);
                             }
                                 else if(employeeID != id){

                                       System.out.println("Invalid Employee Identification");
                                       logIn(scanner);
                                  }
                                      else{
            
                                             System.out.println("Log In Successful");
                                            
                                        }

   }
}
