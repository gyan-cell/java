import java.io.*;

// Great question — the term "static" in Java (and other languages) refers to the idea that the member (variable or method) 
// belongs to the class itself, not to instances of the class.

class Test {
  public static int i = 0;

  Test() {
    i++;
    System.out.println(i);
  }

  public int m1() {
    System.out.println("Inside The method 1 ");
    this.m2();
    return 1;
  }

  public void m2() {
    System.out.println("Inside The method 2 ");
  }

}

class methodsInDifferentWays {
  public static void main(String[] args) {
    System.out.println("Hello World");

    Test t = new Test();
    t.m1();

  }
}
