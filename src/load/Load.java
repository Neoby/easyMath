/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package load;

import javax.swing.JPanel;
import toolBox.SqLite;

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
    public void allNestedModels(){
        System.out.println("(TEST)\tLoading...");
        for (double i =0;i<10;i++){
            System.out.print("");
        }
        System.out.println("(TEST)\tDone....");
    }
    
}
