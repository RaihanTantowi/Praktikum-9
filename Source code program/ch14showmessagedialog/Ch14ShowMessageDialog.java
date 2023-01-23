package com.mycompany.ch14showmessagedialog; 
 
import javax.swing.*;  
class Ch14ShowMessageDialog {
    public static void main(String[] args) {
        JFrame jFrame;
        
        jFrame = new JFrame();
        jFrame.setSize(400,300);
        jFrame.setVisible(true);
        
        JOptionPane.showMessageDialog(jFrame, "How are you");
        
        JOptionPane.showMessageDialog(null, "Good Bye");
        
        JOptionPane.showMessageDialog(null, "one\ntwo\nthree");
        
        JOptionPane.showInputDialog(null, "Enter text");
        
        String input;
        
        input = JOptionPane.showInputDialog(null, "Enter text");
        
        String str 
                = JOptionPane.showInputDialog(null, "Enter age:");
        int age = Integer.parseInt(str);
    }
}