import java.util.*;

public class Calc {
  public static void main(String[] args) {
    System.out.println("Instructions to use the Calculator");
    System.out.println("Enter two numbers it will be duly prompted");
    System.out.println("Enter + for addition");
    System.out.println("Enter - for subtraction");
    System.out.println("Enter * for multiplication");
    System.out.println("Enter / for division");
    Scanner scan = new Scanner(System.in);
    System.out.println("Please Enter Number 1");
    int num1 = scan.nextInt();
    System.out.println("Please Enter Number 2");
    int num2 = scan.nextInt();
    System.out.println("Please Enter Operator");
    char op = scan.next().charAt(0);
    switch (op) {
      case '+':
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        break;
      case '-':
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        break;
      case '*':
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        break;
      case '/':
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        break;
      default:
        System.out.println("Invalid Operator");
    }
  }
}
