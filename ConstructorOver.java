/**
 * ConstructorOver
 */
public class ConstructorOver {

  int id;
  String name;
  ConstructorOver() {
    System.out.println("Please Dont Leave Me Baby I Feel So pain...");
  }
  ConstructorOver(int i, String n) {
    id = i;
    name = n;
    System.out.println("Some Back To That Place " + name +
                       "Where My Heart In My Blocklist" + id);
  }
  public static void main(String[] args) {
    System.out.println("DEfault Constructor.....");
    ConstructorOver gus = new ConstructorOver();
    System.out.println("Parameterrized Constructor.....");
    ConstructorOver sus  = new ConstructorOver(10, "Radhika");
  }
}
