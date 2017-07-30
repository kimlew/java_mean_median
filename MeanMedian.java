import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MeanMedian {

  public static void main(String[] args) throws IOException {
    
    String[] s = { "", "", "" }; // String array to hold user input.
    
    /*
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a year (2017)");
    s[0] = in.nextLine();
    
    System.out.println("Enter a month (01-06)");
    s[1] = in.nextLine();
    
    System.out.println("Enter a day (15");
    s[2] = in.nextLine();
    
    in.close();
    */
    ArrayList distRunData = getData(null, null);
    System.out.println(distRunData);
    /*
    mac$ javac MeanMedian.java
    mac$ java MeanMedian
    [14.1, 13.2, 13.3, 20.4, 23.5, 13.6, 14.7]
    */
    
  } // End of: main()
  
  // Gets data from a file and returns it in an ArrayList.
  public static ArrayList<Double> getData(String type, String[] s)
    throws NumberFormatException, IOException {
    
    /*B4: 
    URL dataSource = new URL("http://lpo.dt.navy.mil/data/DM/" +
      s[0] + s[0] + "_" + s[1] + "_" + s[2] + "/" + type);
    BufferedReader data = new BufferedReader(new InputStreamReader(dataSource.openStream)));
    */
   
    // Note: Refer to filename instead of URL dataSource - since wind URL changed
    // stream - Java's term for an external data source where the data is read 
    // 1 item at a time, rather than downloaded in a single chunk. 
    // Want: To read 1 line of this file at a time, so use this stream.
    String dataSource = "distances_run.txt";
    BufferedReader data = new BufferedReader(new FileReader(dataSource));
    
    // Define distRunData using an array list - since easiest way to store data
    // is in array list of doubles
    ArrayList<Double> distRunData = new ArrayList<Double>();
    String inputLine; // Define a string, inputLine - to download data into list
    
    // while statement - reads lines from data 1-by-1 until no more lines to read
        
    while ( (inputLine = data.readLine()) != null ) {
      // Take a string from the input line and treat it as a double
      // Note: It is a double, rather than a string.
      // Remember: The data on the server is NOT currently a number.
      // - is a date, a time, and a number. 
      // - actual data starts on the 20th character of each line
      // - substring(20) - gets ONLY the distance data - NOT year, month, date

      distRunData.add(Double.parseDouble(inputLine.substring(20)));
    }
    
    // Close the data stream and return the array list.
    data.close();
    return distRunData;
    
  } // End of: getData()

} // End of: class

