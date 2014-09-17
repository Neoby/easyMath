/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package load;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Enrico
 */

public class View extends JPanel{
    public Color BG_COLOR= new Color(0,130,244);
    JLabel titolo, adminAccess;
    JPanel titlePane,bottomInfo;
    
    
    public View(){
        this.setLayout(new BorderLayout());
        this.setBackground(BG_COLOR);
        
        
        
        titlePane = new JPanel();
        //DEBUG
        titlePane.setBackground(new Color(60,0,84));
        titlePane.setBackground(BG_COLOR);
        
        bottomInfo = new JPanel();
        bottomInfo.setBackground(new Color(60,0,84));
        
        adminAccess = new JLabel("Creazione rapida di un test >");
        adminAccess.setFont(new Font("calibri",10,16));
        adminAccess.setForeground(Color.white);
        
        titolo = new JLabel("easyMath");
        titolo.setBorder(new EmptyBorder(14, 0, 0, 0) );
        titolo.setFont(new Font("calibri",20,28));
        titolo.setForeground(Color.white);
        
        titlePane.add(titolo);
        bottomInfo.add(adminAccess);
        this.add(titlePane,BorderLayout.PAGE_START);
        this.add(bottomInfo,BorderLayout.PAGE_END);
        
        
        
        
       
        

    }
}
