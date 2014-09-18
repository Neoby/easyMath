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
import view.login.LogIn;
import view.login.ViewCtrl_Int;

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
        this.setSize(new Dimension(280,400));
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        this.setResizable(false);
        
        Load load = new Load();
        this.getContentPane().add(load.getView());
        
        this.setVisible(true);    
        
        load.checkIfDatabaseExists(" ");
        
        //CARICAMENTO CLASSI GRAFICHE
        
        //Big load simulation
        for(double i=0;i<1000000000;i++){
        System.out.print("");
        }
        
        ViewCtrl_Int[] ctrl = load.allViews();
        this.getContentPane().add((ctrl[0]).getView());
        this.getContentPane().remove(load.getView());
        this.revalidate();
        System.out.println(ctrl[0].getView().getBackground());
        System.out.println("asd");
        
        
    }
    
    public boolean userIsOnline(){
        return true;
    }
    
    
    
    
}
