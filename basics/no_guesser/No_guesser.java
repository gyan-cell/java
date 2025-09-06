import java.util.Random;
import java.util.Scanner;

public class No_guesser {
  public static void main(String[] args) {
    System.out.println("Random No. guesser Game , u will be given five chances to guess the number");
    Random random = new Random();

    int no = random.nextInt(10); // Doing this to get random no but till 10 only to make game playable

    for (int i = 0; i < 5; i++) {
      System.out.println("Please Enter a number");
      int num = new Scanner(System.in).nextInt();
      if (num == no) {
        System.out.println("Congratulations You Won");
        break;
      } else if (num > no && num - no <= 5) {
        System.out.println("The number is less than " + num);
      } else {
        System.out.println("The number is greater than " + num);
      }
    }

  }
}
