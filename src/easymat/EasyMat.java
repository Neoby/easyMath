/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package easymat;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import launcher.Launcher;
import nButton.NButton;

/**
 *
 * @author Enrico
 */
public class EasyMat extends JFrame{
    Launcher launcher;

    public EasyMat() {
        
        launcher = new Launcher();
        initComponents();
    }
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        new EasyMat();
        
    }
    
    public void initComponents(){
        this.setSize(new Dimension(320,440));
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Launcher launcher = new Launcher();
        this.setResizable(false);
        this.add(launcher.getView());
        
        this.setVisible(true);        
    }
    
}
