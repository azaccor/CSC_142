import java.io.*;
import java.util.*;
/*
 * This Class reads a GMC Data Viewer file of logged radiation data per minute and outputs a file 
 * containing just lines of data.
 * 
 */
public class WriteTextFileFromCSV {
     
    private static String outfile = "4_22_18_stripped.txt";
    
        public static void main(String[] args) throws Exception{
            try {
                Scanner sc = new Scanner(new File("4_22_18.txt"));
     
                String dataLineTag = ".*Every Minute.*";
                            
                Writer writer = new BufferedWriter(new OutputStreamWriter(
                                new FileOutputStream(outfile), "utf-8"));
                 
                String lineSeparator = System.getProperty("line.separator");
                sc.useDelimiter(lineSeparator);
                             
                while (sc.hasNext()) {
                    String line = sc.next();
                          
                    if (line.matches(dataLineTag)) {
                        writer.write(line + "\r\n");
                    }
                }
                writer.close();
                sc.close();
            } catch (IOException e) {
                   // TODO Auto-generated catch block
                   e.printStackTrace();
            }
        }

     
}