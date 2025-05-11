// in java methods can be of two types
// 1. Instance Method : This method belongs to an object and it is needed to be
// called
// 2. Static Method : This method belongs to a class and no object is needed to
// be created
//

class method_types {
  public static void sayHello() {
    System.out.println("Hello World");
  }

  public static void main(String[] args) {
    // This is the good example of static method
    sayHello();
    method_types.sayHello();
    // Instance method
    Animal newAnimal = new Animal();
    newAnimal.eat();
  }
}

class Animal {
  public void eat() {
    System.out.println("Eating");
  }
}
