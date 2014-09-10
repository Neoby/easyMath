/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculation;

/**
 *
 * @author Enrico
 */
public class Calculation {
    
    public Calculation(){
        
    }
    
    /**
     * This will create a new calc set.
     * @param Name series name
     * @param nCalc how many calculations to create
    */
    public void newSet(String Name, int nCalc){
    }
    
    /**
        Receives the set's calculation from the database.
     * @return Return an Array of Strings, each string contain a calculation
    */
    public String[] getSet(){
        //if nothing has been returned
        String[] set = new String[1];
            set[0]="[/e]"; //(Empty set report)
        return set;
    }
    
    
}
