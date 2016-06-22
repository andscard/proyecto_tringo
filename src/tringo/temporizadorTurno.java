/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tringo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Usuario
 */
public class temporizadorTurno extends Thread {
    
    long tiempo;

    public temporizadorTurno() {
        this.tiempo=5;
        
        
    }
    
    
    @Override
    public void run() {
        try {
            //System.out.println("en el try del run");
            Thread.sleep(TimeUnit.SECONDS.toMillis(5));
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch(Exception e) {
           // System.out.println("en el catch");
            e.printStackTrace();
           
        }
  
    }
    
    
}
