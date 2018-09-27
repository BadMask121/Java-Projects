/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.*;

/**
 *
 * @author User
 */
public class StartAutomation {
    
    public static WiniumDriver driver = null;
    public static WiniumDriverService  service = null;
    public static DesktopOptions option = null;
    public static File f = null;

    @BeforeClass
    public void setupEnvironment(String application,String drive) throws MalformedURLException, IOException{
    option = new DesktopOptions();
    option.setApplicationPath(application);
    option.setDebugConnectToRunningApp(Boolean.TRUE);
    option.setLaunchDelay(1000);
    option.toCapabilities();

if(drive instanceof String){
   f = new File(drive);
}else{
    throw new FileNotFoundException("File not found");
}

if( f != null && !"".equals(drive)){
    System.setProperty("webdriver.winium.desktop.driver", drive);   
    service = new WiniumDriverService.Builder()
                                     .usingDriverExecutable(f)
                                     .usingPort(9999)
                                     .withVerbose(true)
                                     .withSilent(false)
                                     .buildDesktopService();
    service.start();
}
    }

    
    //Start Driver
    @BeforeMethod
public void startDriver(){
             driver = new WiniumDriver(service, option);                        
  try {
            Thread.sleep(500);
            System.err.println("Automation Ready");
        } catch (InterruptedException ex) {
            Logger.getLogger(StartAutomation.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
//            stopDriver();
//            tearDown();
        }
}
    
@AfterMethod
public void stopDriver(){
    driver.close();
}

@AfterTest
public void tearDown(){
    service.stop();
}

}
