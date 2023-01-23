package com.mycompany.ch14jframesubclass;


import com.mycompany.ch14defaultjframe.*;
import com.sun.prism.paint.Color;
import javax.swing.JFrame;

public class Ch14JFrameSubclass2 extends JFrame{

    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250; 
            
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ch14JFrameSubclass2 frame = new Ch14JFrameSubclass2();
        frame.setVisible(true);
    }
    public Ch14JFrameSubclass2(){
        
        // set the frame default properties
        setTitle    ("Blue Background JFrame Subclass");
        setSize     (FRAME_WIDTH, FRAME_HEIGHT);
        setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        changeBkColor();
    }
    
    private void changeBkColor(){
        java.awt.Container contentPane = getContentPane();
        contentPane.setBackground(java.awt.Color.blue);
    }
    
}
