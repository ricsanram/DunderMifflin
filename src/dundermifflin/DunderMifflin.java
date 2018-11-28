/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dundermifflin;

/**
 *
 * @author ricsanram
 */
public class DunderMifflin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrameMaker frame1 = new FrameMaker("dwightsalute.gif", "Welcome, what is your name?",true);
        FrameMaker frame2 = new FrameMaker("dwightcreepysmile.gif", "Hello, " + frame1.getUserInput() + "!",false);
    }
    
}
