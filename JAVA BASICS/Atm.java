import java.util.Scanner;
public class Atm{

    public static void main(String a[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Total Amount :");
        int Total_Balance = sc.nextInt();

        String choice;

        System.out.println("Here are the instructions for Deposit, Withdraw and checking Current Balance");
        do {
                System.out.println("\nSelect d for Deposit !"); 
                System.out.println("Select w for Withdraw !"); 
                System.out.println("Select b for Current Balance !"); 
                System.out.println("Select e for EXIT !");

                choice = sc.next();

                switch(choice){
                     case "d":
                            System.out.print("Enter amount you want to deposit :");
                            int Deposit_Amount = sc.nextInt();
                            Total_Balance += Deposit_Amount;
                            System.out.println("Amount Deposited Successfully!");
                            break;
            
                    case "b":
                            System.out.println("Your Current Balance is :" + Total_Balance);
                            break;

                    case "w":
                            System.out.print("Enter amount you want to Withdraw:"); 
                            int Withdraw_Amount = sc.nextInt(); 
                            if (Withdraw_Amount <= Total_Balance) { 
                                Total_Balance -= Withdraw_Amount; 
                                System.out.println("Amount Withdrawn Successfully!"); 
                            } else { 
                                System.out.println("Insufficient Balance!"); 
                            } 
                            break;
                    
                    case "e": 
                            System.out.println("Thank you for using ATM!");
                            break;

                    default:
                        System.out.println("Invalid Choice ⚠️");
        
                 }

            }while(!choice.equals("e"));
        
        sc.close();
    }
}