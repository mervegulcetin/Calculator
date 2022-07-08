import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
	int n1,n2,select;

        Scanner scan=new Scanner(System.in);
        System.out.println("enter the first number: ");
        n1= scan.nextInt();
        System.out.println("enter the second number: ");
        n2= scan.nextInt();

        System.out.println("1-addition\n2-subtraction\n3-multiplication\n" +
                "4-division");
        System.out.println("Your selection:  ");
        select=scan.nextInt();

        switch (select){
            case 1:
                System.out.println("result: "+(n1+n2));
                break;
                case 2:
                    System.out.println("result: "+(n1-n2));
                    break;
                    case 3:
                        System.out.println("result: "+(n1*n2));
                        break;
            case 4:
                if (n2!=0)
                System.out.println("result: "+(n1/n2));
                else
                    System.out.println("a number cannot be divded by zero");
                break;
            default:
                System.out.println("Invalid selection.Try again.");
        }

    }
}
