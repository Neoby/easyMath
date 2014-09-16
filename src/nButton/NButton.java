/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nButton;

/**
 *
 * @author Enrico
 */
public class NButton{
    View view;
    
    public NButton(){
        view = new View();
    }
    
    public View getElementView(){
        return view;
    }
}
