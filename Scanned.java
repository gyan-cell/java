import java.util.Scanner;

public class Scanned {
  public static void main(String[] args)
    {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
 
        // String input
        String name = sc.nextLine();
 
        // Character input
        char gender = sc.next().charAt(0); 
        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();
 
        // Print the values to check if the input was
        // correctly obtained.
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("CGPA: " + cgpa);
    }
}
//Scanner class helps to take the standard input stream in Java. So, we need some methods to extract data from the stream. Methods used for extracting data are mentioned below:
//
// Method
// 	
//
// Description
//
//                           nextBoolean()                       
// 	Used for reading Boolean value                    
//
// nextByte()
// 	Used for reading Byte value
//
// nextDouble()
// 	Used for reading Double value
//
// nextFloat()
// 	Used for reading Float value
//
// nextInt()
// 	Used for reading Int value
//
// nextLine()
// 	Used for reading Line value
//
// nextLong()
// 	Used for reading Long value
//
// nextShort()
// 	Used for reading Short value
