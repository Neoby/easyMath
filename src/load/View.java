/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package load;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Enrico
 */

public class View extends JPanel{
    public Color BG_COLOR= new Color(0,130,244);
    JLabel titolo, adminAccess,underTitle;
    JPanel titlePane,bottomInfo;
    
    
    public View(){
        this.setLayout(new BorderLayout());
        this.setBackground(BG_COLOR);
        URL url = null;
        
        //>LOADING GIF 
        try{
        url = new File("img/728-2.GIF").toURI().toURL();}
        catch(MalformedURLException e){
            System.err.println("Error on load View Constructor:");
            e.printStackTrace();
        }
        Icon icon = new ImageIcon(url);
        JLabel loadGIF = new JLabel(icon);
        
        //<LOADING GIF
        
        
        
        
        
        titlePane = new JPanel();
        //DEBUG
        titlePane.setBackground(new Color(60,0,84));
        titlePane.setBackground(BG_COLOR);
        titlePane.setLayout(new BorderLayout());
        
        bottomInfo = new JPanel();
        bottomInfo.setBackground(new Color(60,0,84));
        
        adminAccess = new JLabel("Loading preferences...");
        adminAccess.setFont(new Font("calibri",10,16));
        adminAccess.setForeground(Color.white);
        
        
        
        titolo = new JLabel("easyMath",JLabel.CENTER);
        titolo.setBorder(new EmptyBorder(14, 0, 0, 0) );
        titolo.setFont(new Font("calibri",20,28));
        titolo.setForeground(Color.white);
        
        underTitle = new JLabel("Un attimo per favore",JLabel.CENTER);
        underTitle.setBorder(new EmptyBorder(6, 0, 0, 0) );
        underTitle.setFont(new Font("calibri",20,18));
        underTitle.setForeground(Color.white);
        
        
        titlePane.add(titolo,BorderLayout.PAGE_START);
        titlePane.add(underTitle,BorderLayout.CENTER);
        
        bottomInfo.add(adminAccess);
        this.add(titlePane,BorderLayout.PAGE_START);
        this.add(bottomInfo,BorderLayout.PAGE_END);
        this.add(loadGIF,BorderLayout.CENTER);
        
        
        
       
        

    }
}
