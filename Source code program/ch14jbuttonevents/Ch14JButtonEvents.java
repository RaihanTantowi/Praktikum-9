/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ch14jbuttonevents;

/**
 *
 * @author HP
 */
import javax.swing.*;
import java.awt.*;

class Ch14JButtonEvents extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    private JButton cancelButton;
    private JButton okButton;
    
    public static void main (String[] args) {
        Ch14JButtonEvents frame = new Ch14JButtonEvents();
        frame.setVisible(true);
    }
    public Ch14JButtonEvents() {
        Container contentPane = getContentPane();
        
        //set the frame properties
        setSize (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setTitle ("Program Ch14JButtonFrame");
        setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        //set the layout manager
        contentPane.setLayout (new FlowLayout());
        
        //create and place two buttons on the frame's content pane
        okButton = new JButton("OK");
        contentPane.add(okButton);
        
        cancelButton = new JButton("CANCEL");
        contentPane.add(okButton);
        
        //registering a ButtonHandler as an action listener of the 
        //two buttons
        ButtonHandler handler = new ButtonHandler();
        cancelButton.addActionListener(handler);
        okButton.addActionListener(handler);
        
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
   