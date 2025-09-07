import java.util.Scanner;

public class UnitConverter {
  public static void main(String[] args) {
    System.out.println("Welcome to basic unit coverter");
    System.out.println("Please enter the value you want to convert");
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    converter conv = new converter(num);
    System.out.println("The value in km is " + conv.convertMeterToKm());
    System.out.println("The value in paise is " + conv.convertRupeeIntoPaise());
  }
}

class converter {
  int val1;

  public converter(int value1) {
    this.val1 = value1;
  }

  public float convertMeterToKm() {
    return val1 / 1000;
  }

  public float convertRupeeIntoPaise() {
    return val1 * 100;
  }
}
