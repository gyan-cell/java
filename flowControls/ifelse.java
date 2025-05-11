class ifelse {
  public static void main(String[] args) {
    int a = 20;
    int b = 20;

    if (a > b) {
      System.out.println("A is Greater than b  ");
    } else if (a == b) {
      System.out.println("A is equal to b");
    } else {
      System.out.println("A is less than b");
    }

  }
}

class ifExample1 {
  public static void main(String[] args) {
    int a = 12;
    if (a == 12) {
      System.out.println("A is 12");
      a++;
    }
    System.out.println("a + 1 = " + a); // Executed by default
  }
}
