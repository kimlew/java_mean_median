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
  
  // Gets data and returns it in an ArrayList.
  public static ArrayList<Double> getData(String type, String[] s)
    throws NumberFormatException, IOException {
    
    /*URL dataSource = new URL("http://lpo.dt.navy.mil/data/DM/" +
      s[0] + s[0] + "_" + s[1] + "_" + s[2] + "/" + type);
    */
    // TODO: Add in correct syntax: String?? dataSource = "distances_run.txt";
   
    // TODO: Refer to filename, not URL dataSource
    /* stream - is Java's term for an external data source where 
      the data is read 1 item at a time, rather than downloaded in 
      a single chunk. 
      Want: To read 1 line of this file at a time, so use this stream .
    */
    BufferedReader data = new BufferedReader(new InputStreamReader(dataSource.openStream)));
    
    // Define distRunData using an array list.
    // Easiest way to store data - in an array list of doubles
    ArrayList<Double> distRunData = new ArrayList<Double>();
    String inputLine; // Define a string, inputLine - to download data into list
    
    /*  while statement - reads lines from the data 1-by-1 until
        there are no more lines to read. 
      
      Within this while statement, the code to execute is 
      distData.add, Double, parseDouble and inputLine. 
      This takes a string from the input line and treats it as a 
      double since in this case, it is, a double, rather than a 
      string.

      Remember: The data on the server is NOT currently a number.
      It's a date, a time, and a number. The actual data starts on 
      the 20th character of each line, so add the function 
      substring 20 - to get rid of all the extraneous information.

 */
    while ( (inputLine = data.readLine()) != null ) {
      
    }
    
    // Close the data stream and return the array list.
    // Done: Ability to get data from a file.
    
  } // End of: getData()

} // End of: class

