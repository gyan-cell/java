/**
 * Input
 */
import java.io.*; 
public class Input {

  public static void main(String[] args) throws IOException {
    BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
    String str = bfn.readLine();
    int i = Integer.parseInt(bfn.readLine());
    System.out.println("Printed String " +str);
    System.out.println("Printed Integer " +i);
  }
  
}
