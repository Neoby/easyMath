/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package load;

import javax.swing.JPanel;
import toolBox.SqLite;
import view.login.LogIn;
import view.login.ViewCtrl_Int;

/**
 *
 * @author Enrico
 */
public class Load {
    View view;
    /**Il costruttore crea la grafica e in seguito carica la info
     
     */
    public Load(){
        view = new View();  
    }
    
    public JPanel getView(){
        
        return view;
    }
    
    
    public boolean autenticate(String datName){
        SqLite.cUpdate("");
        return true;
    }
    
    public boolean checkIfDatabaseExists(String datName){
        SqLite.cUpdate("");
        return true;
    }
    
    public boolean createNewDatabase(String datName){
        SqLite.cUpdate("");
        return true;
    }

    public static final int LOGIN=0;
    
    public ViewCtrl_Int[] allViews() {
        LogIn logIn = new LogIn();
        
        ViewCtrl_Int[] viewCtrl = new ViewCtrl_Int[1];
        
        viewCtrl[0]=logIn;
        
        return viewCtrl;
    }
    
    
}
