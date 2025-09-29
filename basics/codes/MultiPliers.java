import java.util.Scanner;

public class Multipliers {
  public static void main(String[] args) {
    System.out.println("This Application Simply just takes no. as input and gives the multiplication till you wish!");
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter the number");
    int number = scan.nextInt();
    System.out.println("please enter the limit");
    int limit = scan.nextInt();
    scan.close();
    TableCalc calcu = new TableCalc(number, limit);
    calcu.calculate();
  }
}

class TableCalc {
  int num;
  int limit;
  int val;

  public TableCalc(int num, int limit) {
    this.num = num;
    this.limit = limit;
  }

  public int calculate() {
    for (int i = 0; i <= limit; i++) {
      System.out.println(num + "*" + i + " = " + num * i);
    }
    return 1;
  }
}
