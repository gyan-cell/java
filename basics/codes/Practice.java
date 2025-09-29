import java.util.Scanner;

public class Practice {
  public static void main(String[] args) {
    System.out.println("The Some Of The Basics Program To Practice Java \n");
    Scanner scan = new Scanner(System.in);
    scan.close();
    System.out.println("Please Enter The age of person");
    int age = scan.nextInt();
    System.out.println("Please Enter if the driver has driving License");
    Boolean hasDrivingLicense = scan.nextBoolean();
    scan.close();
    CanDrive canDrive = new CanDrive(age, hasDrivingLicense);
  }
}

class CanDrive {
  int age;
  boolean hasDrivingLicense;

  public CanDrive(int age, boolean hasDrivingLicense) {
    this.age = age;
    this.hasDrivingLicense = hasDrivingLicense;
    if (age >= 18 && hasDrivingLicense) {
      System.out.println("Yes U can Drive ");
    } else if (age < 18 || !hasDrivingLicense) {
      System.out.println("U Cannot Drive");
    }
  }
}
