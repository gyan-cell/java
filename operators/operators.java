// Java operators are special symbols that perform operations on variables or values. These operators 
// are essential in programming as they allow you to manipulate data efficiently. They can be classified 
// into different categories based on their functionality. In this article, we 
// will explore different types of operators in Java, including arithmetic, unary, relational, 
// logical, and more, along with practical examples. 

class Operator {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 20;
    int sum = num1 + num2;

    System.out.println("The Sum is " + sum);

    int diff = num1 - num2;

    System.out.println("The Difference is " + diff);

    int a = 10;
    int b = 3;

    // Arithmetic operators on Strings
    String n1 = "15";
    String n2 = "25";

    // Convert Strings to integers
    int a1 = Integer.parseInt(n1);
    int b1 = Integer.parseInt(n2);

    // Using unary operators
    System.out.println("Postincrement : " + (a++));
    System.out.println("Preincrement : " + (++a));

    System.out.println("Postdecrement : " + (b--));
    System.out.println("Predecrement : " + (--b));

    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    System.out.println("a % b = " + (a % b));
    System.out.println("a1 + b1 = " + (a1 + b1));

    int f = 7;
    System.out.println("f += 3: " + (f += 3));
    System.out.println("f -= 2: " + (f -= 2));
    System.out.println("f *= 4: " + (f *= 4));
    System.out.println("f /= 3: " + (f /= 3));
    System.out.println("f %= 2: " + (f %= 2));
    System.out.println("f &= 0b1010: " + (f &= 0b1010));
    System.out.println("f |= 0b1100: " + (f |= 0b1100));
    System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
    System.out.println("f <<= 2: " + (f <<= 2));
    System.out.println("f >>= 1: " + (f >>= 1));
    System.out.println("f >>>= 1: " + (f >>>= 1));

    int as = 10;

    // Using left shift
    System.out.println("a<<1 : " + (as << 1)); // multiply by 2

    // Using right shift
    System.out.println("a>>1 : " + (as >> 1)); // divide by 2

  }
}

// Types of Operators in Java
//
// Arithmetic Operators
// Unary Operators
// Assignment Operator
// Relational Operators
// Logical Operators
// Ternary Operator
// Bitwise Operators
// Shift Operators
// instance of operator
//

// 1. Arithmetic Operators
//
// Arithmetic Operators are used to perform simple arithmetic operations on
// primitive and non-primitive data types.
//
// * : Multiplication
// / : Division
// % : Modulo
// + : Addition
// – : Subtraction
//
// 2. Unary Operators

// Unary Operators need only one operand. They are used to increment, decrement,
// or negate a value.
//
// - , Negates the value.
// + , Indicates a positive value (automatically converts byte, char, or short
// to int).
// ++ , Increments by 1.
// Post-Increment: Uses value first, then increments.
// Pre-Increment: Increments first, then uses value.
// -- , Decrements by 1.
// Post-Decrement: Uses value first, then decrements.
// Pre-Decrement: Decrements first, then uses value.
// ! , Inverts a boolean value.
//
//
// 3. Assignment Operator
//
// ‘=’ Assignment operator is used to assign a value to any variable. It has
// right-to-left associativity, i.e. value given on the right-hand side of the
// operator is assigned to the variable on the left, and therefore right-hand
// side value must be declared before using it or should be a constant.
//
// The general format of the assignment operator is:
//
// variable = value;
//
// In many cases, the assignment operator can be combined with others to create
// shorthand compound statements. For example, a += 5 replaces a = a + 5. Common
// compound operators include:
//
// += , Add and assign.
// -= , Subtract and assign.
// *= , Multiply and assign.
// /= , Divide and assign.
// %= , Modulo and assign.
//
//
//
// 5. Logical Operators
//
// Logical Operators are used to perform “logical AND” and “logical OR”
// operations, similar to AND gate and OR gate in digital electronics. They have
// a short-circuiting effect, meaning the second condition is not evaluated if
// the first is false.
//
// Conditional operators are:
//
// &&, Logical AND: returns true when both conditions are true.
// ||, Logical OR: returns true if at least one condition is true.
// !, Logical NOT: returns true when a condition is false and vice-versa
//
//
//
// The Ternary Operator is a shorthand version of the if-else statement. It has
// three operands and hence the name Ternary. The general format is,

// condition ? if true : if false
//
// The above statement means that if the condition evaluates to true, then
// execute the statements after the ‘?’ else execute the statements after the
// ‘:’.
//
// Example: This example demonstrates the use of the ternary operator to find
// the maximum of three numbers.
//
//
//
// 7. Bitwise Operators

// Bitwise Operators are used to perform the manipulation of individual bits of
// a number and with any of the integer types. They are used when performing
// update and query operations of the Binary indexed trees.
//
// & (Bitwise AND): returns bit-by-bit AND of input values.
// | (Bitwise OR): returns bit-by-bit OR of input values.
// ^ (Bitwise XOR): returns bit-by-bit XOR of input values.
// ~ (Bitwise Complement): inverts all bits (one’s complement).
//
//
//
// Shift Operators are used to shift the bits of a number left or right, thereby
// multiplying or dividing the number by two, respectively. They can be used
// when we have to multiply or divide a number by two. The general format ,

// number shift_op number_of_places_to_shift;
//
// << (Left shift): Shifts bits left, filling 0s (multiplies by a power of two).
// >> (Signed right shift): Shifts bits right, filling 0s (divides by a power of
// two), with the leftmost bit depending on the sign.
// >>> (Unsigned right shift): Shifts bits right, filling 0s, with the leftmost
// bit always 0.
//
//
//
// The instance of operator is used to check if an object is an instance of a
// class. It returns true if the object is an instance of the specified class,
// otherwise it returns false.
//
//
