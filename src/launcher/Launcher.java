/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package launcher;

import javax.swing.JPanel;

/**
 *
 * @author Enrico
 */
public class Launcher extends JPanel{
   View view;
    /**Il costruttore crea la grafica e in seguito carica la info
     
     */
    public Launcher(){
        view = new View();
        
    }
    
    public JPanel getView(){
        
        return view;
    }
    
    
    
}
