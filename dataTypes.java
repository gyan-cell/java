
// java is a staticly typed and strongly typed language
// There Are Two Types OF Data :
// Primitive And Non Primitive
//
// Primitive Data Types : Boolean Type And Numerical Type
// Boolean Type  : Boolean Numeric Type  : character Value And Integral Value
// character Value : char & integer : Byte Short And int long
// Floating Type :  float double
// non-primitve  :string arrays etc....
/**
 * dataTypes
 */

import java.util.*;

public class dataTypes {

  public static void main(String[] args) {
    char a = 'G';
    int i = 899;
    byte b = 5;
    short s = 56;
    double d = 89.667;
    // for float use 'f' as suffix as standard
    float f = 87.767f;
    long l = 12121;
    System.out.println("Char:" + a);
    System.out.println("Int:" + i);
    System.out.println("byte:" + b);
    System.out.println("short:" + s);
    System.out.println("double:" + d);
    System.out.println("float:" + f);
    System.out.println("long:" + l);
    dataTypeExample.main(args);
  }
}

class dataTypeExample {
  public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    System.out.println(
        "Please Enter 1  If U want me To list down the Primary Data Types and two  for the Secondary Data Types");
    int a = inputScanner.nextInt();
    inputScanner.close();
    if (a == 1) {
      System.out.println("Primary Data Types : Boolean Type And Numerical Type");
      System.out.println("Boolean Type  : Boolean Numeric Type  : character Value And Integral Value");
      System.out.println("character Value : char & integer : Byte Short And int long");
      System.out.println("Floating Type :  float double");
    } else if (a == 2) {
      System.out.println("Non-Primitive Data Types : String Arrays class interface etc");
    }
  }
}

// Reserved Words in Java
//
// Any programming language reserves some words to represent functionalities
// defined by that language. These words are called reserved words. They can be
// briefly categorized into two parts:
//
// Keywords (50): Keywords define functionalities.
// literals (3): Literals define value.
//
//
//
// List of Java Reserved Words
// abstract continue for protected transient
// Assert Default Goto public Try
// Boolean Do If Static throws
// break double implements strictfp Package
// byte else import super Private
// case enum Interface Short switch
// Catch Extends instanceof return void
// Char Final Int synchronized volatile
// class finally long throw Date
// const float Native This while
//
//
// Java is statically typed and also a strongly typed language because each type
// of data (such as integer, character, hexadecimal, packed decimal, and so
// forth) is predefined as part of the programming language and all constants or
// variables defined for a given program must be declared with the specific data
// types.

// Data types in Java are of different sizes and values that can be stored in a
// variable that is made as per convenience and circumstances to cover up all
// test cases.
//
// The boolean data type represents a logical value that can be either true or
// false. Conceptually, it represents a single bit of information, but the
// actual size used by the virtual machine is implementation-dependent and
// typically at least one byte (eight bits) in practice. Values of the boolean
// type are not implicitly or explicitly converted to any other type using
// casts. However, programmers can write conversion code if needed.
//
//
// Primitive Data Types in Java

// Primitive data store only single values and have no additional capabilities.
// There are 8 primitive data types. They are depicted below in tabular format
// below as follows:
//
//
// Type Name
// byte
// short
// int
// long
// char
// float
// double
// boolean
//
// Non-Primitive Data Types in Java
//
// Non-primitive data store multiple values and have additional capabilities.
// There are 5 non-primitive data types. They are depicted below in tabular
// format below as follows:
//
//
// Type Name
// String
// Array
// Class
// Interface
// Object
//
// The Non-Primitive (Reference) Data Types will contain a memory address of
// variable values because the reference types won’t store the variable value
// directly in memory. They are strings, objects, arrays, etc.
//
//
//
// Strings are defined as an array of characters. The difference between a
// character array and a string in Java is, that the string is designed to hold
// a sequence of characters in a single variable whereas, a character array is a
// collection of separate char-type entities. Unlike C/C++, Java strings are not
// terminated with a null character.
//
// A Class is a user-defined blueprint or prototype from which objects are
// created. It represents the set of properties or methods that are common to
// all objects of one type. In general, class declarations can include these
// components, in order:

// Modifiers : A class can be public or has default access. Refer to access
// specifiers for classes or interfaces in Java
// Class name: The name should begin with an initial letter (capitalized by
// convention).
// Superclass(if any): The name of the class’s parent (superclass), if any,
// preceded by the keyword extends. A class can only extend (subclass) one
// parent.
// Interfaces(if any): A comma-separated list of interfaces implemented by the
// class, if any, preceded by the keyword implements. A class can implement more
// than one interface.
// Body: The class body is surrounded by braces, { }.
//
// An Object is a basic unit of Object-Oriented Programming and represents
// real-life entities. A typical Java program creates many objects, which as you
// know, interact by invoking methods. An object consists of :

// State : It is represented by the attributes of an object. It also reflects
// the properties of an object.
// Behavior : It is represented by the methods of an object. It also reflects
// the response of an object to other objects.
// Identity : It gives a unique name to an object and enables one object to
// interact with other objects.
//
//
//
// An Object is a basic unit of Object-Oriented Programming and represents
// real-life entities. A typical Java program creates many objects, which as you
// know, interact by invoking methods. An object consists of :

// State : It is represented by the attributes of an object. It also reflects
// the properties of an object.
// Behavior : It is represented by the methods of an object. It also reflects
// the response of an object to other objects.
// Identity : It gives a unique name to an object and enables one object to
// interact with other objects.
// //
//
// An Array is a group of like-typed variables that are referred to by a common
// name. Arrays in Java work differently than they do in C/C++. The following
// are some important points about Java arrays.

// In Java, all arrays are dynamically allocated. (discussed below)
// Since arrays are objects in Java, we can find their length using member
// length. This is different from C/C++ where we find length using size.
// A Java array variable can also be declared like other variables with [] after
// the data type.
// The variables in the array are ordered and each has an index beginning with
// 0.
// Java array can also be used as a static field, a local variable, or a method
// parameter.
// The size of an array must be specified by an int value and not long or short.
// The direct superclass of an array type is Object.
// Every array type implements the interfaces Cloneable and
// java.io.Serializable.
