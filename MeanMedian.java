import java.io.BufferedReader;

public class MeanMedian {

  public static void main(String[] args) throws IOException {
    String[] s = { "", "", "" };
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Emter a year (2012-2017)");
    s[0] = in.nextLine();
    
    System.out.println("Enter a month (01-12)");
    s[1] = in.nextLine();
    
    System.out.println("Enter a day (01-31)");
    s[2] = in.nextLine();
  }

} // End of: class