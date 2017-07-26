import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MeanMedian {

  public static void main(String[] args) throws IOException {
    String[] s = { "", "", "" };
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a year (2017)");
    s[0] = in.nextLine();
    
    System.out.println("Enter a month (01-06)");
    s[1] = in.nextLine();
    
    System.out.println("Enter a day (15");
    s[2] = in.nextLine();
    
    in.close();
  } // End of: main()
  
  public static ArrayList<Double> getData(String type, String[] s)
    throws NumberFormatException, IOException {
    
   
    
  } // End of: getData()

} // End of: class