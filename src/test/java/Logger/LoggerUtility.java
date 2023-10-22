package Logger;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.ThreadContext;
import org.apache.logging.log4j.core.util.IOUtils;

import java.io.*;


public class LoggerUtility {

   private static Logger logger = LogManager.getLogger();

   public static synchronized void startTestCase(String testName){
       ThreadContext.put("threadName", testName);
               logger.info("Execution started: "+testName);
   }
   public static synchronized void endTestCase(String testName){
       logger.info("Execution ended: "+testName);
   }
   public static synchronized void infoTest(String message) {
       logger.info(Thread.currentThread().getName() + " : " + getCallIonfo() + message);
   }
   public static synchronized String getCallIonfo(){
       String className = Thread.currentThread().getStackTrace()[3].getClassName();
       String metodeName = Thread.currentThread().getStackTrace()[3].getMethodName();
       return className+" : "+metodeName+" => ";
   }

   public static void mergeFilesIntoOne(){// create instance of directory
       File dir = new File("target/logs/suite/");
       String[] fileNames = dir.list();
       // create object of PrintWriter for output file
       PrintWriter pw = null;
       try {
           pw = new PrintWriter("target/logs/output.log");
           for (String fileName : fileNames) {
               System.out.println("Reading from " + fileName);

               // create instance of file from Name of
               // the file stored in string Array
               File f = new File(dir, fileName);

               // create object of BufferedReader
               BufferedReader br = new BufferedReader(new FileReader(f));
               pw.println("Contents of file " + fileName);

               // Read from current file
               String line = br.readLine();
               while (line != null) {

                   // write to the output file
                   pw.println(line);
                   line = br.readLine();
               }
               pw.flush();
           }
       } catch (IOException e) {
           System.out.println(e.getMessage());
       }
   }
}
