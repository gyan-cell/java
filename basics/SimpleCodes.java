
public class SimpleCodes {
  public static void main(String[] args) {
    int primitiveVal = 10;
    Person person = new Person("Bladee", 23);
    System.out.println(person);
    System.out.println(person.name + person.age);
  }
}

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

// In Java, understanding the concepts of reference types and memory allocation
// is crucial for grasping how objects are managed in the language. Let's break
// down these concepts step-by-step:
// ### 1. Primitive Data Types vs. Reference Data Types
// **Primitive Data Types**: These are built-in data types provided by Java,
// such as `int`, `float`, `char`, `boolean`, etc. They hold the actual values
// directly.
// **Reference Data Types**: These include classes (user-defined types), arrays,
// and interfaces. Reference types store references to objects in memory. The
// reference points to the location where the object's data is stored.
// ### 2. Memory Allocation for Primitive Data Types
// When a variable of a primitive data type is declared, it allocates space in
// the stack memory:
// - **Stack**: This is a region of memory used for method execution and local
// variables. Each thread has its own stack, which contains the call stack
// (where methods are invoked) and local variables.
// - Example:
// ▸ JAVA CODE
//
// int age = 25; // 'age' is stored on the stack, holding the value 25
//
// ### 3. Memory Allocation for Reference Data Types
// **Heap**: This is a region of memory used for dynamic memory allocation in
// Java (also known as "garbage collected" heap). When an object is created
// using a reference type, it is allocated on the heap:
// - **Heap**: Holds objects and their instance variables.
// - **Stack**: Contains references (pointers) to these objects.
// Example:
// ▸ JAVA CODE
//
// Person person = new Person("John", 30); // 'person' is stored on the stack,
// pointing to an object on the heap
//
// Here, `new Person("John", 30)` allocates memory on the heap for the `Person`
// object and returns a reference (pointer) to this memory location. The
// variable `person` on the stack holds this pointer.
// ### Summary of Memory Allocation:
// - **Primitive Data Types** are stored directly in the stack, holding their
// actual values.
// - **Reference Data Types** store references (pointers) to objects in the heap
// and have pointers in the stack pointing to these locations.
// ### Example Code:
