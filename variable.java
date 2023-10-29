/**
 * variable
 */

// Types Of variable  : Local And Global Scoped variable 
// Local Scope : The variable defined within the block or a method or a constructor is called local Scopped variable 
// These variable is created when the block is Entered or a function is called and destroyed after
// The Block is exited
// Instance variable are not static variables and declared outside of Any method constructor
// or block
// As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
public class variable {

  public String name;
  public int i;
  int a = 20;
  // The Above Statement Is The Correct Way To Name Or Declare A variable int is The Data Type And a is The Name Of the variable And 20 is the Data Stored Init ....
  public variable(){
    this.name = "Gyanranjan Jha";
  }
  public static void main(String[] args) {
    variable name = new variable();
    int elo  = 21;//Elo Is The Local variable 
    System.out.println(elo);
    System.out.println(name.name);  
  }
}
