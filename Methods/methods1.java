class Add {
  int a = 10;

  public int AddTwoInt(int a, int b) {
    return a + b;
  }
}

class methods1 {
  public static void main(String[] args) {
    Add addingClassoObject = new Add();

    int sum = addingClassoObject.AddTwoInt(454, 643);

    System.out.println(sum);

  }
}
