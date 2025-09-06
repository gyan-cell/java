import java.util.Scanner;

public class BasicInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Declare ur tyoe which will be of variale sc
    System.out.println("Please Enter Your Name");
    String name = sc.nextLine();
    System.out.println("Hello " + name);
  }
}
