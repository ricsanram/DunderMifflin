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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

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
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        if (input == true)
            userInput = JOptionPane.showInputDialog(window, panel, "Dunder Mifflin Paper Company, Inc.", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(window, panel, "Dunder Mifflin Paper Company, Inc.", JOptionPane.PLAIN_MESSAGE);
    }

    public FrameMaker (String picName){
        URL url = DunderMifflin.class.getResource("/img/" + picName);
        Icon icon = new ImageIcon(url);
        JLabel image = new JLabel(icon);
        JPanel panel = new JPanel();
        panel.add(image);
        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JOptionPane.showMessageDialog(window, panel, "Dunder Mifflin Paper Company, Inc.", JOptionPane.PLAIN_MESSAGE);
    }
    
    public FrameMaker (StringBuilder message) {
        JTextArea text = new JTextArea(message.toString());
        JPanel panel = new JPanel();
        text.setFont(new Font(Font.MONOSPACED,Font.BOLD,19));
        text.setAutoscrolls(true);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setEditable(false);
        text.setForeground(Color.LIGHT_GRAY);
        text.setBackground(Color.DARK_GRAY);
        text.setMargin(new Insets(20,20,20,20));
        JScrollPane sp = new JScrollPane(text);
        sp.setPreferredSize(new Dimension(1000,500));
        sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        panel.add(sp);
        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JOptionPane.showMessageDialog(window, panel, "Dunder Mifflin Paper Company, Inc.", JOptionPane.PLAIN_MESSAGE);
    }
    
    public String getUserInput() {
        return userInput;
    }
}
