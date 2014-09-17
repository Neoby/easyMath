/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package easyMath;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import load.Load;
import nButton.NButton;

/**
 *
 * @author Enrico
 */
public class EasyMath extends JFrame{
    Load launcher;

    public EasyMath() {
        
        launcher = new Load();
        initComponents();
    }
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        new EasyMath();
        
    }
    
    public void initComponents(){
        this.setSize(new Dimension(310,450));
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        this.setResizable(false);
        
        Load load = new Load();
        this.add(load.getView());
        
        this.setVisible(true);    
        
        load.checkIfDatabaseExists(" ");
        load.allNestedModels();
        System.out.println("Load Finish");
        System.out.println("Let's begin with login!");
        
    }
    
    public boolean userIsOnline(){
        return true;
    }
    
    
    
    
}
