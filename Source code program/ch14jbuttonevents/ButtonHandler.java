/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ch14jbuttonevents;

/**
 *
 * @author HP
 */
import com.mycompany.ch14buttonhandler.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class ButtonHandler implements ActionListener {
        public ButtonHandler() {
        }
        public void actionPerformed(ActionEvent event) {
            JButton clickedButton = (JButton) event.getSource();
            JRootPane rootPane = clickedButton.getRootPane();
            Frame frame = (JFrame) rootPane.getParent();
            String buttonText = clickedButton.getText();
            frame.setTitle("You clicked" + buttonText);
        }
}