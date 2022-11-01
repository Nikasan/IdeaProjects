package Patterns.Factory;

/**
 * Created by Nikasan
 */
public class DriverFactory {

   public void startChrome(){
      new Chrome().runBrowser();
   }

   public void startEdge(){
      new Edge().runBrowser();
   }
}
