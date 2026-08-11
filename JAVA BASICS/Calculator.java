import java.util.Scanner;
public class Calculator{

    public static void main(String a[]){

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Number 1:");
         double num1 = sc.nextDouble();

         System.out.println("Enter Number 2:");
         double num2 = sc.nextDouble();

         System.out.println("Enter your choice (+,-,*,/) :");
         String choice = sc.next(); 

         switch(choice){
            case"+":
                System.out.print("Result = "+ (num1+num2));
                break;
            case"-":
                System.out.print("Result = "+ (num1-num2));
                break;
            case"*":
                System.out.print("Result = "+ (num1*num2));
                break;
            case"/":
                if(num2 != 0)
                    System.out.print("Result = "+ (num1/num2));
                else
                    System.out.print("Cannot divide by zero");
                break;
            
            default:
                System.out.println("Invalid Operator");
         }
         sc.close();
    }
}