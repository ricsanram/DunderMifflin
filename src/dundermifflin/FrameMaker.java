/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dundermifflin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author ricsanram
 */
public class FrameMaker {
    private String userInput = null;
    
    public FrameMaker (String picName, String message, Boolean input){
        URL url = DunderMifflin.class.getResource("/img/" + picName);
        Icon icon = new ImageIcon(url);
        JLabel image = new JLabel(icon);
        JTextArea text = new JTextArea(message);
        JPanel panel = new JPanel();
        text.setFont(new Font(Font.SANS_SERIF,Font.BOLD,23));
        text.setPreferredSize(new Dimension(250,icon.getIconHeight()));
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setEditable(false);
        text.setForeground(Color.LIGHT_GRAY);
        text.setBackground(Color.DARK_GRAY);
        text.setMargin(new Insets(20,20,20,20));
        panel.add(image);
        panel.add(text);
        
        JFrame window = new JFrame();
        
        if (input == true)
            userInput = JOptionPane.showInputDialog(window, panel, "Dunder Mifflin Paper Company, Inc.", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(window, panel, "Dunder Mifflin Paper Company, Inc.", JOptionPane.PLAIN_MESSAGE);
    }

        public FrameMaker (StringBuilder message) {
        JTextArea text = new JTextArea(message.toString());
        JPanel panel = new JPanel();
        text.setFont(new Font(Font.SANS_SERIF,Font.BOLD,28));
        text.setPreferredSize(new Dimension(1000,500));
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setEditable(false);
        text.setForeground(Color.LIGHT_GRAY);
        text.setBackground(Color.DARK_GRAY);
        text.setMargin(new Insets(20,20,20,20));
        panel.add(text);
        
        JFrame window = new JFrame();
        
        JOptionPane.showMessageDialog(window, panel, "Dunder Mifflin Paper Company, Inc.", JOptionPane.PLAIN_MESSAGE);
    }
    
    public String getUserInput() {
        return userInput;
    }
}
