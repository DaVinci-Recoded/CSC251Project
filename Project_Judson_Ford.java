import java.util.Scanner;

/**
   This is the demo code for poject 1
   using the Policy class
*/

public class Project_Judson_Ford
{
   public static void main(String[] args)
   {
      int number;          // Hold integer input
      String input = "";        // Hold String input
      double units;        // Hold double input
      double bmIndex;      // Hold BMI
      double policyCost;   // Hold Policy's cost
      
      Scanner keyboard = new Scanner(System.in);
      
      Policy holder = new Policy();
      
      System.out.print("Please enter the Policy Number:  ");
      number = keyboard.nextInt();
      holder.setPolicyNumber(number);
      input = keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      input = keyboard.nextLine();
      holder.setproviderName(input);
      //System.out.println("help");
      
      System.out.print("Please enter the Policyholder's First Name: ");
      input = keyboard.nextLine();
      holder.setfirstName(input);
      //System.out.println();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      input = keyboard.nextLine();
      holder.setlastName(input);
      //System.out.println();
      
      System.out.print("Please enter the Policyholder's Age: ");
      number = keyboard.nextInt();
      holder.setholderAge(number);
      input = keyboard.nextLine();
            
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      input = keyboard.nextLine();
      holder.setsmokeStatus(input);
      //System.out.println();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      units = keyboard.nextDouble();
      holder.setholderHeight(units);
      //System.out.println();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      units = keyboard.nextDouble();
      holder.setholderWeight(units);
      //System.out.println();
      
      bmIndex = holder.getBodyMassindex();
      policyCost = holder.getPrice(bmIndex);    
      
      System.out.print("Policy Number: " + holder.getPolicyNumber() + "\n");
      System.out.print("Provider Name: " + holder.getproviderName() + "\n");
      System.out.print("Policyholder's First Name: " + holder.getfirstName() + "\n");
      System.out.print("Policyholder's Last Name: " + holder.getlastName() + "\n");
      System.out.print("Policyholder's Age: "+ holder.getholderAge() + "\n");
      System.out.print("Policyholder's Smoking Status: " + holder.getsmokeStatus() + "\n");
      System.out.print("Policyholder's Height: " + holder.getholderHeight()+" inches\n");
      System.out.print("Policyholder's Weight: " + holder.getholderWeight() + " pounds\n");
      System.out.printf("Policyholder's BMI: %,.2f\n", bmIndex);
      System.out.printf("Policy Price: $%,.2f\n", policyCost);
   }
}