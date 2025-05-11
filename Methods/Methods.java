class Methods {

  public void sayHello() {
    System.out.println("Hello World");
  }

  public static void main(String[] args) {
    Methods newObject = new Methods();
    newObject.sayHello();
  }
}

// methods are blocks of code that are supposed to perform a particular task
//
// A method allows us to reuse code , improving both efficiency and
// maintainability
//
// Key Components of a Method Declaration

// Modifier: It specifies the method’s access level (e.g., public, private,
// protected, or default).
// Return Type: The type of value returned, or void if no value is returned.
// Method Name: It follows Java naming conventions; it should start with a
// lowercase verb and use camel case for multiple words.
// Parameters: A list of input values (optional). Empty parentheses are used if
// no parameters are needed.
// Exception List: The exceptions the method might throw (optional).
// Method Body: It contains the logic to be executed (optional in the case of
// abstract methods).
//
// Method Body in Java
//
// Components of a method
// Types of Methods in Java
// 1. Predefined Method
//
// Predefined methods are the method that is already defined in the Java class
// libraries. It is also known as the standard library method or built-in
// method. for example random() method which is present in the Math class and we
// can call it using the ClassName.methodName() as shown in the below example.
// 2. User-defined Method
//
// User-defined methods are the method that is created by the user. It is also
// known as the custom method or user-defined method.
//
//
// Different Ways to Create Java Method
//
// There are two ways to create a method in Java:
//
// 1. Instance Method: Access the instance data using the object name. Declared
// inside a class.
//
// Example:
//
// // Instance Method
//
// void method_name() {
//
// // instance method body
//
//
// }
//
// 2. Static Method: Access the static data using class name. Declared inside
// class with static keyword.
//
// Example:
//
// // Static Method
//
// static void method_name() {
//
// // static method body
//
//
// }
//
//
// Advantages of Methods

// Reusability: Methods allow us to write code once and use it many times.
// Abstraction: Methods allow us to abstract away complex logic and provide a
// simple interface for others to use.
// Encapsulation: Allow to encapsulate complex logic and data
// Modularity: Methods allow us to break up your code into smaller, more
// manageable units, improving the modularity of your code.
// Customization: Easy to customize for specific tasks.
// Improved performance: By organizing your code into well-structured methods,
// you can improve performance by reducing the amount of code.
//
//
