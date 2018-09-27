/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.skypebomber;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import test.StartAutomation;

public class SkypeBomber {

static StartAutomation test = null;    

//use WebElement class for selecting element variables
    public static void main(String[] args) throws IOException {
        test = new StartAutomation();
        test.setupEnvironment("C:\\Program Files (x86)\\Microsoft\\Skype for Desktop\\Skype.exe","Driver\\Winium.Desktop.Driver.exe");
        test.startDriver();
        
        WebElement window = test.driver.findElementByClassName("Windows.UI.Core.CoreWindow");
    
    }
}
